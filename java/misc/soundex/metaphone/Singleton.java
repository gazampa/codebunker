package org.gazampa.soundex.metaphone;

import org.apache.commons.codec.language.DoubleMetaphone;

public enum Singleton{

	METAPHONE;

	private Singleton(){}

	private final DoubleMetaphone instance = new DoubleMetaphone();

	public DoubleMetaphone getCodecVersion1_10(){
		return instance;
	}

}
