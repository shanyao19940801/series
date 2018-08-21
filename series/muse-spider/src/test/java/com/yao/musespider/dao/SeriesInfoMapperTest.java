package com.yao.musespider.dao;

import com.yao.musespider.entity.SeriesInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeriesInfoMapperTest {

    @Autowired
    private SeriesInfoMapper seriesInfoMapper;

    @Test
    public void insert() {
        SeriesInfo seriesInfo = new SeriesInfo();
        seriesInfo.setCountry("china");
        seriesInfo.setFinish(1);
        seriesInfo.setInserttime(new Date());
        seriesInfo.setType(3);
        seriesInfo.setPageUrl("http://baidu,com");
        seriesInfoMapper.insert(seriesInfo);
    }

    @Test
    public void insertList() {
        List<SeriesInfo> list = new ArrayList<>();
        SeriesInfo seriesInfo = new SeriesInfo();
        seriesInfo.setCountry("china");
        seriesInfo.setFinish(1);
        seriesInfo.setInserttime(new Date());
        seriesInfo.setType(3);
        seriesInfo.setPageUrl("http://baidu,com");
        SeriesInfo seriesInfo1 = new SeriesInfo();
        seriesInfo1.setCountry("china");
        seriesInfo1.setFinish(1);
        seriesInfo1.setInserttime(new Date());
        seriesInfo1.setType(3);
        seriesInfo1.setPageUrl("http://baidu,com");
        list.add(seriesInfo1);
        list.add(seriesInfo);
        seriesInfoMapper.insertList(list);
    }

}