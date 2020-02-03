package tool;

import com.alibaba.fastjson.JSON;
import com.github.linsinan1995.Crawler;
import com.github.linsinan1995.News;
import com.github.linsinan1995.OverAllData;

import java.io.*;
import java.util.List;
import java.util.Map;

public class Tool {
    public static final Tool TOOL = new Tool();
    Crawler crawler;

    public Tool() {
        crawler = new Crawler();
    }

    static List<OverAllData> readOverAllData() throws IOException {
        String OverAllDataString = TOOL.readJsonFile("data\\OverAllData.json");
        return JSON.parseArray(OverAllDataString, OverAllData.class);
    }

    static List<News> readNewsData() throws IOException {
        String NewsDataString = TOOL.readJsonFile("data\\NewsData.json");
        return JSON.parseArray(NewsDataString, News.class);
    }

    static List<String> readPlaceNames() throws IOException {
        String PlaceNamesString = TOOL.readJsonFile("data\\NewsData.json");
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
        jsonStr = sb.toString();
        return jsonStr;
    }

    static void download() throws IOException {
        Crawler.downloadAll();
    }

    public static void main(String[] args) throws IOException {
        download();
        List<OverAllData> overAllList = readOverAllData();
        overAllList.forEach(System.out::println);
    }
}
