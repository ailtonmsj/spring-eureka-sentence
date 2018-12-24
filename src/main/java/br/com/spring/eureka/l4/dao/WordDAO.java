package br.com.spring.eureka.l4.dao;

import br.com.spring.eureka.l4.domain.Word;

public interface WordDAO {
	
	static final String SUBJECT = "SPRING-SUBJECT-L4";
	static final String VERB = "SPRING-VERB-L4";
	static final String ARTICLE = "SPRING-ARTICLE-L4";
	static final String ADJECTIVE = "SPRING-ADJECTIVE-L4";
	static final String NOUN = "SPRING-NOUN-L4";
	
	Word getWord();

}
