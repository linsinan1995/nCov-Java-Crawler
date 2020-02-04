package tool;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.linsinan1995.*;

import java.io.*;
import java.util.List;

public class Tool {
    public static final Tool TOOL = new Tool();
    Crawler crawler;

    public Tool() {
        crawler = new Crawler();
    }

    static List<ProvinceData> readProvinceData() throws IOException {
        String ProvinceDataString = TOOL.readJsonFile("data\\ProvinceData.json");
        return JSON.parseArray(ProvinceDataString, ProvinceData.class);
    }

    static List<OverAllData> readOverAllData() throws IOException {
        String OverAllDataString = TOOL.readJsonFile("data\\OverAllData.json");
        return JSON.parseArray(OverAllDataString, OverAllData.class);
    }

    static List<News> readNewsData() throws IOException {
        String NewsDataString = TOOL.readJsonFile("data\\NewsData.json");
        return JSON.parseArray(NewsDataString, News.class);
    }

    static List<Romour> readRomourData() throws IOException {
        String RomourDataString = TOOL.readJsonFile("data\\RomourData.json");
        return JSON.parseArray(RomourDataString, Romour.class);
    }

    static List<String> readPlaceNames() throws IOException {
        String PlaceNamesString = TOOL.readJsonFile("data\\PlaceNames.json");
        return JSON.parseArray(PlaceNamesString, String.class);
    }

    public String readJsonFile(String fileName) throws IOException {
        String jsonStr = "";
        File jsonFile = new File(fileName);
        FileReader fileReader = new FileReader(jsonFile);

        Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
        int ch = 0;
        StringBuffer sb = new StringBuffer();
        while ((ch = reader.read()) != -1) {
            sb.append((char) ch);
        }
        fileReader.close();
        reader.close();
        return sb.toString();
    }

    static void download() throws IOException {
        Crawler.downloadAll();
    }

    public static void main(String[] args) throws IOException {
        download();

        List<String> placenameList = readPlaceNames();
        System.out.println(placenameList.get(0));
        System.out.println("placenameList.size() = " + placenameList.size());

        List<ProvinceData> ProvinceDataList = readProvinceData();
        System.out.println(ProvinceDataList.get(0));
        System.out.println("ProvinceDataList.size() = " + ProvinceDataList.size());

        List<OverAllData> overAllList = readOverAllData();
        System.out.println(overAllList.get(0));
        System.out.println("overAllList.size() = " + overAllList.size());

        List<News> overNewsList = readNewsData();
        System.out.println(overNewsList.get(0));
        System.out.println("overNewsList.size() = " + overNewsList.size());

        List<Romour> RomourList = readRomourData();
        System.out.println(RomourList.get(0));
//        String jsonString = JSON.toJSONString(RomourList.get(0).toString());
        System.out.println("RomourList.size() = " + RomourList.size());
    }
}
