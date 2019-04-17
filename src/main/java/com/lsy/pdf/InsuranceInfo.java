package com.lsy.pdf;

/**
 * Created by  liangsongying on 2019/4/8.
 */
public class InsuranceInfo {
    private String companyName;//受托支付保险公司名称
    private String insured;// 被保险人名称
    private String allPerson;// 被保车辆所有人
    private String carCode;// 被保车辆车架号
    private float height;  //偏移高度

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getInsured() {
        return insured;
    }

    public void setInsured(String insured) {
        this.insured = insured;
    }

    public String getAllPerson() {
        return allPerson;
    }

    public void setAllPerson(String allPerson) {
        this.allPerson = allPerson;
    }

    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"companyName\":\"").append(companyName).append('\"');
        sb.append(",\"insured\":\"").append(insured).append('\"');
        sb.append(",\"allPerson\":\"").append(allPerson).append('\"');
        sb.append(",\"carCode\":\"").append(carCode).append('\"');
        sb.append(",\"height\":").append(height);
        sb.append('}');
        return sb.toString();
    }
}
