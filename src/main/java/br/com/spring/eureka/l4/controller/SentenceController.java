package br.com.spring.eureka.l4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SentenceController {
	
	@Autowired
	RestTemplate template;

	
	@GetMapping("/")
	public @ResponseBody String isAlive() {
		return "IS ALIVE";
	}
	
	
	
	@GetMapping("/sentence")
	public @ResponseBody String getSentences() {
	  return 
		"<h3>Some Sentences</h3><br/>" +	  
		buildSentence() + "<br/><br/>" +
		buildSentence() + "<br/><br/>" +
		buildSentence() + "<br/><br/>" +
		buildSentence() + "<br/><br/>" +
		buildSentence() + "<br/><br/>"
		;
	}
	
	/**
	 * Assemble a sentence by gathering random words of each part of speech:
	 */
	public String buildSentence() {
		String sentence = "There was a problem assembling the sentence!";
		try{
			sentence =  
				String.format("%s %s %s %s %s.",
					getWord("SPRING-SUBJECT-L4"),
					getWord("SPRING-VERB-L4"),
					getWord("SPRING-ARTICLE-L4"),
					getWord("SPRING-ADJECTIVE-L4"),
					getWord("SPRING-NOUN-L4") );			
		} catch ( Exception e ) {
			System.out.println(e);
		}
		return sentence;
	}
	
	/**
	 * Obtain a random word for a given part of speech, where the part 
	 * of speech is indicated by the given service / client ID:
	 */
	public String getWord(String service) {
		return template.getForObject("http://" + service, String.class);
	
	}
}
