package br.com.spring.eureka.l4.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spring.eureka.l4.service.SentenceService;
import br.com.spring.eureka.l4.service.WordService;

@Service
public class SentenceServiceImpl implements SentenceService {

	@Autowired
	private WordService wordService;
	

	/**
	 * Assemble a sentence by gathering random words of each part of speech:
	 */
	public String buildSentence() {
		String sentence = "There was a problem assembling the sentence!";
		sentence =  
			String.format("%s %s %s %s %s.",
				wordService.getSubject().getString(),
				wordService.getVerb().getString(),
				wordService.getArticle().getString(),
				wordService.getAdjective().getString(),
				wordService.getNoun().getString() );
		return sentence;
	}
}