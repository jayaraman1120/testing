package org.jaya.javatestproject.scim.service;

import java.util.Base64;
import java.util.Base64.Encoder;

import org.jaya.javatestproject.scim.model.Token;

public class TokenService {

	public Token getToken(String content) {
		Encoder encoder = Base64.getEncoder();
		String originalString = content;
		String encodedString = encoder.encodeToString(originalString.getBytes());
		return new Token(encodedString);
		
	}

}
