# ElasticSearch笔记

<img src="https://static-www.elastic.co/v3/assets/bltefdd0b53724fa2ce/blt3b753422a8fd8667/62a00b97e95fa50f854de137/enterprise-search-landing-hero.png" alt="首图" style="zoom: 33%;" />

## 初识ES

<span style="color:red;">**ElasticSearch**</span>是一款非常强大的开源搜索引擎，可以帮助我们从海量数据中快速找到需要的内容。

它的可应用场景包括但不限于：

- Github内容搜索并高亮显示关键字
- 京东商品信息搜索并高亮显示关键字
- 百度、谷歌搜索
- 打车软件上的附近车辆搜索



**ElasticSearch** 结合 **Kibana**、**Logstash**、**Beats** 组成了<span style="color:red;">ElasticStack（ELK）</span>。被广泛应用在日志数据分析、实时监控等领域。

==ElasticSearch是 ELK 的核心，负责存储、搜索、分析数据。==

![<span style="color:red;">](./images/ELK.png)

ES的底层是基于 <span style="color:red;">**Lucene**</span> 实现的。

Lucene是一个Java语言的搜索引擎类库，是Apache公司的顶级项目，由DougCutting与1999年研发。

官网地址：https://lucene.apache.org/

Lucene的优势如下

- 易扩展（类库相当于一个jar包，开发人员可以基于它进行二次开发）
- 高性能（核心API实现了 <span style="color:red;">倒排索引</span> 数据结构）

Lucene的劣势如下

- 只限于Java语言开发
- 学习曲线陡峭
- 不支持水平扩展 

