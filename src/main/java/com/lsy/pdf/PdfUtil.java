package com.lsy.pdf;

import com.alibaba.fastjson.JSON;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.List;

/**
 * Created by  liangsongying on 2019/3/8.
 */
public class PdfUtil {
    public static List<Map<String, Object>> resultList = new ArrayList<>();
    static {
        List<Map<String, Object>> dataList = new ArrayList<>();
        List<Map<String, Object>> dataList2 = new ArrayList<>();
        List<Map<String, Object>> dataList3 = new ArrayList<>();
        List<Map<String, Object>> dataList4 = new ArrayList<>();
        Map<String, Object> dataMap = new HashMap<>();
        Map<Float, Float> f = new HashMap<>();
        f.put((float) 435.35, (float) 39.90);
        dataMap.put("contentNo", f);

        Map<String, Object> dataMap2 = new HashMap<>();
        Map<Float, Float> f2 = new HashMap<>();
        f2.put((float)183, (float)150);
        dataMap2.put("jiafang", f2);

        Map<String, Object> dataMap3 = new HashMap<>();
        Map<Float, Float> f3 = new HashMap<>();
        f3.put((float)183, (float)180.23);
        dataMap3.put("legalRepresentative", f3);

        Map<String, Object> dataMap4 = new HashMap<>();
        Map<Float, Float> f4 = new HashMap<>();
        f4.put((float)183, (float)211.07);
        dataMap4.put("addr", f4);

        Map<String, Object> dataMap5 = new HashMap<>();
        Map<Float, Float> f5 = new HashMap<>();
        f5.put((float)183, (float)242);
        dataMap5.put("mobile", f5);

        Map<String, Object> dataMap6 = new HashMap<>();
        Map<Float, Float> f6 = new HashMap<>();
        f6.put((float)183, (float)271.04);
        dataMap6.put("yifang", f6);

        Map<String, Object> dataMap7 = new HashMap<>();
        Map<Float, Float> f7 = new HashMap<>();
        f7.put((float)183, (float)298.47);
        dataMap7.put("idNo", f7);

        Map<String, Object> dataMap8 = new HashMap<>();
        Map<Float, Float> f8 = new HashMap<>();
        f8.put((float)183, (float)334.15);
        dataMap8.put("yiAddr", f8);

        Map<String, Object> dataMap9 = new HashMap<>();
        Map<Float, Float> f9 = new HashMap<>();
        f9.put((float)183, (float)369.13);
        dataMap9.put("yiMobile", f9);

        Map<String, Object> dataMap10 = new HashMap<>();
        Map<Float, Float> f10 = new HashMap<>();
        f10.put((float)183, (float)432.50);
        dataMap10.put("price", f10);//328.91

        Map<String, Object> dataMap101 = new HashMap<>();
        Map<Float, Float> f101 = new HashMap<>();
        f101.put((float)328.91, (float)430.50);
        dataMap101.put("Dprice", f101);//328.91

        Map<String, Object> dataMap11 = new HashMap<>();
        Map<Float, Float> f11 = new HashMap<>();
        f11.put((float)183, (float)454.69);
        dataMap11.put("term", f11);

        Map<String, Object> dataMap12 = new HashMap<>();
        Map<Float, Float> f12 = new HashMap<>();
        f12.put((float)387.52, (float)454.69);
        dataMap12.put("firstAmount", f12);

        Map<String, Object> dataMap13 = new HashMap<>();
        Map<Float, Float> f13 = new HashMap<>();
        f13.put((float)183, (float)480.27);
        dataMap13.put("serverCost", f13);

        Map<String, Object> dataMap14 = new HashMap<>();
        Map<Float, Float> f14 = new HashMap<>();
        f14.put((float)387.52, (float)480.27);
        dataMap14.put("everyTermAmount", f14);

        Map<String, Object> dataMap15 = new HashMap<>();
        Map<Float, Float> f15 = new HashMap<>();
        f15.put((float)209.46, (float)503.60);
        dataMap15.put("year", f15);

        Map<String, Object> dataMap16 = new HashMap<>();
        Map<Float, Float> f16 = new HashMap<>();
        f16.put((float)260.95, (float)503.60);
        dataMap16.put("month", f16);

        Map<String, Object> dataMap17 = new HashMap<>();
        Map<Float, Float> f17 = new HashMap<>();
        f17.put((float)301, (float)503.60);
        dataMap17.put("day", f17);

        Map<String, Object> dataMap18 = new HashMap<>();
        Map<Float, Float> f18 = new HashMap<>();
        f18.put((float)387.52, (float)503.60);
        dataMap18.put("everyMothOneDay", f18);
        dataList.add(dataMap101);
        dataList.add(dataMap);dataList.add(dataMap2);dataList.add(dataMap3);dataList.add(dataMap4);dataList.add(dataMap5);dataList.add(dataMap6);dataList.add(dataMap7);dataList.add(dataMap8);
        dataList.add(dataMap9);dataList.add(dataMap10);dataList.add(dataMap11);dataList.add(dataMap12);dataList.add(dataMap13);dataList.add(dataMap14);dataList.add(dataMap15);
        dataList.add(dataMap16);dataList.add(dataMap17);dataList.add(dataMap18);


        Map<String, Object> dataMap19 = new HashMap<>();
        Map<Float, Float> f19 = new HashMap<>();
        f19.put((float)435.35, (float)39.90);
        dataMap19.put("contentNo", f19);//第二页合同编号
        dataList2.add(dataMap19);

        Map<String, Object> dataMap20 = new HashMap<>();
        Map<Float, Float> f20 = new HashMap<>();
        f20.put((float)435.35, (float)39.90);
        dataMap20.put("contentNo", f20);//第s三页合同编号
        dataList3.add(dataMap20);

        Map<String, Object> dataMap21 = new HashMap<>();
        Map<Float, Float> f21 = new HashMap<>();
        f21.put((float)435.35, (float)39.90);
        dataMap21.put("contentNo", f21);//第四页合同编号

        Map<String, Object> dataMap22 = new HashMap<>();
        Map<Float, Float> f22 = new HashMap<>();
        f22.put((float)143.37, (float)199.66);
        dataMap22.put("jiafang", f22);//第四页甲方

        Map<String, Object> dataMap23 = new HashMap<>();
        Map<Float, Float> f23 = new HashMap<>();
        f23.put((float)143.37, (float)233.50);
        dataMap23.put("legalRepresentative", f23);//第四页法定代表人

        Map<String, Object> dataMap24 = new HashMap<>();
        Map<Float, Float> f24 = new HashMap<>();
        f24.put((float)143.37, (float)267.12);//第四页甲方签名日期
        dataMap24.put("jiaDay", f24);

        Map<String, Object> dataMap25 = new HashMap<>();
        Map<Float, Float> f25 = new HashMap<>();
        f25.put((float)128.37, (float)371.02);//第四页乙方签名
        dataMap25.put("yiSign", f25);

        Map<String, Object> dataMap26 = new HashMap<>();
        Map<Float, Float> f26 = new HashMap<>();
        f26.put((float)143.37, (float)402.85);//第四页乙方签名日期
        dataMap26.put("yiSignDay", f26);

        Map<String, Object> dataMap27 = new HashMap<>();
        //529.31（67.75、188.51、305.35、423.17）
        Map<String, Object> dataMap271 = new HashMap<>();
        Map<Float, Float> f271 = new HashMap<>();
        f271.put((float)67.75, (float)529.31);
        dataMap271.put("companyName", f271);

        Map<String, Object> dataMap272 = new HashMap<>();
        Map<Float, Float> f272 = new HashMap<>();
        f272.put((float)188.51, (float)529.31);
        dataMap272.put("insured", f272);

        Map<String, Object> dataMap273 = new HashMap<>();
        Map<Float, Float> f273 = new HashMap<>();
        f273.put((float)307.35, (float)529.31);
        dataMap273.put("allPerson", f273);
        Map<String, Object> dataMap274 = new HashMap<>();
        Map<Float, Float> f274 = new HashMap<>();
        f274.put((float)425.17, (float)529.31);
        dataMap274.put("carCode", f274);
//        private String companyName;//受托支付保险公司名称
//        private String insured;// 被保险人名称
//        private String allPerson;// 被保车辆所有人
//        private String carCode;// 被保车辆车架号
        List<Map<String, Object>> insuranceList = new LinkedList<>();
        insuranceList.add(dataMap271);
        insuranceList.add(dataMap272);
        insuranceList.add(dataMap273);
        insuranceList.add(dataMap274);
        Map<String, Object> insuranceListMap = new HashMap<>();
        insuranceListMap.put("insuranceList", insuranceList);

//        dataMap27.put("insuranceList", f26)

        dataList4.add(dataMap271);dataList4.add(dataMap272);dataList4.add(dataMap273);dataList4.add(dataMap274);
        dataList4.add(dataMap21);dataList4.add(dataMap22);dataList4.add(dataMap23);dataList4.add(dataMap24);dataList4.add(dataMap25);dataList4.add(dataMap26);
        dataList4.add(insuranceListMap);

        Map<String, Object> reMap1 = new HashMap<>();
        Map<String, Object> reMap2 = new HashMap<>();
        Map<String, Object> reMap3 = new HashMap<>();
        Map<String, Object> reMap4 = new HashMap<>();
        reMap1.put("pageNum", 1);
        reMap1.put("listData", dataList);
        reMap2.put("pageNum", 2);
        reMap2.put("listData", dataList2);
        reMap3.put("pageNum", 3);
        reMap3.put("listData", dataList3);
        reMap4.put("pageNum", 4);
        reMap4.put("listData", dataList4);
        resultList.add(reMap1);resultList.add(reMap2);resultList.add(reMap3);resultList.add(reMap4);
    }

//529.31（67.75、188.51、305.35、423.17）
    /**
     * 往pdf添加内容
     * @param filePath
     * @param savePath
     * @param msgInfo
     * @throws IOException
     * @throws DocumentException
     */
    public static void pdfaddContent(String filePath, String savePath, MsgInfo msgInfo) throws IOException, DocumentException {
        File pdfFile = new File(filePath);
        byte[] pdfData = new byte[(int) pdfFile.length()];
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(pdfFile);
            inputStream.read(pdfData);
        } catch (IOException e) {
            throw e;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        }
        BaseFont baseFont = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", false);
        Font font = new Font(baseFont);
        FileInputStream inputStream2 = new FileInputStream(filePath);
        PdfReader reader = new PdfReader(inputStream2);

