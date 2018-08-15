package com.yao.museconsumer.controller;

import com.yao.museconsumer.service.ProxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/proxy")
public class ProxyController {

    @Autowired
    ProxyService proxyService;

    @GetMapping(value = "/getproxy")
    public String getProxys(@RequestParam Integer number) {
        return proxyService.getProxys(number);
    }
}
