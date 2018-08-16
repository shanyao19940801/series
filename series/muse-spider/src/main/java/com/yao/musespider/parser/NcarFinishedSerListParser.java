package com.yao.musespider.parser;

import com.yao.musespider.entity.Series;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NcarFinishedSerListParser implements IPageParser<Series> {
    @Override
    public List<Series> parser(String html) {
        System.out.println("test");
        Document document = Jsoup.parse(html);
        Elements elements = document.select("th.new");
        for (Element element : elements) {
            Elements e = element.select("a.s").select(".xst");
            String href = e.get(0).attr("href");
            String text = e.get(0).text();

            System.out.println(href);
            System.out.println(text);
            String pattern = "[^a-zA-Z]+";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(text);
            if (m.find()) {
                System.out.println(m.group(0));
            }

        }

        return null;
    }
}
