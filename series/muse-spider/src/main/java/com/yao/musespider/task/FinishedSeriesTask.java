package com.yao.musespider.task;

import com.yao.musespider.entity.Page;
import com.yao.musespider.factory.PageParserFactory;
import com.yao.musespider.parser.IPageParser;
import com.yao.musespider.parser.NcarFinishedSerListParser;

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
