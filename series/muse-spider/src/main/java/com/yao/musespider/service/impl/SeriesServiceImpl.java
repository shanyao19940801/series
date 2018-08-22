package com.yao.musespider.service.impl;

import com.yao.musespider.dao.SeriesInfoMapper;
import com.yao.musespider.entity.Page;
import com.yao.musespider.entity.SeriesInfo;
import com.yao.musespider.client.BaseHttpClient;
import com.yao.musespider.service.ISeriesService;
import com.yao.musespider.task.NacrFinishedSeriesTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class SeriesServiceImpl implements ISeriesService {

    @Value("${ncarfinishpath}")
    String url;
    @Autowired
    SeriesInfoMapper seriesInfoMapper;

    @Override
    public void insertSeriesList(List<SeriesInfo> list) {
        seriesInfoMapper.insertList(list);
    }

    @Override
    public void serieslistFinishe() {
//        String url = "http://mcar.cc/forum.php?mod=forumdisplay&fid=129&typeid=59&orderby=lastpost&filter=typeid&typeid=59&orderby=lastpost&page=";
        try {
            int pageNum;
            Page page = BaseHttpClient.getInstance().getPage(url+"1");
            if (page != null && page.getStatusCode() == 200) {
                String reg = "totalpage=\"\\w*";
                Pattern pattern = Pattern.compile(reg);
                Matcher matcher = pattern.matcher(page.getHtml());
                if (matcher.find()) {
                    String re = matcher.group(0);
                    re = re.substring(11,re.length());
                    pageNum = Integer.parseInt(re);
                    for (int i = 1; i <= pageNum; i++) {
                        while (true) {
                            System.out.println("11111111");
                            NacrFinishedSeriesTask task = new NacrFinishedSeriesTask(url+i,true);
                            FutureTask<List> futureTask = new FutureTask<>(task);
                            Thread thread = new Thread(futureTask);
                            thread.start();
                            List list = futureTask.get();
                            if (list != null && list.size() > 0) {
                                seriesInfoMapper.insertList(list);
                                break;
                            }
                        }
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void serieslistFinisheByPage(Integer pagenum) {
        try {
            while (true) {
                NacrFinishedSeriesTask task = new NacrFinishedSeriesTask(url+pagenum,true);
                FutureTask<List> futureTask = new FutureTask<>(task);
                Thread thread = new Thread(futureTask);
                thread.start();
                List list = futureTask.get();
                if (list != null && list.size() > 0) {
                    seriesInfoMapper.insertList(list);
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
