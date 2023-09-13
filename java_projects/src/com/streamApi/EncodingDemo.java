package com.streamApi;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodingDemo {

	public static void main(String[] args) {
		String pwd = "vtalent_123";
		
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(pwd.getBytes());
		String encodedpwd = new String(encode);
		System.out.println(encodedpwd);
		
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodedpwd);
		String decodedpwd = new String(decode);
		System.out.println(decodedpwd);

	}

}
