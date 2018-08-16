package com.yao.musespider.parser;

import com.yao.musespider.entity.Series;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class NcarFinishedSerPerParser implements IPageParser<Series> {
    @Override
    public List<Series> parser(String html) {
        Document document = Jsoup.parse(html);
        Elements elements = document.select("div.pct");
        System.out.println("test");
        return null;
    }
}
