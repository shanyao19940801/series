package com.yao.musespider.controller;

import com.alibaba.fastjson.JSON;
import com.yao.musespider.client.RequestClient;
import com.yao.musespider.constants.ProxyPool;
import com.yao.musespider.entity.Proxy;
import com.yao.musespider.service.ISeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/series")
public class SeriesController {
    @Autowired
    ISeriesService seriesService;

    @Autowired
    RequestClient requestClient;

    @RequestMapping("/list/finish")
    public String serieslistFinishe(){
        String proxy = requestClient.getProxy();
        List<Proxy> proxyList = JSON.parseArray(proxy).toJavaList(Proxy.class);
        ProxyPool.proxyQueue.addAll(proxyList);
        seriesService.serieslistFinishe();
        return "request success";
    }

    @RequestMapping(value = "/test-spider")
    public String test() {
        return requestClient.test();
    }

    @RequestMapping(value = "/test01")
    public String test1(){
        return "test";
    }
}
