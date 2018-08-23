package com.yao.musetestdatasoures.dao.master;

import com.yao.musetestdatasoures.entity.SeriesInfo;
import com.yao.musetestdatasoures.entity.SeriesInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SeriesInfoMapper {
    int countByExample(SeriesInfoExample example);

    int deleteByExample(SeriesInfoExample example);

    int insert(SeriesInfo record);

    int insertSelective(SeriesInfo record);

    List<SeriesInfo> selectByExample(SeriesInfoExample example);

    int updateByExampleSelective(@Param("record") SeriesInfo record, @Param("example") SeriesInfoExample example);

    int updateByExample(@Param("record") SeriesInfo record, @Param("example") SeriesInfoExample example);

    void insertList(@Param("list") List<SeriesInfo> list);
}