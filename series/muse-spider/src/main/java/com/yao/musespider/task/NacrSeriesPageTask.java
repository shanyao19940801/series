package com.yao.musespider.task;

import com.yao.musespider.entity.Page;
import com.yao.musespider.entity.Series;
import com.yao.musespider.factory.PageParserFactory;
import com.yao.musespider.parser.IPageParser;
import com.yao.musespider.parser.NcarFinishedSerPerParser;

import java.util.List;

//爬取美剧每集信息任务
public class NacrSeriesPageTask extends AbstractTask<NacrSeriesPageTask>{
    public NacrSeriesPageTask(String url, boolean isUseProxy) {
        this.url = url;
        this.isUseProxy = isUseProxy;
    }

    @Override
    public void retry() {

    }

    @Override
    public void handle(Page page) {
        IPageParser pageParser = PageParserFactory.getParserByClazz(NcarFinishedSerPerParser.class);
        if (pageParser != null) {
            List<Series> list = pageParser.parser(page.getHtml());

        }
    }

    @Override
    public void run() {
        this.getPage(url);
    }
}
