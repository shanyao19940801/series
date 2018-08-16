package com.yao.musespider.entity;

//TODO 具体表还没设计临时写一个实体
public class Series {
    String name;
    String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Series{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
