package com.consul.customer.server.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: QinHaoHao
 * @Description:
 * @Date: Created in 10:31 2018/9/17
 * @Modifed By:
 */
@FeignClient("consul-producer")
public interface ProducerClient {

    @GetMapping("/producer/hello")
    String hello();
}
