package org.gazampa.security;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
public class RSAKeyGenerator{

	public static void main(String[] args){
		// generate an asymmetric key pair
		try{

			// specify the algorithm and provider for a key pair using jce libraries / Diffie Hellman, DSA, RSA
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA", "SunRsaSign");

			//Returns a SecureRandom object that was selected by using the algorithms/providers specified in the securerandom.strongAlgorithms Security property that java ships with
			SecureRandom random = SecureRandom.getInstanceStrong();

			// Initializes the key pair generator for a certain keysize using a default parameter set and the SecureRandom implementation of the highest-priority installed provider as the source of randomness.
	        keyGen.initialize(2048, random);

			// This will generate a new key pair every time it is called.
	        KeyPair  kp = keyGen.generateKeyPair();

            PrivateKey priv = kp.getPrivate();

            PublicKey pub = kp.getPublic();

			//Returns the key in its primary encoding format,
			byte[] privBytes = priv.getEncoded();
			byte[] pubBytes = pub.getEncoded();

			// generate a base64 encoding and write to files
			String privB64Enc = Base64.getEncoder().encodeToString(privBytes);
			String pubB64Enc = Base64.getEncoder().encodeToString(pubBytes);

			System.out.println(Arrays.toString(privBytes));
			System.out.println(Arrays.toString(pubBytes));

			System.out.println(privB64Enc);
			System.out.println(pubB64Enc);

			FileOutputStream file = new FileOutputStream("rsa-2048-key-private");
			file.write(privBytes);
			file.close();
			FileOutputStream filePub = new FileOutputStream("rsa-2048-key-public");
			filePub.write(pubBytes);
			filePub.close();

			FileWriter fileB64 = new FileWriter("rsa-2048-key-private-base64");
			fileB64.write(privB64Enc);
			fileB64.close();
			FileWriter fileB64Pub = new FileWriter("rsa-2048-key-public-base64");
			fileB64Pub.write(pubB64Enc);
			fileB64Pub.close();

		}catch(Exception e){
			System.out.println("The writer is unable to write " + e);
		}

	}

}