package com.lsy.pdf;

import java.util.List;

/**
 * Created by  liangsongying on 2019/3/8.
 */
public class MsgInfo {

    private String contentNo;//(float)435.35, (float)41.90));//合同编号：
    private String jiafang;//(float)183, (float)150));//甲方（应收账款受让人：）
    private String legalRepresentative;//(float)183, (float)180.23));//法定代表人：
    private String addr;//(float)183, (float)211.07));联系地址：
    private String mobile;//(float)183, (float)244.12));联系电话：
    private String yifang;//(float)183, (float)271.64));应收账款转让人：
    private String idNo;//(float)183, (float)298.47));个人身份证号码：
    private String yiAddr;//(float)183, (float)335.15));联系地址：
    private String yiMobile;//(float)183, (float)370.03));联系电话：
    private String price;//(float)183, (float)433.70));应收账款购买价格：（大写：人民币）
    private String Dprice;//(float)183, (float)433.70));应收账款购买价格：（大写：人民币）
    private String term;//(float)183, (float)454.69));应收账款回收期限：
    private String firstAmount;//(float)387.52, (float)454.69));//首期支付金额：
    private String serverCost;//(float)183, (float)480.87));//保理服务费：
    private String everyTermAmount;//(float)387.52, (float)480.87));每期回收金额：
    private String year;//(float)209.46, (float)503.60));应收账款回收计划：（年）
    private String month;//float)260.95, (float)503.60));应收账款回收计划：（月）
    private String day;//(float)301, (float)503.60));应收账款回收计划：（日）
    private String everyMothOneDay;//(float)387.52, (float)503.60));每月 日分期回收（日）
    private String jiaDay;//(float)143.37, (float)267.72));//第四页甲方签名日期
    private String yiSign;//(float)143.37, (float)341.02));//第四页乙方签名---这里必须是图片路径
    private String yiSignDay;//(float)143.37, (float)403.35));//第四页乙方签名日期
    private String companyName;//受托支付保险公司名称
    private String insured;// 被保险人名称
    private String allPerson;// 被保车辆所有人
    private String carCode;// 被保车辆车架号
    private List<InsuranceInfo> insuranceList;


    public List<InsuranceInfo> getInsuranceInfo() {
        return insuranceList;
    }

    public void setInsuranceInfo(List<InsuranceInfo> insuranceInfo) {
        this.insuranceList = insuranceInfo;
    }

    public String getDprice() {
        return Dprice;
    }

