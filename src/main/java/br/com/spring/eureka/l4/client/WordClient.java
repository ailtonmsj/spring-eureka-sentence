package br.com.spring.eureka.l4.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.spring.eureka.l4.domain.Word;

public interface WordClient {
	
	static final String SUBJECT = "SPRING-SUBJECT-L4";
	static final String VERB = "SPRING-VERB-L4";
	static final String ARTICLE = "SPRING-ARTICLE-L4";
	static final String ADJECTIVE = "SPRING-ADJECTIVE-L4";
	static final String NOUN = "SPRING-NOUN-L4";
	
	@RequestMapping(method=RequestMethod.GET, value="/")
	public Word getWord();

}
