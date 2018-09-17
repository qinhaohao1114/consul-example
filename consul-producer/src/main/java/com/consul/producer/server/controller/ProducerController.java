package com.consul.producer.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: QinHaoHao
 * @Description:
 * @Date: Created in 10:06 2018/9/17
 * @Modifed By:
 */
@RestController
@RequestMapping("/producer")
public class ProducerController {

    @GetMapping("/hello")
    public String hello() {
        return "helle consul";
    }

}
