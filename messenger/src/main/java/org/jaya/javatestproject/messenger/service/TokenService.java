package org.jaya.javatestproject.messenger.service;

import org.jaya.javatestproject.messenger.model.Token;

public class TokenService {

	public Token getToken(String content) {
		return new Token(content);
		
	}

}
