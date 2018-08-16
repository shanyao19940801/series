package com.yao.musespider.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class NcarFinishedSerListParser implements IPageParser<NcarFinishedSerListParser> {
    @Override
    public List<NcarFinishedSerListParser> parser(String html) {
        System.out.println("test");
        Document document = Jsoup.parse(html);
        Elements elements = document.select("th.new");
        return null;
    }
}
