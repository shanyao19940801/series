package com.yao.musespider.service.impl;

import com.yao.musespider.dao.SeriesInfoMapper;
import com.yao.musespider.entity.SeriesInfo;
import com.yao.musespider.service.ISeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesServiceImpl implements ISeriesService {

    @Autowired
    SeriesInfoMapper seriesInfoMapper;

    @Override
    public void insertSeriesList(List<SeriesInfo> list) {
        seriesInfoMapper.insertList(list);
    }
}
