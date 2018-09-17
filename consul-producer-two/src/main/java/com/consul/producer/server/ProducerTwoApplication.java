package com.consul.producer.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: QinHaoHao
 * @Description:
 * @Date: Created in 11:59 2018/9/14
 * @Modifed By:
 */

@EnableDiscoveryClient
@SpringBootApplication
public class ProducerTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerTwoApplication.class, args);
    }

}
