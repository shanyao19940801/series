package com.yao.musetestdatasource1.config;

import com.netflix.servo.annotations.DataSourceType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataSourceContextHolder {
    private static Logger logger = LoggerFactory.getLogger(DataSourceContextHolder.class);
    private static final ThreadLocal<String> local = new ThreadLocal<String>();

    public static ThreadLocal<String> getLocal() {
        return local;
    }

    /**
     * 读可能是多个库
     */
    public static void read() {
//        local.set(DataSourceType.);
        logger.info("数据库切换到读库...");
    }
}
