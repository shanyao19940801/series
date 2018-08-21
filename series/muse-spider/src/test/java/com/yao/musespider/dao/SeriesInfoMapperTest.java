package com.yao.musespider.dao;

import com.yao.musespider.entity.SeriesInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeriesInfoMapperTest {

    @Autowired
    private SeriesInfoMapper seriesInfoMapper;

    @Test
    public void insert() {
        SeriesInfo seriesInfo = new SeriesInfo();
//        MuseSeriesInfo seriesInfo = new MuseSeriesInfo();
        seriesInfo.setCountry("china");
        seriesInfo.setFinish(1);
        seriesInfo.setInserttime(new Date());
        seriesInfo.setType(3);
        seriesInfo.setPageUrl("http://baidu,com");
//        seriesInfo.setId(2);
        seriesInfoMapper.insert(seriesInfo);
//        museSeriesInfoMapper.insert(seriesInfo);
    }

}