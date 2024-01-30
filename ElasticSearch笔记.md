# ElasticSearch笔记

<img src="https://static-www.elastic.co/v3/assets/bltefdd0b53724fa2ce/blt3b753422a8fd8667/62a00b97e95fa50f854de137/enterprise-search-landing-hero.png" alt="首图" style="zoom: 33%;" />

## 初识ES

<h4>什么是ElasticSearch</h4>

<span style="color:red;">**ElasticSearch**</span>是一款非常强大的开源搜索引擎，可以帮助我们从海量数据中快速找到需要的内容。

它的可应用场景包括但不限于：

- Github内容搜索并高亮显示关键字
- 京东商品信息搜索并高亮显示关键字
- 百度、谷歌搜索
- 打车软件上的附近车辆搜索



**ElasticSearch** 结合 **Kibana**、**Logstash**、**Beats** 组成了<span style="color:red;">ElasticStack（ELK）</span>。被广泛应用在日志数据分析、实时监控等领域。

==ElasticSearch是 ELK 的核心，负责存储、搜索、分析数据。==

![<span style="color:red;">](./images/ELK.png)



<h4>ElasticSearch的发展</h4>

ES的底层是基于 <span style="color:red;">**Lucene**</span> 实现的。

> Lucene是一个Java语言的搜索引擎类库，是Apache公司的顶级项目，由*DougCutting*与1999年研发。
>
> 官网地址：https://lucene.apache.org/
>
> Lucene的优势如下
>
> - 易扩展（类库相当于一个jar包，开发人员可以基于它进行二次开发）
> - 高性能（核心API实现了 <span style="color:red;">倒排索引</span> 数据结构）
>
> Lucene的劣势如下
>
> - 只限于Java语言开发
> - 学习曲线陡峭
> - 不支持水平扩展 

2004年*ShayBanon*基于**Lucene**开发了**Compass**

2010年*ShayBanon*重写了**Compass**，取名为<span style="color:red;">**ElasticSearch**</span>

官网地址：https://www.elastic.co/cn/

相比于Lucene，ElasticSearch具备下列优势：

- 支持分布式，可水平扩展
- 提供Restful接口，可被任何语言调用



<h4>搜索引擎技术排名前三</h4>

1.ElasticSearch：开源的分布式搜索引擎

2.Splunk：商业项目

3.Solr：Apache的开源搜索引擎



### 倒排索引

#### 正向索引

传统数据库（如MySQL）采用正向索引，例如给下表（tb_goods）中的id创建索引：

![tb_goods表](./images/tb_goods表.png)

当我们需要对 title 进行模糊查询的时候，索引是不生效的

![模糊查询的执行逻辑](./images/模糊查询的执行逻辑.png)

#### 倒排索引

ElasticSearch采用倒排索引：

- 文档（document）：每条数据就是一个文档
- 词条（term）：文档按照语义分成的词语

![倒排索引_创建词条](./images/倒排索引_创建词条.png)

基于倒排索引的查询是分两步执行的，但两步都是索引级别的查询，所以总的查询效率要比模糊匹配高很多

![基于倒排索引查询的执行逻辑](./images/基于倒排索引查询的执行逻辑.png)

<span style="color:red;">由此可见，倒排索引是相对于正向索引而“倒”的</span>：正向索引是先找到文档，然后判断文档内容是否符合条件；倒排索引是先找到符合条件的词条，再找对应的文档



### 概念对比

#### 文档

ES是面向文档存储的，可以是数据库中的一条商品数据，一个订单信息。

<span style="color:#be002f;">文档数据会被序列化为json格式后存储在ES中。</span>

![ES的JSON存储形式](./images/ES的JSON存储形式.png)



#### 索引

- 索引（Index）：<span style="color:blue;">相同类型的文档的集合</span>
- 映射（Mapping）：<span style="color:blue;">索引中文档的字段约束信息，类似表的结构约束</span>

![ES的索引](./images/ES的索引.png)



#### ES与MySQL的概念对比

![ES与MySQL的概念对比](./images/ES与MySQL的概念对比.png)
