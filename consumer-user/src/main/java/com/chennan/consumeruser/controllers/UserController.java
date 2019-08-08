package com.chennan.consumeruser.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：chen.nan
 * @date ：Created in 2019/8/5 15:40
 */
@RequestMapping("/consumer")
@RestController
public class UserController {

    @Autowired RestTemplate restTemplate;

    @GetMapping("buy")
    public String buyTicket(String name){
        String ticket = restTemplate.getForObject("http://PROVIDER-TICKET/provider/getTicket", String.class);
        return name + "购买了" + ticket;
    }

}