        createdParam(resultList, msgInfo);
        PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(savePath));

        int count = reader.getNumberOfPages();

        for (int i = 1; i <= count; i++) {
            PdfContentByte over = stamper.getOverContent(i);
            for (Map map : resultList) {
                if (MapUtils.getInteger(map, "pageNum") == i) {
                    List<Map<String, Object>> listData = (List<Map<String, Object>>) map.get("listData");
//                    for (listData)
                    for (Map<String, Object> x : listData) {
                        if (x.containsKey("insuranceList")) {
                            List<Map<String, Object>> insuranceList = (List<Map<String, Object>>) x.get("insuranceList");
                            insuranceList.forEach(in->{
                                String value = MapUtils.getString(in, "value");
                                Map<Float, Float> position = MapUtils.getMap(in,"position");
                                position.forEach((k,v)->{
                                    ColumnText columnText = new ColumnText(over);
                                    columnText.setSimpleColumn(k, 0, 1000, (float) (841.21 - v));
                                    Paragraph elements = new Paragraph(0, new Chunk(value));
                                    Font font1 = new Font(baseFont);
                                    font1.setSize(10);
                                    elements.setFont(font1);
                                    columnText.addElement(elements);
                                    try {
                                        columnText.go();
                                    } catch (DocumentException e) {
                                        e.printStackTrace();
                                    }
                                });
                            });
                        }else {
                            if (!x.containsKey("value") || StringUtils.isBlank( MapUtils.getString(x, "value"))) continue;
                            String value = MapUtils.getString(x, "value");
                            Map<Float, Float> position = MapUtils.getMap(x,"position");
                            if (x.containsKey("yiSign") && value != null) {
                                Image img = Image.getInstance(value);
                                img.scalePercent(25);//依照比例缩放
                                float fx = 0;float fy = 0;
                                for (Map.Entry<Float, Float> enty : position.entrySet()) {
                                    fx = enty.getKey();
                                    fy = enty.getValue();
                                }
                                img.setAbsolutePosition(fx, (float) (841.21- fy));
                                over.addImage(img);
                                continue;
                            }
                            position.forEach((k,v)->{
                                ColumnText columnText = new ColumnText(over);
                                columnText.setSimpleColumn(k, 0, 1000, (float) (841.21-v));
                                Paragraph elements = null;
                                if (x.containsKey("firstAmount") || x.containsKey("serverCost") || x.containsKey("everyTermAmount") || x.containsKey("price")) {
                                    elements = new Paragraph(0, new Chunk("￥" + value));
                                } else {
                                    elements = new Paragraph(0, new Chunk(value));
                                }
                                // 设置字体，如果不设置添加的中文将无法显示
                                if (x.containsKey("Dprice") || x.containsKey("companyName") || x.containsKey("insured") || x.containsKey("allPerson") || x.containsKey("carCode")) {
                                    Font font1 = new Font(baseFont);
                                    font1.setSize(10);
                                    elements.setFont(font1);

                                } else {
                                    elements.setFont(font);
                                }
                                columnText.addElement(elements);
                                try {
                                    columnText.go();
                                } catch (DocumentException e) {
                                    e.printStackTrace();
                                }
                            });
                        }

                    }
                }
            }
        }
        stamper.close();
        reader.close();
        inputStream2.close();
    }


    public static void createdParam(List<Map<String, Object>> resultList, MsgInfo msgInfo) {
        String jsonString = msgInfo.toString();
        Map<String, Object> objectMap = JSON.parseObject(jsonString, Map.class);
        objectMap.forEach((k,v)->{
            resultList.forEach(x->{
                List<Map<String, Object>> listData = (List<Map<String, Object>>) x.get("listData");
                listData.forEach(x2->{
                    for (Map.Entry<String, Object> entry : x2.entrySet()) {
                        x2.get("insuranceList");
                        if (entry.getKey().equals("insuranceList") && k.equals("insuranceList")) {
                            //定位里面的list
                            List<Map<String, Object>> insuranceList = (List<Map<String, Object>>) entry.getValue();
                            //还需要传输过来对象里面的里面
                            List<Map<String, Object>> objectList = (List<Map<String, Object>>) v;
                            Map<String, Object> temporary = new HashMap<>();
                            for (int i = 0; i < objectList.size(); i++) {
                                Map<String, Object> oMap = objectList.get(i);
                                for (Map.Entry<String, Object> oEntry : oMap.entrySet()) {
                                    if (i == 0) {
                                        insuranceList.forEach(insuranceMap -> {
                                            if (insuranceMap.containsKey(oEntry.getKey())) {
                                                insuranceMap.put("value", oEntry.getValue());
                                                insuranceMap.put("position", insuranceMap.get(oEntry.getKey()));
                                                temporary.put(oEntry.getKey(), insuranceMap.get(oEntry.getKey()));
                                            }
                                        });
                                    } else {
                                        //temporary里面有四个(k,v)
                                        Map<Float, Float> positionMap = (Map<Float, Float>) temporary.get(oEntry.getKey());
                                        if (positionMap==null) continue;
                                        Map<Float, Float> newPosition = new HashMap<>();

                                        int finalI = i;
                                        positionMap.forEach((kk, vv)->{
                                            newPosition.put(kk, vv+ finalI *18);
                                        });
                                        Map<String, Object> inMap = new HashMap<>();
                                        inMap.put("value", oEntry.getValue());
                                        inMap.put("position",newPosition );
                                        insuranceList.add(inMap);
                                    }
                                }
                            }
                        }
                        if (entry.getKey().equals(k) && !entry.getKey().equals("insuranceList")) {
                            x2.put("value", v);
                            x2.put("position", entry.getValue());
                        }
                        break;
                    }
                });
            });
        });
    }

}
