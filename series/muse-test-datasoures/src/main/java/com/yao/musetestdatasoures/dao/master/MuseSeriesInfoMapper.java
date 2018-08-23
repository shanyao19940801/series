package com.yao.musetestdatasoures.dao.master;

import com.yao.musetestdatasoures.entity.MuseSeriesInfo;
import com.yao.musetestdatasoures.entity.MuseSeriesInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuseSeriesInfoMapper {
    long countByExample(MuseSeriesInfoExample example);

    int deleteByExample(MuseSeriesInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MuseSeriesInfo record);

    int insertSelective(MuseSeriesInfo record);

    List<MuseSeriesInfo> selectByExample(MuseSeriesInfoExample example);

    MuseSeriesInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MuseSeriesInfo record, @Param("example") MuseSeriesInfoExample example);

    int updateByExample(@Param("record") MuseSeriesInfo record, @Param("example") MuseSeriesInfoExample example);

    int updateByPrimaryKeySelective(MuseSeriesInfo record);

    int updateByPrimaryKey(MuseSeriesInfo record);
}