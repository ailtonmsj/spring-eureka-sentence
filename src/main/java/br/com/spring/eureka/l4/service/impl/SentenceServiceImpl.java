package br.com.spring.eureka.l4.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spring.eureka.l4.dao.WordDAO;
import br.com.spring.eureka.l4.service.SentenceService;

@Service
public class SentenceServiceImpl implements SentenceService {

	private WordDAO verbService;
	private WordDAO subjectService;
	private WordDAO articleService;
	private WordDAO adjectiveService;
	private WordDAO nounService;
	

	/**
	 * Assemble a sentence by gathering random words of each part of speech:
	 */
	public String buildSentence() {
		String sentence = "There was a problem assembling the sentence!";
		sentence =  
			String.format("%s %s %s %s %s.",
				subjectService.getWord().getString(),
				verbService.getWord().getString(),
				articleService.getWord().getString(),
				adjectiveService.getWord().getString(),
				nounService.getWord().getString() );
		return sentence;
	}


	@Autowired
	public void setVerbService(WordDAO verbService) {
		this.verbService = verbService;
	}

	@Autowired
	public void setSubjectService(WordDAO subjectService) {
		this.subjectService = subjectService;
	}

	@Autowired
	public void setArticleService(WordDAO articleService) {
		this.articleService = articleService;
	}

	@Autowired
	public void setAdjectiveService(WordDAO adjectiveService) {
		this.adjectiveService = adjectiveService;
	}

	@Autowired
	public void setNounService(WordDAO nounService) {
		this.nounService = nounService;
	}
}