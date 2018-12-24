package br.com.spring.eureka.l4.dao.impl;

import org.springframework.stereotype.Component;

@Component("subjectService")
public class SubjectDAOImpl extends WordDAOImpl {

	@Override
	public String getPartOfSpeech() {
		return SUBJECT;
	}

}
