package com.lsy.pdf.pdfbox;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.*;
import com.smartdata360.portal.web.service.pdf.MsgInfo;
import org.apache.pdfbox.util.TextPosition;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

/**
 * Created by  liangsongying on 2019/3/24.
 */
public class BoxToItext {

    public static void main(String[] args) throws Exception {
        String filePath = "D:\\逸百年合同.pdf";
        String savePath = "D:\\img\\逸百年合同.pdf";
        MsgInfo msgInfo = new MsgInfo();
//        Map.
        msgInfo.setContentNo("contentNo");
//        msgInfo.setJiafang("jiafang");
//        msgInfo.setLegalRepresentative("legalRepresentative");
//        msgInfo.setAddr("addr");
//        msgInfo.setMobile("mobile");
        msgInfo.setYifang("乙方名称");
        msgInfo.setIdNo("1111111111111444555");
        msgInfo.setYiAddr("乙方地址");
        msgInfo.setYiMobile("13877423407");
        msgInfo.setPrice("1312.55");
        msgInfo.setTerm("12个月");
        msgInfo.setFirstAmount("531.16");
        msgInfo.setServerCost("532.16");
        msgInfo.setEveryTermAmount("521.16 ");
        msgInfo.setYear("2019");
        msgInfo.setMonth("12");
        msgInfo.setDay("09");
        msgInfo.setEveryMothOneDay("08");
        msgInfo.setJiaDay("20190807");
        msgInfo.setYiSign("D:/img/me.png");//这里必须是路径
        msgInfo.setYiSignDay("20190807");
        msgInfo.setCompanyName("companyName");
        msgInfo.setInsured("insured");
        msgInfo.setAllPerson("allPerson");
        msgInfo.setCarCode("carCode");
        List<Map<String, Object>> listParam = ParamConfig.createdParam(msgInfo);
        execute(filePath, savePath, listParam);
    }

    public static void execute(String filePath, String savePath, List<Map<String,Object>> listParam) throws Exception {
        BaseFont baseFont = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", false);
        Font font = new Font(baseFont);
        FileInputStream inputStream2 = new FileInputStream(filePath);
        PdfReader reader = new PdfReader(inputStream2);

        ResolvePosition position = new ResolvePosition();
        Map<Integer, List<PositionTextInfo>> positonMap = position.resolvePosition(filePath,listParam);

        PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(savePath));

        int count = reader.getNumberOfPages();

        for (int i = 1; i <= count; i++) {
            PdfContentByte over = stamper.getOverContent(i);
            List<PositionTextInfo> listPosition = positonMap.get(i);
//            PositionTextInfo positionTextInfo = listPosition.get(4);
            if (listPosition == null) continue;
            for (PositionTextInfo positionTextInfo : listPosition) {
                List<TextPosition> testP = positionTextInfo.getList();
                if (testP == null || testP.size()==0) continue;
                TextPosition textPosition = testP.get(testP.size()-1);
                float x = textPosition.getX();
                float y = textPosition.getY();
                ColumnText columnText = new ColumnText(over);
                //x需要往右边移动一些，移动多少自己设置
                columnText.setSimpleColumn(x+20, 0, 1000, (float) (841.92004 - y));
                Paragraph elements = new Paragraph(0, new Chunk(positionTextInfo.getValue()));
                // 设置字体，如果不设置添加的中文将无法显示
                elements.setFont(font);
                columnText.addElement(elements);
                try {
                    columnText.go();
                } catch (DocumentException e) {
                    e.printStackTrace();
                }
            }
        }
        stamper.close();
        reader.close();
        inputStream2.close();
    }
}
