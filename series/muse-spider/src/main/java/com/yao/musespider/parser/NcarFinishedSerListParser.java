package com.yao.musespider.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;

public class NcarFinishedSerListParser implements IPageParser<NcarFinishedSerListParser> {
    @Override
    public List<NcarFinishedSerListParser> parser(String html) {
        System.out.println("test");
        Document document = Jsoup.parse(html);
        Elements elements = document.select("th.new");
        for (Element element : elements) {
            Elements e = element.select("a.s").select(".xst");
            String href = e.get(0).attr("href");
            String text = e.get(0).text();
            System.out.println(href);
            System.out.println(text);

        }

        return null;
    }
}
