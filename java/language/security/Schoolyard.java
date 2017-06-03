package org.gazampa.security;

import java.util.Arrays;

	/** Perform a mathematical operation on a string of characters/numbers to hide their meaning **/

public class Schoolyard{

	public static void main(String[] args){

		char[] input = new char[]{'i','m', ' ', 'i', 'n', ' ', 'h', 'e', 'r', 'e'};

		int[] cipher = new int[input.length];

		char[] output = new char[input.length];

		System.out.println("input : " + Arrays.toString(input));

		for (int i = 0, j = input.length; i < j; i++ ){
			cipher[i] =  input[i] + 5;
		}

		System.out.println("cipher natural : " + Arrays.toString(cipher));

		for (int i = 0, j = cipher.length; i < j; i++ ){
			output[i] = ( char ) ( cipher[i] );
		}

		System.out.println("cipher clear text : " +Arrays.toString(output));

		for (int i = 0, j = cipher.length; i < j; i++ ){
			output[i] = ( char ) ( cipher[i] - 5 );
		}

		System.out.println("output : " + Arrays.toString(output));

	}

}