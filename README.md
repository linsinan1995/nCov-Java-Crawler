# 数据源

数据源 : 
[BlankerL/DXY-2019-nCoV-Crawler](https://github.com/BlankerL/DXY-2019-nCoV-Data) (丁香园)

API : https://lab.isaaclin.cn/nCoV/


<br>

# 数据含义

表格摘至：https://lab.isaaclin.cn/nCoV/

*补充了原来全国数据统计里漏的病情严重人数

<br>

<table style="width: 100%" >
                <tbody>
                <tr>
                    <th colspan="2">类:OverAllData</th>
                </tr>
                <tr>
                    <th width="30%">变量名</th>
                    <th>注释</th>
                </tr>
                <tr>
                    <td align="center">countRemark</td>
                    <td>全国疫情信息概览</td>
                </tr>
                <tr>
                    <td align="center">virus</td>
                    <td>病毒名称</td>
                </tr>
                <tr>
                    <td align="center">infectSource</td>
                    <td>传染源</td>
                </tr>
                <tr>
                    <td align="center">passWay</td>
                    <td>传播途径</td>
                </tr>
                <tr>
                    <td align="center">remarkX</td>
                    <td>注释内容，X为1~5</td>
                </tr>
                <tr>
                    <td align="center">confirmedCount</td>
                    <td>确诊人数</td>
                </tr>
                <tr>
                    <td align="center">suspectedCount</td>
                    <td>疑似感染人数</td>
                </tr>
                <tr>
                    <td align="center">curedCount</td>
                    <td>治愈人数</td>
                </tr>
                <tr>
                    <td align="center">deadCount</td>
                    <td>死亡人数</td>
                </tr>
                <tr>
                    <td align="center">seriousCount</td>
                    <td>病情严重人数</td>
                </tr>
                <tr>
                    <td align="center">updateTime</td>
                    <td>数据最后变动时间</td>
                </tr>
</tbody></table>



<br>

<br>

<table style="width: 100%" >
                <tbody>
                <tr>
                    <th colspan="2">类:ProvinceData</th>
                </tr>
                <tr>
                    <th width="30%">变量名</th>
                    <th>注释</th>
                </tr>
                <tr>
                    <td align="center">country</td>
                    <td>国家名称</td>
                </tr>
                <tr>
                    <td align="center">provinceName</td>
                    <td>省份、地区或直辖市全称</td>
                </tr>
                <tr>
                    <td align="center">provinceShortName</td>
                    <td>省份、地区或直辖市简称</td>
                </tr>
                <tr>
                    <td align="center">confirmedCount</td>
                    <td>确诊人数</td>
                </tr>
                <tr>
                    <td align="center">suspectedCount</td>
                    <td>疑似感染人数</td>
                </tr>
                <tr>
                    <td align="center">curedCount</td>
                    <td>治愈人数</td>
                </tr>
                <tr>
                    <td align="center">deadCount</td>
                    <td>死亡人数</td>
                </tr>
                <tr>
                    <td align="center">comment</td>
                    <td>其他信息</td>
                </tr>
                <tr>
                    <td align="center">cities</td>
                    <td>下属城市的情况</td>
                </tr>
                <tr>
                    <td align="center">updateTime</td>
                    <td>数据更新时间</td>
                </tr>
</tbody></table>



<br>

<br>


<table style="width: 100%">
                <tbody>
                <tr>
                    <th colspan="2">类:News</th>
                </tr>
                    <th width="30%">变量名</th>
                    <th>注释</th>
                </tr>
                <tr>
                    <td align="center">pubDate</td>
                    <td>新闻发布时间</td>
                </tr>
                <tr>
                    <td align="center">title</td>
                    <td>新闻标题</td>
                </tr>
                <tr>
                    <td align="center">summary</td>
                    <td>新闻内容概述</td>
                </tr>
                <tr>
                    <td align="center">infoSource</td>
                    <td>数据来源</td>
                </tr>
                <tr>
                    <td align="center">sourceUrl</td>
                    <td>来源链接</td>
                </tr>
                <tr>
                    <td align="center">province</td>
                    <td>省份或直辖市名称</td>
                </tr>
                <tr>
                    <td align="center">provinceId</td>
                    <td>省份或直辖市代码</td>
                </tr>
            </tbody></table>


<br>

<br>
<table style="width: 100%" >
                <tbody>
                <tr>
                    <th colspan="2">类:Romour</th>
                </tr>
                <tr>
                    <th width="30%">变量名</th>
                    <th>注释</th>
                </tr>
                <tr>
                    <td align="center">id</td>
                    <td>谣言编号</td>
                </tr>
                <tr>
                    <td align="center">title</td>
                    <td>谣言标题</td>
                </tr>
                <tr>
                    <td align="center">mainSummary</td>
                    <td>辟谣内容概述</td>
                </tr>
                <tr>
                    <td align="center">body</td>
                    <td>辟谣内容全文</td>
                </tr>
                <tr>
                    <td align="center">sourceUrl</td>
                    <td>来源链接</td>
                </tr>
</tbody></table>

<br>

# 如何使用

时间戳等地方数据还较为杂乱，待完善！

```java
// 统计表里面的所有地点
List<String> placenameList = readPlaceNames();
System.out.println("placenameList.size() = " + placenameList.size());

// 统计表里面的省份数据
List<ProvinceData> ProvinceDataList = readProvinceData();
System.out.println("ProvinceDataList.size() = " + ProvinceDataList.size());

// 全国统计数据
List<OverAllData> overAllList = readOverAllData();
System.out.println("overAllList.size() = " + overAllList.size());

// 全国相关的新闻
List<News> overNewsList = readNewsData();
System.out.println("overNewsList.size() = " + overNewsList.size());

// 全国相关的Fake news
List<Romour> RomourList = readRomourData();
System.out.println("RomourList.size() = " + RomourList.size());
```

<br>

# To Do

- [ ] 新数据添加(减少api压力)

- [ ] 数据处理

- [ ] 可视化
  
- [ ] 数据模型

- [ ] 其他数据格式接口 
