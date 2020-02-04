package com.github.linsinan1995;
/*
    id	谣言编号
    title	谣言标题
    mainSummary	辟谣内容概述
    body	辟谣内容全文
    sourceUrl	来源链接

 */
public class Romour {
    int id;
    String title;
    String mainSummary;
    String body;
    String sourceUrl;

    public Romour(int id, String title, String mainSummary, String body, String sourceUrl) {
        this.id = id;
        this.title = title;
        this.mainSummary = mainSummary;
        this.body = body;
        this.sourceUrl = sourceUrl;
    }

    @Override
    public String toString() {
        return "Romour{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", mainSummary='" + mainSummary + '\'' +
                ", body='" + body + '\'' +
                ", sourceUrl='" + sourceUrl + '\'' +
                '}';
    }
}
