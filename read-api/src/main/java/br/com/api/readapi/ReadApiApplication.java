package br.com.api.readapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@SpringBootApplication
public class ReadApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadApiApplication.class, args);
	}
}
