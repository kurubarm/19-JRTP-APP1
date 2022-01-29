package com.inashokit.security.service;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	
	
	public String encrypt(String message) {
	Encoder encode=Base64.getEncoder();
	String encryptedMessage=encode.encodeToString(message.getBytes());
	return encryptedMessage;
	}
	
	public String decrypt(String message) {
		Decoder decode=Base64.getDecoder();
		byte[] decryptMessage=decode.decode(message.getBytes());
		return new String(decryptMessage);
		
	}
	
	}


