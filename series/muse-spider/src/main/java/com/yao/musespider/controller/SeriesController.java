package com.yao.musespider.controller;

import com.yao.musespider.client.RequestClient;
import com.yao.musespider.service.ISeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
//        seriesService.serieslistFinishe();
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
