package com.bc.discovery.eurekacloud.microservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@ComponentScan("com.bc.discovery.eurekacloud.microservice")
//@EnableCircuitBreaker
//@EnableFeignClients(basePackages = "com.bc.discovery.eurekacloud.microservice.client")
@SpringBootApplication
@EnableEurekaClient
@RestController
public class MicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceApplication.class, args);
    }

    @RequestMapping(value = "/v1/list", method = RequestMethod.GET)
    public String list()
    {
        return "hi there, sean -ok!";
    }
}
