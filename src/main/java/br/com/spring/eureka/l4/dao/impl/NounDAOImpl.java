package br.com.spring.eureka.l4.dao.impl;

import org.springframework.stereotype.Component;

@Component("nounService")
public class NounDAOImpl extends WordDAOImpl {

	@Override
	public String getPartOfSpeech() {
		return NOUN;
	}

}
