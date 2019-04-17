package com.lsy.pdf.pdfbox;

import com.alibaba.fastjson.JSON;
import com.smartdata360.portal.common.utils.MapUtils;
import com.smartdata360.portal.web.service.pdf.MsgInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by  liangsongying on 2019/3/26.
 */
public class ParamConfig {
    private final static Map<String,Object> constantMap=new HashMap<>();
    static {
        Map<String, Object> pMap1 = new HashMap<>();
        pMap1.put("contentNo", "合同编号：");
//        pMap1.put("startPosition", "1");
//        pMap1.put("x", );
//        pMap1.put("y", );
//        pMap1.put("zoom", );
//        pMap1.put("howNumber", );
        constantMap.put("contentNo",pMap1);

        Map<String, Object> pMap2 = new HashMap<>();
        pMap2.put("yifang","应收账款转让人：");
//        pMap2.put("startPosition", "1");
//        pMap2.put("x", );
//        pMap2.put("y", );
//        pMap2.put("zoom", );
//        pMap2.put("howNumber", );
        constantMap.put("yifang",pMap2);

        Map<String, Object> pMap3 = new HashMap<>();
        pMap3.put("idNo","个人身份证号码：");
//        pMap3.put("startPosition", "1");
//        pMap3.put("x", );
//        pMap3.put("y", );
//        pMap3.put("zoom", );
//        pMap3.put("howNumber", );
        constantMap.put("idNo",pMap3);
        Map<String, Object> pMap4 = new HashMap<>();
        pMap4.put("yiAddr","：联系地址：");
//        pMap4.put("startPosition", "1");
//        pMap4.put("x", );
//        pMap4.put("y", );
//        pMap4.put("zoom", );
//        pMap4.put("howNumber", );
        constantMap.put("yiAddr",pMap4);

        Map<String, Object> pMap5 = new HashMap<>();
        pMap5.put("yiMobile","：联系电话：");
//        pMap5.put("startPosition", "1");
//        pMap5.put("x", );
//        pMap5.put("y", );
//        pMap5.put("zoom", );
//        pMap5.put("howNumber", );
        constantMap.put("yiMobile",pMap5);

        Map<String, Object> pMap6 = new HashMap<>();
        pMap6.put("price","应收账款购买价格：");
//        pMap6.put("startPosition", "1");
//        pMap6.put("x", );
//        pMap6.put("y", );
//        pMap6.put("zoom", );
//        pMap6.put("howNumber", );
        constantMap.put("price",pMap6);

        Map<String, Object> pMap7 = new HashMap<>();
        pMap7.put("Dprice","大写：人民币");
//        pMap7.put("startPosition", "1");
//        pMap7.put("x", );
//        pMap7.put("y", );
//        pMap7.put("zoom", );
//        pMap7.put("howNumber", );
        constantMap.put("Dprice",pMap7);

        Map<String, Object> pMap8 = new HashMap<>();
        pMap8.put("term","应收账款回收期限：");
//        pMap8.put("startPosition", "1");
//        pMap8.put("x", );
//        pMap8.put("y", );
//        pMap8.put("zoom", );
//        pMap8.put("howNumber", );
        constantMap.put("term",pMap8);

        Map<String, Object> pMap9 = new HashMap<>();
        pMap9.put("firstAmount","首期支付金额：");
//        pMap9.put("startPosition", "1");
//        pMap9.put("x", );
//        pMap9.put("y", );
//        pMap9.put("zoom", );
//        pMap9.put("howNumber", );
        constantMap.put("firstAmount",pMap9);

        Map<String, Object> pMap10 = new HashMap<>();
        pMap10.put("serverCost","保理服务费：");
//        pMap10.put("startPosition", "1");
//        pMap10.put("x", );
//        pMap10.put("y", );
//        pMap10.put("zoom", );
//        pMap10.put("howNumber", );
        constantMap.put("serverCost",pMap10);

        Map<String, Object> pMap11 = new HashMap<>();
        pMap11.put("everyTermAmount","每期回收金额：");
//        pMap11.put("startPosition", "1");
//        pMap11.put("x", );
//        pMap11.put("y", );
//        pMap11.put("zoom", );
//        pMap11.put("howNumber", );
        constantMap.put("everyTermAmount",pMap11);

        Map<String, Object> pMap12 = new HashMap<>();
        pMap12.put("year","应收账款回收计划：于");
//        pMap12.put("startPosition", "1");
//        pMap12.put("x", );
//        pMap12.put("y", );
//        pMap12.put("zoom", );
//        pMap12.put("howNumber", );
        constantMap.put("year",pMap12);

        Map<String, Object> pMap13 = new HashMap<>();
        pMap13.put("month","于年");
//        pMap13.put("startPosition", "1");
//        pMap13.put("x", );
//        pMap13.put("y", );
//        pMap13.put("zoom", );
//        pMap13.put("howNumber", );
        constantMap.put("month",pMap13);

        Map<String, Object> pMap14 = new HashMap<>();
        pMap14.put("day","于年月");
//        pMap14.put("startPosition", "1");
//        pMap14.put("x", );
//        pMap14.put("y", );
//        pMap14.put("zoom", );
//        pMap14.put("howNumber", );
        constantMap.put("day",pMap14);

        Map<String, Object> pMap15 = new HashMap<>();
        pMap15.put("everyMothOneDay","，每月");
//        pMap15.put("startPosition", "1");
//        pMap15.put("x", );
//        pMap15.put("y", );
//        pMap15.put("zoom", );
//        pMap15.put("howNumber", );
        constantMap.put("everyMothOneDay",pMap15);


        Map<String, Object> pMap16 = new HashMap<>();
        pMap16.put("yiSign","乙方：");
//        pMap16.put("startPosition", "1");
//        pMap16.put("x", );
//        pMap16.put("y", );
//        pMap16.put("zoom", );
//        pMap16.put("howNumber", );
        constantMap.put("yiSign",pMap16);

        Map<String, Object> pMap17 = new HashMap<>();
        pMap17.put("yiSignDay","日期：");
//        pMap17.put("startPosition", "1");
//        pMap17.put("x", );
//        pMap17.put("y", );
//        pMap17.put("zoom", );
//        pMap17.put("howNumber", );
        constantMap.put("yiSignDay",pMap17);

        Map<String, Object> pMap18 = new HashMap<>();
        pMap18.put("companyName", "受托支付保险公司名称");
//        pMap18.put("startPosition", "1");
//        pMap18.put("x", );
//        pMap18.put("y", );
//        pMap18.put("zoom", );
//        pMap18.put("howNumber", );
        constantMap.put("companyName", pMap18);

        Map<String, Object> pMap19 = new HashMap<>();
        pMap19.put("insured","被保险人名称");
//        pMap19.put("startPosition", "1");
//        pMap19.put("x", );
//        pMap19.put("y", );
//        pMap19.put("zoom", );
//        pMap19.put("howNumber", );
        constantMap.put("insured",pMap19);

        Map<String, Object> pMap20 = new HashMap<>();
        pMap20.put("allPerson","被保车辆所有人");
//        pMap20.put("startPosition", "1");
//        pMap20.put("x", );
//        pMap20.put("y", );
//        pMap20.put("zoom", );
//        pMap20.put("howNumber", );
        constantMap.put("allPerson",pMap20);

        Map<String, Object> pMap21 = new HashMap<>();
        pMap21.put("carCode", "被保车辆车架号");
//        pMap21.put("startPosition", "1");
//        pMap21.put("x", );
//        pMap21.put("y", );
//        pMap21.put("zoom", );
//        pMap21.put("howNumber", );
        constantMap.put("carCode", pMap21);

    }

    /**
     * 根据请求参数
     * @param msgInfo
     * @return
     */
    public static List<Map<String, Object>> createdParam(MsgInfo msgInfo) {
        List<Map<String, Object>> resList = new ArrayList<>();
        String msgString = msgInfo.toString();
        Map<String, String> msgMap = JSON.parseObject(msgString, Map.class);
        msgMap.forEach((k,v)->{
            Map<String, Object> oMap = (Map<String, Object>) MapUtils.getObject(constantMap, k);
            String name = MapUtils.getString(oMap, k);
            if (name != null) {
                Map<String, Object> paramMap = new HashMap<>();
                paramMap.put("name", name);
                paramMap.put("value", v);
                paramMap.put("code", k);
                if(MapUtils.getInteger(oMap, "howNumber") !=null)  paramMap.put("howNumber", MapUtils.getInteger(oMap, "howNumber"));

                resList.add(paramMap);
            }
        });
        return resList;

    }
}
