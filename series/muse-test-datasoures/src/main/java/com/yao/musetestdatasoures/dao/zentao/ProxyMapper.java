package com.yao.musetestdatasoures.dao.zentao;

import com.yao.musetestdatasoures.entity.zentao.Proxy;
import com.yao.musetestdatasoures.entity.zentao.ProxyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProxyMapper {
    long countByExample(ProxyExample example);

    int deleteByExample(ProxyExample example);

    int insert(Proxy record);

    int insertSelective(Proxy record);

    List<Proxy> selectByExample(ProxyExample example);

    int updateByExampleSelective(@Param("record") Proxy record, @Param("example") ProxyExample example);

    int updateByExample(@Param("record") Proxy record, @Param("example") ProxyExample example);
}