package br.com.spring.eureka.l4.dao.impl;

import org.springframework.stereotype.Component;

@Component("verbService")
public class VerbDAOImpl extends WordDAOImpl {

	@Override
	public String getPartOfSpeech() {
		return VERB;
	}

}
