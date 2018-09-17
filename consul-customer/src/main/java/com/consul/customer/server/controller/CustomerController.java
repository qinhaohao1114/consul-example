package com.consul.customer.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: QinHaoHao
 * @Description:
 * @Date: Created in 10:19 2018/9/17
 * @Modifed By:
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private LoadBalancerClient loadBalancer;

    @Autowired
    private DiscoveryClient discoveryClient;


    /**
     * Controller 中有俩个方法，一个是获取所有服务名为service-producer的服务信息并返回到页面，
     * 一个是随机从服务名为service-producer的服务中获取一个并返回到页面。
     *
     * @return
     */
    @RequestMapping("/services")
    public Object services() {
        return discoveryClient.getInstances("consul-producer");
    }

    /**
     * 从所有服务中选择一个服务（轮询）
     */
    @RequestMapping("/discover")
    public Object discover() {
        return loadBalancer.choose("consul-producer").getUri().toString();
    }
}