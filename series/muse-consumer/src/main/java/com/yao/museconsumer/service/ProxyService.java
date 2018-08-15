package com.yao.museconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProxyService {
    @Autowired
    RestTemplate restTemplate;

    public String getProxys(Integer integer) {
        //TODO 这里的地址改为配置服务器
        return restTemplate.getForObject("http://MUSE-PROXY/proxy/getproxy",String.class);
    }
}
