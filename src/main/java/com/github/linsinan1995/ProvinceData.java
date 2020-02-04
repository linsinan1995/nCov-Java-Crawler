package com.github.linsinan1995;

import java.util.List;

/*
    返回数据
    变量名	           注释
    country	           国家
    provinceName       省份名称
    provinceShortName  省份缩写
    confirmedCount     确诊人数
    suspectedCount     疑似感染人数
    curedCount         治愈人数
    deadCount          死亡人数
    updateTime         数据最后变动时间
    locationId         地址ID

    cities             子城市类
    cities::cityName   子城市名
    cities::confirmedCount 子城市确诊人数
    cities::suspectedCount 子城市疑似感染人数
    cities::curedCount     子城市治愈人数
    cities::deadCount      子城市死亡人数
    cities::locationId  子城市地址ID
*/


public class ProvinceData {
    String country;
    String provinceName;
    String provinceShortName;
    int confirmedCount;
    int suspectedCount;
    int curedCount;
    int deadCount;
    int locationId;
    String updateTime;
    List<CityData> cities;

    public ProvinceData(String country, String provinceName, String provinceShortName, int confirmedCount,
                        int suspectedCount, int curedCount, int deadCount, String updateTime,
                        List<CityData> cities, int locationId)
    {
        this.country = country;
        this.provinceName = provinceName;
        this.provinceShortName = provinceShortName;
        this.confirmedCount = confirmedCount;
        this.suspectedCount = suspectedCount;
        this.curedCount = curedCount;
        this.deadCount = deadCount;
        this.locationId = locationId;
        this.updateTime = updateTime;
        this.cities = cities;
    }


    public static class CityData{
        String cityName;
        int confirmedCount;
        int suspectedCount;
        int curedCount;
        int deadCount;
        int locationId;

        public CityData(String cityName, int confirmedCount, int suspectedCount, int curedCount,
                        int deadCount, int locationId)
        {
            this.cityName = cityName;
            this.confirmedCount = confirmedCount;
            this.suspectedCount = suspectedCount;
            this.curedCount =  curedCount;
            this.deadCount = deadCount;
            this.locationId = locationId;
        }

        @Override
        public String toString() {
            return "CityData{" +
                    "cityName='" + cityName + '\'' +
                    ", confirmedCount=" + confirmedCount +
                    ", suspectedCount=" + suspectedCount +
                    ", curedCount=" + curedCount +
                    ", deadCount=" + deadCount +
                    ", locationId=" + locationId +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ProvinceData{" +
                "country='" + country + '\'' +
                ", provinceName='" + provinceName + '\'' +
                ", provinceShortName='" + provinceShortName + '\'' +
                ", confirmedCount=" + confirmedCount +
                ", suspectedCount=" + suspectedCount +
                ", curedCount=" + curedCount +
                ", deadCount=" + deadCount +
                ", locationId=" + locationId +
                ", updateTime='" + updateTime + '\'' +
                ", cities=" + cities +
                '}';
    }
}
