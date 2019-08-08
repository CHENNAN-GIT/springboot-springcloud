package com.chennan.consumeruser.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/**
 * @author ：chen.nan
 * @date ：Created in 2019/8/5 15:46
 */
@EnableDiscoveryClient // 开启发现服务功能
@Configuration
public class RestConfig {

    @LoadBalanced // 使用负载均衡机制
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
