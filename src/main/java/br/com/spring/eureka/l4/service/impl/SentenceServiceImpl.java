package br.com.spring.eureka.l4.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spring.eureka.l4.client.AdjectiveClient;
import br.com.spring.eureka.l4.client.ArticleClient;
import br.com.spring.eureka.l4.client.NounClient;
import br.com.spring.eureka.l4.client.SubjectClient;
import br.com.spring.eureka.l4.client.VerbClient;
import br.com.spring.eureka.l4.service.SentenceService;

@Service
public class SentenceServiceImpl implements SentenceService {

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
	

	/**
	 * Assemble a sentence by gathering random words of each part of speech:
	 */
	public String buildSentence() {
		String sentence = "There was a problem assembling the sentence!";
		sentence =  
			String.format("%s %s %s %s %s.",
				subjectClient.getWord().getString(),
				verbClient.getWord().getString(),
				articleClient.getWord().getString(),
				adjectiveClient.getWord().getString(),
				nounClient.getWord().getString() );
		return sentence;
	}
}