    public void setDprice(String dprice) {
        Dprice = dprice;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setInsured(String insured) {
        this.insured = insured;
    }

    public void setAllPerson(String allPerson) {
        this.allPerson = allPerson;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    public void setContentNo(String contentNo) {
        this.contentNo = contentNo;
    }

    public void setJiafang(String jiafang) {
        this.jiafang = jiafang;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setYifang(String yifang) {
        this.yifang = yifang;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public void setYiAddr(String yiAddr) {
        this.yiAddr = yiAddr;
    }

    public void setYiMobile(String yiMobile) {
        this.yiMobile = yiMobile;
    }

    public void setPrice(String price) {
        this.price = price;
        this.Dprice = CnNumberUtils.toUppercase(price);
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setFirstAmount(String firstAmount) {
        this.firstAmount = firstAmount;
    }

    public void setServerCost(String serverCost) {
        this.serverCost = serverCost;
    }

    public void setEveryTermAmount(String everyTermAmount) {
        this.everyTermAmount = everyTermAmount;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setEveryMothOneDay(String everyMothOneDay) {
        this.everyMothOneDay = everyMothOneDay;
    }

    public void setJiaDay(String jiaDay) {
        this.jiaDay = jiaDay;
    }

    public void setYiSign(String yiSign) {
        this.yiSign = yiSign;
    }

    public void setYiSignDay(String yiSignDay) {
        this.yiSignDay = yiSignDay;
    }

    public String getContentNo() {
        return contentNo;
    }

    public String getJiafang() {
        return jiafang;
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public String getAddr() {
        return addr;
    }

    public String getMobile() {
        return mobile;
    }

    public String getYifang() {
        return yifang;
    }

    public String getIdNo() {
        return idNo;
    }

    public String getYiAddr() {
        return yiAddr;
    }

    public String getYiMobile() {
        return yiMobile;
    }

    public String getPrice() {
        return price;
    }

    public String getTerm() {
        return term;
    }

    public String getFirstAmount() {
        return firstAmount;
    }

    public String getServerCost() {
        return serverCost;
    }

    public String getEveryTermAmount() {
        return everyTermAmount;
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getEveryMothOneDay() {
        return everyMothOneDay;
    }

    public String getJiaDay() {
        return jiaDay;
    }

    public String getYiSign() {
        return yiSign;
    }

    public String getYiSignDay() {
        return yiSignDay;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getInsured() {
        return insured;
    }

    public String getAllPerson() {
        return allPerson;
    }

    public String getCarCode() {
        return carCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        if(this.contentNo != null) sb.append("\"contentNo\":\"").append(contentNo).append('\"');
        if(this.jiafang != null) sb.append(",\"jiafang\":\"").append(jiafang).append('\"');
        if(this.legalRepresentative != null) sb.append(",\"legalRepresentative\":\"").append(legalRepresentative).append('\"');
        if(this.addr != null) sb.append(",\"addr\":\"").append(addr).append('\"');
        if(this.mobile != null) sb.append(",\"mobile\":\"").append(mobile).append('\"');
        if(this.yifang != null) sb.append(",\"yifang\":\"").append(yifang).append('\"');
        if(this.idNo != null) sb.append(",\"idNo\":\"").append(idNo).append('\"');
        if(this.yiAddr != null) sb.append(",\"yiAddr\":\"").append(yiAddr).append('\"');
        if(this.yiMobile != null) sb.append(",\"yiMobile\":\"").append(yiMobile).append('\"');
        if(this.price != null) sb.append(",\"price\":\"").append(price).append('\"');
        if(this.Dprice != null) sb.append(",\"Dprice\":\"").append(Dprice).append('\"');
        if(this.term != null) sb.append(",\"term\":\"").append(term).append('\"');
        if(this.firstAmount != null) sb.append(",\"firstAmount\":\"").append(firstAmount).append('\"');
        if(this.serverCost != null) sb.append(",\"serverCost\":\"").append(serverCost).append('\"');
        if(this.everyTermAmount != null) sb.append(",\"everyTermAmount\":\"").append(everyTermAmount).append('\"');
        if(this.year != null) sb.append(",\"year\":\"").append(year).append('\"');
        if(this.month != null) sb.append(",\"month\":\"").append(month).append('\"');
        if(this.day != null) sb.append(",\"day\":\"").append(day).append('\"');
        if(this.everyMothOneDay != null) sb.append(",\"everyMothOneDay\":\"").append(everyMothOneDay).append('\"');
        if(this.jiaDay != null) sb.append(",\"jiaDay\":\"").append(jiaDay).append('\"');
        if(this.yiSign != null) sb.append(",\"yiSign\":\"").append(yiSign).append('\"');
        if(this.yiSignDay != null) sb.append(",\"yiSignDay\":\"").append(yiSignDay).append('\"');
//        if(this.companyName != null) sb.append(",\"companyName\":\"").append(companyName).append('\"');
//        if(this.insured != null) sb.append(",\"insured\":\"").append(insured).append('\"');
//        if(this.allPerson != null) sb.append(",\"allPerson\":\"").append(allPerson).append('\"');
//        if(this.carCode != null) sb.append(",\"carCode\":\"").append(carCode).append('\"');
        if (this.insuranceList !=null) sb.append(",\"insuranceList\":").append(insuranceList);
        sb.append('}');
        return sb.toString();
    }
}
