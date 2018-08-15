package com.yao.museproxy.service.Impl;

import com.yao.museproxy.entity.Proxy;
import com.yao.museproxy.service.GetProxysService;
import com.yao.museproxy.utils.MyIOutils;
import net.sf.json.JSONArray;
import net.sf.json.JSONSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetProxysServiceImpl implements GetProxysService {

    @Value("${proxypath}")
    String path;
    //TODO 将参数改成参数服务器
    public String getProxys(Integer number) {
        String returnString = "";
        List<Proxy> list = (List<Proxy>) MyIOutils.deserializeObjectByPath(path);
        if (number == null) {

        } else {
            list = list.subList(0,number);
        }
        returnString = JSONSerializer.toJSON(list).toString();
        return returnString;
    }
}
