package com.yao.musespider.task;

import com.yao.musespider.entity.Page;
import com.yao.musespider.parser.PageParserFactory;
import com.yao.musespider.parser.IPageParser;
import com.yao.musespider.parser.NcarFinishedSerListParser;
import com.yao.musespider.service.ISeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//爬取美剧列表信息任务

public class NacrFinishedSeriesTask extends AbstractTask<NacrFinishedSeriesTask> {
    @Autowired
    ISeriesService seriesService;
    public NacrFinishedSeriesTask(String url, boolean isUseProxy) {
        this.url = url;
        this.isUseProxy = isUseProxy;
    }

    @Override
    public void retry() {

    }

    @Override
    public void handle(Page page) {
        IPageParser pageParser = PageParserFactory.getParserByClazz(NcarFinishedSerListParser.class);
        if (pageParser != null) {
            List list = pageParser.parser(page.getHtml());
            seriesService.insertSeriesList(list);
            System.out.println("保存");
        }
    }

    @Override
    public void run() {
        this.getPage(url);
    }
}
