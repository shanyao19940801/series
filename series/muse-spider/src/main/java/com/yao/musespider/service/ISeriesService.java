package com.yao.musespider.service;

import com.yao.musespider.entity.SeriesInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ISeriesService {

    public void insertSeriesList(List<SeriesInfo> list);

    void serieslistFinishe();
}
