package com.github.linsinan1995;

/*
* pubDate 发布时间
* title 新闻标题
* summary 摘要
* infoSource 信息源
* sourceUrl 新闻源地址
* provinceId 省份ID
* province 省份名称
*
* */

public class News {
    String pubDate;
    String title;
    String summary;
    String infoSource;
    String sourceUrl;
    String province;
    int provinceId;

    public News(String pubDate, String title, String summary, String infoSource, String sourceUrl, String province,
                int provinceId) {
        this.pubDate = pubDate;
        this.title = title;
        this.summary = summary;
        this.infoSource = infoSource;
        this.sourceUrl = sourceUrl;
        this.province = province;
        this.provinceId = provinceId;
    }

    @Override
    public String toString() {
        return "News{" +
                "pubDate='" + pubDate + '\'' +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", infoSource='" + infoSource + '\'' +
                ", sourceUrl='" + sourceUrl + '\'' +
                ", province='" + province + '\'' +
                ", provinceId=" + provinceId +
                '}';
    }
}
