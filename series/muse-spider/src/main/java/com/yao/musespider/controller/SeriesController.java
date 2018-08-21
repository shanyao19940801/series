package com.yao.musespider.controller;

import com.yao.musespider.service.ISeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/series")
public class SeriesController {
    @Autowired
    ISeriesService seriesService;

    @RequestMapping("/list/finish")
    public String serieslistFinishe(){
        seriesService.serieslistFinishe();
        return "request success";
    }
}
