package com.yao.musetestdatasoures.entity;

import java.util.Date;

public class MuseSeriesInfo {
    private Integer id;

    private String name;

    private String pageUrl;

    private Integer type;

    private String country;

    private Integer finish;

    private Date inserttime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl == null ? null : pageUrl.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public Integer getFinish() {
        return finish;
    }

    public void setFinish(Integer finish) {
        this.finish = finish;
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        return "MuseSeriesInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pageUrl='" + pageUrl + '\'' +
                ", type=" + type +
                ", country='" + country + '\'' +
                ", finish=" + finish +
                '}';
    }
}