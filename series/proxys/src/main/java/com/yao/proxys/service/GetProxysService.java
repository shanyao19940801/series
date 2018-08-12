package com.yao.proxys.service;

import com.yao.proxys.utils.MyIOutils;
import net.sf.json.JSONSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GetProxysService {

    @Value("${test}")
    String test;
    @Value("${proxypath}")
    String path;
    //TODO 将参数改成参数服务器
    public String getProxys(Integer number) {
        String returnString = "";
        Object o = new Object();
        if (number == null) {
            o = MyIOutils.deserializeObjectByPath(path);
        } else {

        }
        returnString = JSONSerializer.toJSON(o).toString();
        System.out.println(test);
        return returnString;
    }
}
