package com.bjsxt.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //该服务会注册到eureka注册中心
public class OrdersConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdersConsumerApplication.class, args);
	}

}
