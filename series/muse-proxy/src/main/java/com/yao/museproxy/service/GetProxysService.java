package com.yao.museproxy.service;

import com.yao.museproxy.utils.MyIOutils;
import net.sf.json.JSONSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

public interface GetProxysService {

    //TODO 将参数改成参数服务器
    public String getProxys(Integer number);
}
