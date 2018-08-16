package com.yao.musespider.factory;

import com.yao.musespider.parser.IPageParser;

public class PageParserFactory {
    public static IPageParser getParserByClazz(Class clzz) {
        try {
            return (IPageParser) clzz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }
}
