package com.lsy.pdf.pdfbox;

import org.apache.pdfbox.util.TextPosition;

import java.util.List;

/**
 * Created by  liangsongying on 2019/3/24.
 */
public class PositionTextInfo {
    private String code;
    private String name;
    private List<TextPosition> list;
    private String[] text;
    private Integer num;
    private String value;
    private String startPosition;//取值前中后
    private float x;//左右偏移距离单位为：点
    private float y;//上下偏移距离单位为：点
    private Integer zoom;//缩放
    private Boolean selected; //mock字段
    private Integer howNumber;//一个页面关键字有几个；这个字段是位于第几个

    public Integer getHowNumber() {
        return howNumber;
    }

    public void setHowNumber(Integer howNumber) {
        this.howNumber = howNumber;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public String getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(String startPosition) {
        this.startPosition = startPosition;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Integer getZoom() {
        return zoom;
    }

    public void setZoom(Integer zoom) {
        this.zoom = zoom;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.text=name.split("");
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<TextPosition> getList() {
        return list;
    }

    public void setList(List<TextPosition> list) {
        this.list = list;
    }

    public String[] getText() {
        return text;
    }

    public void setText(String[] text) {
        this.text = text;
    }

    public static void main(String[] args) {
        String s = "合同编号：";
        String[] arr = s.split("");
        System.out.println(arr);
    }
}
