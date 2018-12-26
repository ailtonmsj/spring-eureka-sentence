package br.com.spring.eureka.l4.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import br.com.spring.eureka.l4.client.AdjectiveClient;
import br.com.spring.eureka.l4.client.ArticleClient;
import br.com.spring.eureka.l4.client.NounClient;
import br.com.spring.eureka.l4.client.SubjectClient;
import br.com.spring.eureka.l4.client.VerbClient;
import br.com.spring.eureka.l4.domain.Word;
import br.com.spring.eureka.l4.service.WordService;

@Service
public class WordServiceImpl implements WordService {
	
	@Autowired
	private VerbClient verbClient;
	@Autowired
	private SubjectClient subjectClient;
	@Autowired
	private ArticleClient articleClient;
	@Autowired
	private AdjectiveClient adjectiveClient;
	@Autowired
	private NounClient nounClient;

	@Override
	@HystrixCommand(fallbackMethod="getAdjectiveFallBack")
	public Word getAdjective() {
		return adjectiveClient.getWord();
	}
	
	public Word getAdjectiveFallBack() {
		return new Word("");
	}

	@Override
	@HystrixCommand(fallbackMethod="getArticleFallBack")
	public Word getArticle() {
		return articleClient.getWord();
	}
	
	public Word getArticleFallBack() {
		return new Word("a");
	}

	@Override
	@HystrixCommand(fallbackMethod="getNounFallBack")
	public Word getNoun() {
		return nounClient.getWord();
	}
	
	public Word getNounFallBack() {
		return new Word("something");
	}

	@Override
	@HystrixCommand(fallbackMethod="getSubjectFallBack")
	public Word getSubject() {
		return subjectClient.getWord();
	}
	
	public Word getSubjectFallBack() {
		return new Word("Someone");
	}

	@Override
	@HystrixCommand(fallbackMethod="getVerbFallBack")
	public Word getVerb() {
		return verbClient.getWord();
	}
	
	public Word getVerbFallBack() {
		return new Word("fallen");
	}

}
