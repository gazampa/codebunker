package org.gazampa.random;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import org.apache.commons.codec.binary.Base64;

class MakeAHashOfThings{

	public static void main(String[] args){

		String stringToEncrypt;

		if ( args.length > 0 )
			stringToEncrypt = args[0];
		else
			stringToEncrypt = "this is a test string";

		try{
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
			messageDigest.update(stringToEncrypt.getBytes("UTF-8"));
			String encryptedString = new String(messageDigest.digest(), "UTF-8");
			System.out.println(encryptedString.hashCode());
		}catch(UnsupportedEncodingException ex){
			System.out.println("Ooops, I dont know that encoding " + ex.toString());
		}catch(NoSuchAlgorithmException ex){
			System.out.println("Ooops, no such algorithm. the following are provided");
			System.out.println();
			listProvidersAndAlgorithms();
		}

	}


    public static void listProvidersAndAlgorithms() {
        for (Provider provider : Security.getProviders()) {
            System.out.println("Provider: " + provider.getName());
            for (Provider.Service service : provider.getServices()) {
                System.out.println("  - " + service.getAlgorithm());
            }
        }

    }


}