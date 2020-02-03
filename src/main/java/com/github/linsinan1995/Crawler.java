package com.github.linsinan1995;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;



public class Crawler {
    public final static int READ_TIMEOUT = 100; // s
    public static final OkHttpClient client = new OkHttpClient.Builder()
                                                  .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
                                                  .build();

    Response getMethod(String url) throws IOException {
        Request request = new Request.Builder()
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.100 Safari/537.36")
                .header("Content-Type", "application/json")
                .url(url)
                .build();
        return client.newCall(request).execute();
    }

    JSONArray getOverAllJson(boolean allData) throws IOException {
        Response respones = getMethod("https://lab.isaaclin.cn/nCoV/api/overall?latest=" + (allData? "0":"1"));
        Map maps = (Map)JSON.parse(respones.body().string());
        return (JSONArray) maps.get("results");
    }

    List<OverAllData> getOverAllData(boolean allData) throws IOException {
        JSONArray jsonData = getOverAllJson(allData);
        return JSON.parseArray(jsonData.toString(), OverAllData.class);
    }

    JSONArray getPlaceNamesJson() throws IOException {
        Response respones = getMethod("https://lab.isaaclin.cn/nCoV/api/provinceName");
        Map maps = (Map)JSON.parse(respones.body().string());
        return (JSONArray) maps.get("results");
    }

    List<String> getPlaceNames() throws IOException {
        JSONArray jsonData = getPlaceNamesJson();
        return JSON.parseArray(jsonData.toString(), String.class);
    }

    List<ProvinceData> getAreaData() throws IOException {
        JSONArray jsonData = getAreaJson(true, "");
        return JSON.parseArray(jsonData.toString(), ProvinceData.class);
    }

    List<ProvinceData> getAreaData(boolean allData) throws IOException {
        JSONArray jsonData = getAreaJson(allData, "");
        return JSON.parseArray(jsonData.toString(), ProvinceData.class);
    }

    ProvinceData getArea(boolean allData, String province) throws IOException {
        JSONArray jsonData = getAreaJson(allData, province);
        return JSON.parseArray(jsonData.toString(), ProvinceData.class).get(0);
    }

    private JSONArray getAreaJson(boolean allData, String province) throws IOException {
        String url = "https://lab.isaaclin.cn/nCoV/api/area?latest=" + (allData? "0":"1") +
                                    (province.equals("") ? "" : "&province=" + province);
        Response respones = getMethod(url);
        Map maps = (Map)JSON.parse(respones.body().string());
        return (JSONArray) maps.get("results");
    }


    private JSONArray getNewsJson(String province, int num) throws IOException {
        String url = "https://lab.isaaclin.cn/nCoV/api/news?num=" + (num == -1 ? "all":num) +
                                                (province.equals("") ? "":"&province=" + province);
        Response respones = getMethod(url);
        Map maps = (Map)JSON.parse(respones.body().string());
        return (JSONArray) maps.get("results");
    }

    public List<News> getNews(String province, int num) throws IOException {
        JSONArray jsonData = getNewsJson(province, num);
        return JSON.parseArray(jsonData.toString(), News.class);
    }

    public List<News> getNews(String province) throws IOException {
        JSONArray jsonData = getNewsJson(province, -1);
        return JSON.parseArray(jsonData.toString(), News.class);
    }

    public List<News> getNews() throws IOException {
        JSONArray jsonData = getNewsJson("", -1);
        return JSON.parseArray(jsonData.toString(), News.class);
    }

    public static void downloadAll() throws IOException {
        Crawler crawler = new Crawler();

        // OverAll
        JSONArray OverAllJsonData = crawler.getOverAllJson(true);
        writeFile("data\\OverAllData.json", OverAllJsonData.toString());

        // place names
        JSONArray PlaceNamesJsonData = crawler.getPlaceNamesJson();
        writeFile("data\\PlaceNames.json", PlaceNamesJsonData.toString());

        // ProvinceData
        JSONArray ProvinceDataJsonData = crawler.getAreaJson(true, "");
        writeFile("data\\ProvinceData.json", ProvinceDataJsonData.toString());

        // News
        JSONArray NewsJsonData = crawler.getNewsJson("", -1);
        writeFile("data\\NewsData.json", NewsJsonData.toString());
    }

    public static void writeFile(String filePath, String sets)  throws IOException {
        FileWriter fw = new FileWriter(filePath);
        PrintWriter out = new PrintWriter(fw);
        out.write(sets);
        out.println();
        fw.close();
        out.close();
    }


}
