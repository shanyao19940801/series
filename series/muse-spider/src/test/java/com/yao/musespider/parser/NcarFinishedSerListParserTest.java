package com.yao.musespider.parser;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class NcarFinishedSerListParserTest {

    @Test
    public void parser() {
        String text = "女子监狱 Orange Is the New Black (2013)[已更新至13集][随机]@Simple字幕组";
        String pattern = "[^a-zA-Z]+";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(text);
        if (m.find()) {
            System.out.println(m.group(0));
        }
        NcarFinishedSerListParser parser = new NcarFinishedSerListParser();
        parser.parser("");
    }
}