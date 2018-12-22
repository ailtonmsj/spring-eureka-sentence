package br.com.spring.eureka.l4.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {
	
	@Autowired
	DiscoveryClient client;
	
	@GetMapping("/")
	public @ResponseBody String isAlive() {
		return "IS ALIVE";
	}
	
	@GetMapping("/sentence")
	  public @ResponseBody String getSentence() {
	    return 
	      getWord("spring-subject-l4") + " "
	      + getWord("spring-verb-l4") + " "
	      + getWord("spring-article-l4") + " "
	      + getWord("spring-adjective-l4") + " "
	      + getWord("spring-noun-l4") + "."
	      ;
	  }
	  
	public String getWord(String service) {
		List<ServiceInstance> list = client.getInstances(service);
		if (list != null && list.size() > 0) {
			URI uri = list.get(0).getUri();
			if (uri != null) {
				return (new RestTemplate()).getForObject(uri, String.class);
			}
		}
		return null;
	}
}
