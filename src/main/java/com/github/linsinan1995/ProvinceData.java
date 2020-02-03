package com.github.linsinan1995;

import java.util.List;

public class ProvinceData {
    String country;
    String provinceName;
    String provinceShortName;
    int confirmedCount;
    int suspectedCount;
    int curedCount;
    int deadCount;
    String updateTime;
    List<CityData> cities;

    public ProvinceData(String country, String provinceName, String provinceShortName, int confirmedCount,
                        int suspectedCount, int curedCount, int deadCount, String updateTime,
                        List<CityData> cities)
    {
        this.country = country;
        this.provinceName = provinceName;
        this.provinceShortName = provinceShortName;
        this.confirmedCount = confirmedCount;
        this.suspectedCount = suspectedCount;
        this.curedCount = curedCount;
        this.deadCount = deadCount;
        // this.seriousCount = seriousCount;
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
                ", updateTime='" + updateTime + '\'' +
                ", cities=[" + cities +
                "]}" ;
    }
}
