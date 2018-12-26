package br.com.spring.eureka.l4.service;

import br.com.spring.eureka.l4.domain.Word;

public interface WordService {
	
	public Word getAdjective();
	
	public Word getArticle();
	
	public Word getNoun();
	
	public Word getSubject();
	
	public Word getVerb();

}
