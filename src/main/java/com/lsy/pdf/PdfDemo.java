package com.lsy.pdf;

import com.itextpdf.text.DocumentException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by  liangsongying on 2019/3/11.
 */
public class PdfDemo {

    public static void main(String[] args) throws IOException, DocumentException {

        String filePath = "D:\\逸百年合同.pdf";
        String savePath = "D:\\img\\逸百年合同.pdf";
        MsgInfo msgInfo = new MsgInfo();
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
//        msgInfo.setCompanyName("companyName");
//        msgInfo.setInsured("insured");
//        msgInfo.setAllPerson("allPerson");
//        msgInfo.setCarCode("carCode");
        InsuranceInfo insuranceInfo = new InsuranceInfo();
        insuranceInfo.setCompanyName("companyName");
        insuranceInfo.setInsured("insured");
        insuranceInfo.setAllPerson("allPerson");
        insuranceInfo.setCarCode("carCode");
        List<InsuranceInfo> list = new ArrayList<>();
        list.add(insuranceInfo);
        InsuranceInfo insuranceInfo2 = new InsuranceInfo();
        insuranceInfo2.setCompanyName("xxxx");
        insuranceInfo2.setInsured("dddd");
        insuranceInfo2.setAllPerson("fff");
        insuranceInfo2.setCarCode("aaa");
        list.add(insuranceInfo2);
        System.out.println(msgInfo.toString());
        msgInfo.setInsuranceInfo(list);

        PdfUtil.pdfaddContent(filePath,savePath,msgInfo);
    }
}
