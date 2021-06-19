package com.Encryption;

import java.util.Base64;


public class EncodeDecode {

	
	public static String getEncodePassword()	
	{
		String password="123456";
		return new String(Base64.getEncoder().encode(password.getBytes()));
	}

	public static String getDecodepassword()
	{
		return new String(Base64.getDecoder().decode(getEncodePassword().getBytes()));
	}


}
