package com.github.linsinan1995;

/*
    返回数据
    变量名	       注释
    countRemark	   全国疫情信息概览
    virus	       病毒名称
    infectSource   传染源
    passWay        传播途径
    remarkX        注释内容，X为1~5
    confirmedCount 确诊人数
    suspectedCount 疑似感染人数
    curedCount     治愈人数
    deadCount      死亡人数
    updateTime     数据最后变动时间
    seriousCount   严重患病人数
*/

public class OverAllData {
    String countRemark;
    String virus;
    String infectSource;
    String passWay;
    String remarkX;
    int confirmedCount;
    int suspectedCount;
    int curedCount;
    int deadCount;
    int seriousCount;
    String updateTime;

    public OverAllData(String countRemark, String virus, String infectSource, String passWay, String remarkX,
                       int confirmedCount, int suspectedCount, int curedCount, int deadCount,
                       int seriousCount, String updateTime)
    {
        this.countRemark = countRemark;
        this.virus = virus;
        this.infectSource = infectSource;
        this.passWay = passWay;
        this.remarkX = remarkX;
        this.confirmedCount = confirmedCount;
        this.suspectedCount = suspectedCount;
        this.curedCount = curedCount;
        this.deadCount = deadCount;
        this.seriousCount = seriousCount;
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "OverAllData{" +
                "countRemark='" + countRemark + '\'' +
                ", virus='" + virus + '\'' +
                ", infectSource='" + infectSource + '\'' +
                ", passWay='" + passWay + '\'' +
                ", remarkX='" + remarkX + '\'' +
                ", confirmedCount=" + confirmedCount +
                ", suspectedCount=" + suspectedCount +
                ", curedCount=" + curedCount +
                ", deadCount=" + deadCount +
                ", seriousCount=" + seriousCount +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
