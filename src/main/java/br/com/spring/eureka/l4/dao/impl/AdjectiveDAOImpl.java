package br.com.spring.eureka.l4.dao.impl;

import org.springframework.stereotype.Component;

@Component("adjectiveService")
public class AdjectiveDAOImpl extends WordDAOImpl {
	
	@Override
	public String getPartOfSpeech() {
		return ADJECTIVE;
	}

}
