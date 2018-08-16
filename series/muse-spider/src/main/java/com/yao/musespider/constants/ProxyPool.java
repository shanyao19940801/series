package com.yao.musespider.constants;


import com.yao.musespider.entity.Proxy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by 单耀 on 2018/1/27.
 */
public class ProxyPool {
    //这里也可以简单粗暴的使用sychronized，因为写操作次数远大于读操作，区别并不是特别大
    public final static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public final static Set<Proxy> proxySet = new HashSet<Proxy>();

    public static DelayQueue<Proxy> proxyQueue = new DelayQueue<Proxy>();

    public static final Map<String,Class> proxyMap = new HashMap<String, Class>();

    static {
        //TODO 发送请求获取代理
    }
}
