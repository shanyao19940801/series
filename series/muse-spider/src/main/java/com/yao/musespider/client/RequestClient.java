package com.yao.musespider.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "muse-consumer")
@Component
public interface RequestClient {
    @RequestMapping(value = "/proxy/getproxy")
    public String getProxy();

    @RequestMapping(value = "/proxy/test")
    public String test();
}
