package br.com.spring.eureka.l4.domain;

import java.io.Serializable;

public class Word implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1317447599052798003L;
	
	public String word;

	public Word() {
		super();
	}

	public Word(String word) {
		this();
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public String getString() {
		return getWord();
	}

	public void setWord(String word) {
		this.word = word;
	}

}
