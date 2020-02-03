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

        public CityData(String cityName, String confirmedCount, String suspectedCount, String curedCount,
                        String deadCount, String locationId)
        {
            this.cityName = cityName;
            this.confirmedCount = Integer.parseInt(confirmedCount);
            this.suspectedCount = Integer.parseInt(suspectedCount);
            this.curedCount =  Integer.parseInt(curedCount);
            this.deadCount = Integer.parseInt(deadCount);
            this.locationId = Integer.parseInt(locationId);
        }


    }
}
