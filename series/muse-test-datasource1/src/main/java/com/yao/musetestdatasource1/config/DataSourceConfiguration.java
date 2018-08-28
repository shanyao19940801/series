package com.yao.musetestdatasource1.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataSourceConfiguration {
    private static Logger logger = LoggerFactory.getLogger(DataSourceConfiguration.class);

    @Value("${spring.datasource.type}")
    private Class<? extends DataSource> dataSourceType;

    @Bean(name = "writeDataSource", destroyMethod = "close", initMethod = "init")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.master")
    public DataSource writeDataSource() {
        logger.info("-------------------- writeDataSource init ---------------------");
        return DataSourceBuilder.create().type(dataSourceType).build();
    }

    /**
     * 有多少个从库就要配置多少个
     * @return
     */
    @Bean(name = "readDataSource", destroyMethod = "close", initMethod="init")
    @ConfigurationProperties(prefix = "spring.slave")
    public DataSource readDataSourceOne() {
        logger.info("-------------------- readDataSourceOne init ---------------------");
        return DataSourceBuilder.create().type(dataSourceType).build();
    }

    /**
     * 这里的list是多个从库的情况下为了实现简单负载均衡
     * @return
     * @throws SQLException
     */
    @Bean("readDataSource")
    public List<DataSource> readDataSources() {
        List<DataSource> dataSources = new ArrayList<>();
        dataSources.add(readDataSourceOne());
        return dataSources;
    }




}
