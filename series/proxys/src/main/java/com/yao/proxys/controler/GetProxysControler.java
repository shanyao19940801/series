package com.yao.proxys.controler;

import com.yao.proxys.service.GetProxysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/proxy")
public class GetProxysControler {
    @Autowired
    GetProxysService getProxysService;

    @GetMapping(value = "/getproxy")
    public String getProxys(@RequestParam(value = "number", required = false) Integer number) {
        return getProxysService.getProxys(number);
    }



}
