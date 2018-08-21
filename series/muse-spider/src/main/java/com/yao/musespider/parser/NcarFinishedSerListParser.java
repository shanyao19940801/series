package com.yao.musespider.parser;

import com.yao.musespider.entity.Series;
import com.yao.musespider.entity.SeriesInfo;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NcarFinishedSerListParser implements IPageParser<SeriesInfo> {
    @Override
    public List<SeriesInfo> parser(String html) {
        Document document = Jsoup.parse(html);
        Elements elements = document.select("th.new");
        System.out.println("yuansu:"+elements.size());
//        System.out.println(html);
        List<SeriesInfo> list = new ArrayList<>();
        for (Element element : elements) {
            SeriesInfo seriesInfo = new SeriesInfo();
            Elements e = element.select("a.s").select(".xst");
            String href = e.get(0).attr("href");
            seriesInfo.setPageUrl(href);
            String text = e.get(0).text();

            System.out.println(href);
            System.out.println(text);
            String pattern = "[^a-zA-Z]+";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(text);
            if (m.find()) {
                text = m.group(0).trim();
                seriesInfo.setName(text);
            }
            seriesInfo.setType(3);
            seriesInfo.setInserttime(new Date());
            seriesInfo.setFinish(1);
            seriesInfo.setCountry("USA");
            list.add(seriesInfo);
        }

        return list;
    }
}
