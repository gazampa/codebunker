package org.gazampa.soundex;

import org.apache.commons.codec.language.Soundex;

public enum Singleton{

	SOUNDEX;

	private Singleton(){}

	private final Soundex instance = new Soundex();

	public Soundex getCodecVersion1_6(){
		return instance;
	}


}
