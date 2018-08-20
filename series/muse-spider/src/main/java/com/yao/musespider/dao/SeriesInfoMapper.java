package com.yao.musespider.dao;

import com.yao.musespider.entity.SeriesInfo;
import com.yao.musespider.entity.SeriesInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeriesInfoMapper {
    int countByExample(SeriesInfoExample example);

    int deleteByExample(SeriesInfoExample example);

    int insert(SeriesInfo record);

    int insertSelective(SeriesInfo record);

    List<SeriesInfo> selectByExample(SeriesInfoExample example);

    int updateByExampleSelective(@Param("record") SeriesInfo record, @Param("example") SeriesInfoExample example);

    int updateByExample(@Param("record") SeriesInfo record, @Param("example") SeriesInfoExample example);
}