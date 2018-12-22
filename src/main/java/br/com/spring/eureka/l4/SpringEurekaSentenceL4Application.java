package br.com.spring.eureka.l4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringEurekaSentenceL4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaSentenceL4Application.class, args);
	}

}

