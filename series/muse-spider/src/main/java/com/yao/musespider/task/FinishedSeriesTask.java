package com.yao.musespider.task;

import com.yao.musespider.entity.Page;
import com.yao.musespider.entity.Series;
import com.yao.musespider.factory.PageParserFactory;
import com.yao.musespider.parser.IPageParser;
import com.yao.musespider.parser.NcarFinishedSerListParser;
import com.yao.musespider.parser.NcarFinishedSerPerParser;

import java.util.List;

//爬取美剧列表信息任务
public class FinishedSeriesTask extends AbstractTask<FinishedSeriesTask> {
    public FinishedSeriesTask(String url, boolean isUseProxy) {
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
            pageParser.parser(page.getHtml());
        }
    }

    @Override
    public void run() {
        this.getPage(url);
    }
}
