// follows examples from the bouncy castle
package org.gazampa.security;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.KeyPair;
import java.util.Date;
import org.bouncycastle.bcpg.ArmoredOutputStream;
import org.bouncycastle.bcpg.HashAlgorithmTags;
import org.bouncycastle.openpgp.PGPEncryptedData;
import org.bouncycastle.openpgp.PGPException;
import org.bouncycastle.openpgp.PGPKeyPair;
import org.bouncycastle.openpgp.PGPPublicKey;
import org.bouncycastle.openpgp.PGPSecretKey;
import org.bouncycastle.openpgp.PGPSignature;
import org.bouncycastle.openpgp.operator.PGPDigestCalculator;
import org.bouncycastle.openpgp.operator.jcajce.JcaPGPContentSignerBuilder;
import org.bouncycastle.openpgp.operator.jcajce.JcaPGPDigestCalculatorProviderBuilder;
import org.bouncycastle.openpgp.operator.jcajce.JcaPGPKeyPair;
import org.bouncycastle.openpgp.operator.jcajce.JcePBESecretKeyEncryptorBuilder;

public class PGPExporter{

	KeyPair pair;
    String identity = "billy.1.murphy@gmail.com";
    char[] passPhrase = {'i','m','o','n','t','h','e','l','i','s','t'};
    PGPKeyPair keyPair;
	PGPSecretKey secret;

	public PGPExporter(KeyPair pair){
		this.pair = pair;
		convertToPGPKeyPair(pair);
	}

	public PGPExporter(KeyPair pair, String identity){
		this.pair = pair;
		this.identity = identity;
		convertToPGPKeyPair(pair);
	}

	public PGPExporter(KeyPair pair, String identity, char[] phrase){
		this.pair = pair;
		this.identity = identity;
		this.passPhrase = phrase;
		convertToPGPKeyPair(pair);
	}

	public PGPKeyPair getPGPKeyPair(){
		return keyPair;
	}

	private void setPGPKeyPair(PGPKeyPair pkp){
		keyPair = pkp;
	}

	private void setSecretKey(PGPSecretKey secretKey){
		this.secret = secretKey;
	}

	public PGPPublicKey getPublicKey(){
		return keyPair.getPublicKey();
	}


	private PGPKeyPair convertToPGPKeyPair(KeyPair pair){
		PGPKeyPair keyPair = null;
		try{
			keyPair = new JcaPGPKeyPair(PGPPublicKey.RSA_GENERAL, pair, new Date());
		}catch(PGPException pgpe){
			System.out.println("problem converting jca key pair");
		}
		setPGPKeyPair(keyPair);
		return keyPair;
	}

	public PGPSecretKey createPGPSecretKey(){
		PGPSecretKey secretKey = null;
		try{
			PGPDigestCalculator sha1Calc = new JcaPGPDigestCalculatorProviderBuilder().build().get(HashAlgorithmTags.SHA1);
			secretKey = new PGPSecretKey(PGPSignature.DEFAULT_CERTIFICATION,
											keyPair, identity, sha1Calc, null, null,
											new JcaPGPContentSignerBuilder(keyPair.getPublicKey().getAlgorithm(),HashAlgorithmTags.SHA1),
											new JcePBESecretKeyEncryptorBuilder(PGPEncryptedData.CAST5, sha1Calc).setProvider("BC").build(passPhrase));
		} catch(PGPException pgpe){
			System.out.println("problem creating the secret key");
		}
		setSecretKey(secretKey);
		return secretKey;
	}

	public void writeSecretStandard(OutputStream out, PGPSecretKey secret) throws IOException{
        secret.encode(out);
        out.close();
	}

	public void writeSecretArmored(OutputStream out, PGPSecretKey secret) throws IOException{
		out = new ArmoredOutputStream(out);
        secret.encode(out);
        out.close();
	}

	public void writePublicStandard(OutputStream out, PGPPublicKey pub) {
		try{
	        pub.encode(out);
	        out.close();
		}catch(IOException ioe){
			System.out.println("problem writing file " + ioe);
		}
	}

	public void writePublicArmored(OutputStream out, PGPPublicKey pub) {
		try{
			out = new ArmoredOutputStream(out);
			pub.encode(out);
			out.close();
		}catch(IOException ioe){
			System.out.println("problem writing file " + ioe);
		}

	}

	public void writePublicStandardForTransfer(OutputStream out, PGPPublicKey pub) {
		try{
			pub.encode(out, true);
			out.close();
		}catch(IOException ioe){
			System.out.println("problem writing file " + ioe);
		}
	}

	public void writePublicArmoredForTransfer(OutputStream out, PGPPublicKey pub) {
		try{
			out = new ArmoredOutputStream(out);
			pub.encode(out, true);
			out.close();
		}catch(IOException ioe){
			System.out.println("problem writing file " + ioe);
		}
	}

	public void writeBytesStandard(OutputStream out, byte[] bytes) {
        try{
        	out.write(bytes);
        	out.close();
		}catch(IOException ioe){
			System.out.println("problem writing file " + ioe);
		}
	}

	public void writeBytesArmored(OutputStream out, byte[] bytes) {
		try{
			out = new ArmoredOutputStream(out);
			out.write(bytes);
			out.close();
		}catch(IOException ioe){
			System.out.println("problem writing file " + ioe);
		}
	}

}