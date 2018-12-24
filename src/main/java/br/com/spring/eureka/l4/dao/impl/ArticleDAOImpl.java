package br.com.spring.eureka.l4.dao.impl;

import org.springframework.stereotype.Component;

@Component("articleService")
public class ArticleDAOImpl extends WordDAOImpl {

	@Override
	public String getPartOfSpeech() {
		return ARTICLE;
	}

}
