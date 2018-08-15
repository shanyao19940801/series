package com.yao.museproxy.service.Impl;

import com.yao.museproxy.entity.Proxy;
import com.yao.museproxy.service.GetProxysService;
import com.yao.museproxy.utils.MyIOutils;
import net.sf.json.JSONArray;
import net.sf.json.JSONSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetProxysServiceImpl implements GetProxysService {

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
//         = (List<Proxy>) MyIOutils.deserializeObjectByPath(path);
        returnString = JSONSerializer.toJSON(o).toString();
        List<Proxy> list = JSONArray.toList(JSONArray.fromObject(returnString),Proxy.class);
        MyIOutils.serializeObject(list,path + "/proxys.ser");
        return returnString;
    }
}
