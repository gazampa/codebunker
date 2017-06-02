package org.gazampa.security;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.PrivateKey;
import java.security.Security;
import java.security.SignatureException;
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import org.bouncycastle.openpgp.PGPKeyPair;
import org.bouncycastle.openpgp.PGPPublicKey;
import org.bouncycastle.openpgp.PGPPrivateKey;
import org.bouncycastle.openpgp.PGPSecretKey;
import org.bouncycastle.openpgp.PGPUtil;
import org.bouncycastle.openpgp.PGPException;
import org.bouncycastle.bcpg.SymmetricKeyAlgorithmTags;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
public class PGPKeyGenerator{

	public static void main(String[] args){
		// generate a pgp key pair
		try{

			Security.addProvider(new BouncyCastleProvider());
			// specify the algorithm for a key pair using new provider version
			KeyPairGenerator    kpg = KeyPairGenerator.getInstance("RSA", "BC");

			//Returns a SecureRandom object that was selected by using the algorithms/providers specified in the securerandom.strongAlgorithms Security property that java ships with
			SecureRandom random = SecureRandom.getInstanceStrong();

			// Initializes the key pair generator for a certain keysize using a default parameter set and the SecureRandom implementation of the highest-priority installed provider as the source of randomness.
			kpg.initialize(2048, random);

			// This will generate a jce new key pair
	        KeyPair  kp = kpg.generateKeyPair();

	        // pass over to utility class that has bouncy castle logic
		    String identity = "billy.1.murphy@gmail.com";
		    char[] passPhrase = {'i','m','o','n','t','h','e','l','i','s','t'};

	        PGPExporter ex = new PGPExporter(kp, identity, passPhrase);

			PGPKeyPair keyPairPGP = ex.getPGPKeyPair();

			PGPPrivateKey priv = ex.getPrivateKey();

			PGPPublicKey pub = ex.getPublicKey();

			PGPSecretKey secret = ex.createPGPSecretKey();

			//Returns the key in its primary encoding format,
			byte[] privBytes = keyPairPGP.getPrivateKey().getPrivateKeyDataPacket().getEncoded();
			byte[] pubBytes = pub.getEncoded();
			byte[] secretBytes = secret.getEncoded();

			// generate a base64 encoding and write each to files
			String privB64Enc = Base64.getEncoder().encodeToString(privBytes);
			String pubB64Enc = Base64.getEncoder().encodeToString(pubBytes);
			String secretB64Enc = Base64.getEncoder().encodeToString(secretBytes);

			System.out.println(Arrays.toString(secretBytes));
			System.out.println(Arrays.toString(pubBytes));
			System.out.println(Arrays.toString(privBytes));

			System.out.println(secretB64Enc);
			System.out.println(pubB64Enc);
			System.out.println(privB64Enc);

            FileOutputStream out1 = new FileOutputStream("pgp-secret-2048.asc");
            FileOutputStream out2 = new FileOutputStream("pgp-pub-2048.asc");
            FileOutputStream out3 = new FileOutputStream("pgp-secret-2048.bpg");
            FileOutputStream out4 = new FileOutputStream("pgp-pub-2048.bpg");

			ex.writeSecretArmored(out1, secret);
			ex.writeSecretStandard(out3, secret);
			ex.writePublicArmored(out2, pub);
			ex.writePublicStandard(out4, pub);

		}catch(Exception e){
			System.out.println("The writer is unable to write " + e);
		}

	}

}