package br.com.spring.eureka.l4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {
	
	@Autowired
	RestTemplate restTemplate;
	
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
		return restTemplate.getForObject("http://" + service, String.class);
	}
}
