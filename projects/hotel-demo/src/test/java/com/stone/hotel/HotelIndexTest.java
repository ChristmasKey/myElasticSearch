package com.stone.hotel;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class HotelIndexTest {

    private RestHighLevelClient client;

    @BeforeEach
    void setUp() {
        // 创建客户端实例
        this.client = new RestHighLevelClient(RestClient.builder(
                // 集群写法：
                // HttpHost.create("http://192.168.230.128:9200"),
                // HttpHost.create("http://192.168.230.128:9200"),
                // HttpHost.create("http://192.168.230.128:9200")

                HttpHost.create("http://192.168.230.128:9200") // 单点写法
        ));
    }

    @AfterEach
    void tearDown() throws IOException {
        // 销毁客户端实例
        this.client.close();
    }

    @Test
    void testInit() {
        // 测试客户端是否成功初始化
        System.out.println(client);
    }
}
