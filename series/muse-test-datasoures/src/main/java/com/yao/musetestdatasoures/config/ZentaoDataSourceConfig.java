package com.yao.musetestdatasoures.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.yao.musetestdatasoures.dao.zentao", sqlSessionTemplateRef = "zentaoSqlSessionTemplate")
public class ZentaoDataSourceConfig {
    @Bean(name = "zentaoDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.zentao")
    public DataSource setDataSource() {
        return new DruidDataSource();
    }

    @Bean(name = "zentaoTransactionManager")
    public DataSourceTransactionManager setTransactionManager(@Qualifier("zentaoDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "zentaoSqlSessionFactory")
    public SqlSessionFactory setSqlSessionFactory(@Qualifier("zentaoDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/zentao/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "zentaoSqlSessionTemplate")
    public SqlSessionTemplate setSqlSessionTemplate(@Qualifier("zentaoSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
