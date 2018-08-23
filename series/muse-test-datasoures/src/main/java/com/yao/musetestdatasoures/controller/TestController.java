package com.yao.musetestdatasoures.controller;

import com.yao.musetestdatasoures.dao.master.MuseSeriesInfoMapper;
import com.yao.musetestdatasoures.dao.master.SeriesInfoMapper;
import com.yao.musetestdatasoures.dao.zentao.ProxyMapper;
import com.yao.musetestdatasoures.entity.MuseSeriesInfo;
import com.yao.musetestdatasoures.entity.SeriesInfo;
import com.yao.musetestdatasoures.entity.zentao.Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
    @Autowired
    ProxyMapper proxyMapper;
    @Autowired
    MuseSeriesInfoMapper seriesInfoMapper;
    @RequestMapping(value = "/test")
    public String test() {
        return "test";
    }

    @RequestMapping(value = "/proxy")
    public String proxy() {
        Proxy proxy = proxyMapper.selectByPrimaryKey(1000);
        return "proxy";
    }

    @RequestMapping(value = "/series")
    public String serise() {
        MuseSeriesInfo seriesInfo =  seriesInfoMapper.selectByPrimaryKey(101046);
        return "series";
    }
}
