package br.com.spring.eureka.l4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.eureka.l4.service.SentenceService;

@RestController
public class SentenceController {
	
	@Autowired
	SentenceService sentenceService;

	
	@GetMapping("/")
	public @ResponseBody String isAlive() {
		return "IS ALIVE";
	}
	
	
	
	@GetMapping("/sentence")
	public @ResponseBody String getSentences() {
	  String sentence = 
		sentenceService.buildSentence() + "<br/><br/>" +
		sentenceService.buildSentence() + "<br/><br/>" +
		sentenceService.buildSentence() + "<br/><br/>" +
		sentenceService.buildSentence() + "<br/><br/>" +
		sentenceService.buildSentence() + "<br/><br/>";
	  
	  return sentence;
	}
}
