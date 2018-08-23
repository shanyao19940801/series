package com.yao.musetestdatasoures.controller;

import com.yao.musetestdatasoures.dao.zentao.ProxyMapper;
import com.yao.musetestdatasoures.entity.zentao.Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
    @Autowired
    ProxyMapper proxyMapper;
    @RequestMapping(value = "/test")
    public String test() {
        return "test";
    }

    @RequestMapping(value = "/proxy")
    public String proxy() {
        Proxy proxy = proxyMapper.selectById(1000);
        return "";
    }
}
