package org.gazampa.security;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import org.bouncycastle.openpgp.PGPKeyPair;
import org.bouncycastle.openpgp.PGPUtil;
import org.bouncycastle.openpgp.PGPException;
import org.bouncycastle.bcpg.SymmetricKeyAlgorithmTags;
public class AESKeyGenerator{

	public static void main(String[] args){
		// generate a symmetric key
		try{
			SecureRandom random = SecureRandom.getInstanceStrong();
			byte[] 	symKey = PGPUtil.makeRandomKey(SymmetricKeyAlgorithmTags.AES_256, random);
			String encoded = Base64.getEncoder().encodeToString(symKey);
			System.out.println(Arrays.toString(symKey));
			System.out.println(encoded);
			FileOutputStream file = new FileOutputStream("aes-256-key");
			file.write(symKey);
			file.close();
			FileWriter fileB64 = new FileWriter("aes-256-key-base64");
			fileB64.write(encoded);
			fileB64.close();
		}catch( NoSuchAlgorithmException nsae){
			System.out.println("Secure Random is not able to find an algorithm");
		}catch(PGPException pgpe){
			System.out.println("PGPutil is unable to generate a key");
		}catch(FileNotFoundException fnfe){
			System.out.println("File Not Found");
		}catch(IOException ioe){
			System.out.println("The writer is unable to write");
		}

	}

}