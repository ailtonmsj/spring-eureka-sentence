package br.com.spring.eureka.l4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringEurekaSentenceL4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaSentenceL4Application.class, args);
	}
}

