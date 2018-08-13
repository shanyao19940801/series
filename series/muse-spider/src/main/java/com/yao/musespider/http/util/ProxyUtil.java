package com.yao.musespider.http.util;


import com.yao.musespider.entity.Proxy;

public class ProxyUtil {
    /**
     * 是否丢弃代理
     * 失败次数大于３丢弃
     */
    public static boolean isDiscardProxy(Proxy proxy){
        int succTimes = proxy.getSuccessfulTimes();
        int failTimes = proxy.getFailureTimes();
        if(failTimes >= 3){
            return true;
        }
        return false;
    }
}
