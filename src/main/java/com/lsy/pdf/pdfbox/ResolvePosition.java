package com.lsy.pdf.pdfbox;

import com.smartdata360.portal.common.utils.MapUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDStream;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.pdfbox.util.TextPosition;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by  liangsongying on 2019/3/24.
 */
public class ResolvePosition extends PDFTextStripper {
    static List<Float> list_postion = new ArrayList<Float>();
    static List<String> list_text = new ArrayList<String>();

    private static Map<String, Object> res = new HashMap<>();
    private static Map<Integer,List<PositionTextInfo>> posMap = new HashMap<>();
    private static Integer index = 0;


    public static void combinationParam(List<PositionTextInfo> posiList, List<Map<String,Object>> listParam) {
        //listParam的map里面包含 code、name、value;
        // name代表文字需要定位的文字、code为name文字的编号、value为往需要定位文字添加的值
        listParam.forEach(x->{
            String code = MapUtils.getString(x,"code");
            String name = MapUtils.getString(x,"name");
            String value = MapUtils.getString(x,"value");
            String startPosition = MapUtils.getString(x, "startPosition");//取值前中后
            Float xP= MapUtils.getFloat(x, "x");//左右偏移距离单位为：点
            Float yP= MapUtils.getFloat(x, "y");//上下偏移距离单位为：点
            Integer zoom= MapUtils.getInteger(x, "zoom");//缩放
            PositionTextInfo positionTextInfo = new PositionTextInfo();
            positionTextInfo.setName(name);
            positionTextInfo.setValue(value);
            positionTextInfo.setCode(code);
            if (startPosition!=null) positionTextInfo.setStartPosition(startPosition);
            if (xP!=null) positionTextInfo.setX(xP);
            if (yP!=null) positionTextInfo.setY(yP);
            if (zoom!=null) positionTextInfo.setZoom(zoom);
            posiList.add(positionTextInfo);
        });
    }

    public ResolvePosition() throws IOException {
        super.setSortByPosition(true);
    }

    public static void main(String[] args) {
        String filePath = "D:\\逸百年合同.pdf";
    }

    public Map<Integer,List<PositionTextInfo>> resolvePosition(String filePath, List<Map<String,Object>> listParam) throws Exception {

        PDDocument document = null;
        try {
            File input = new File(filePath);
            document = PDDocument.load(input);
            if (document.isEncrypted()) {
                document.decrypt("");
            }
//            ResolvePosition printer = new ResolvePosition();
            List allPages = document.getDocumentCatalog().getAllPages();
            for (int i = 0; i < allPages.size(); i++) {
                index = i+1;
                PDPage page = (PDPage) allPages.get(i);
                System.out.println("Processing page: " + i);
                List<PositionTextInfo> list = new ArrayList<>();
                combinationParam(list,listParam);
                posMap.put(i+1, list);
                PDStream contents = page.getContents();
                if (contents != null) {
                    processStream(page, page.findResources(), page.getContents().getStream());
                }
            }
        } finally {
            if (document != null) {
                document.close();
            }
        }
        posMap.forEach((k,v)->{
            System.out.println("页数为：" + k);
            v.forEach(p->{
                List<TextPosition> text=p.getList();
                if (text != null) {
                    text.forEach(t -> {
                        System.out.println("X" + t.getX() + ";" + "Y" + t.getY());
                    });
                }
            });
        });
        return posMap;
    }

    /**
     * @param text The text to be processed
     */
    @Override /* this is questionable, not sure if needed... */
    protected void processTextPosition(TextPosition text) {
        String s = text.toString();
        List<PositionTextInfo> positionList = posMap.get(index);
        if (index == 4) {
            System.out.println("dhhh");
        }
        for (int i = 0; i < positionList.size(); i++) {
            PositionTextInfo positionTextInfo = positionList.get(i);
            String[] arr = positionTextInfo.getText();
            if (positionTextInfo.getSelected()!=null && positionTextInfo.getSelected()) continue;
            List<TextPosition> list = positionTextInfo.getList();

            if ((list == null || list.size() == 0)) {
                if (s.equals(arr[0])) {
                    list = new ArrayList<>();
                    list.add(text);
                    positionTextInfo.setList(list);
                }

            } else {

                if (arr.length > list.size() && s.equals(arr[list.size()])) {
                    list.add(text);
                    positionTextInfo.setList(list);
                    if (arr.length == list.size()) {
                        positionTextInfo.setSelected(true);
                    }
                }else {
                    if (arr.length > list.size() && !s.equals(arr[list.size()]) && (positionTextInfo.getSelected() == null || !positionTextInfo.getSelected())) {
                        positionTextInfo.setList(null);
                    }
                }

            }
        }
    }

}
