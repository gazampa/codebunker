package org.gazampa.datastructures;

import java.util.HashMap;
import org.apache.commons.codec.binary.Base64;
import stopwatch.StopWatch;

class HashMapExample{

	/**
	*	HashMaps are :
	*					- a data structure made from others, generally array and linked lists
	*					- each element / entry index is generated from the content of the element, this forms a pointer to the content structure
	*					- each entry is scattered around the array
	*					- if hashcodes are the same ( but content different ), content is added to a list at that hashcodes index
	*					- removes the need to search for elements, other than collided,
	*					- Unsynchronized
	*					- a little more dificult to iterate over all entries values in structure, and capacity dependant
	*					- The add operation is O(1) for uncollided, otherwise O(1) + O(1), O(2), The retrieve operation is O(1) for uncollided, otherwise O(n)
	*					- Java 8 uses a red black binary tree instead of a linkedlist reducing retrieve times for collided objects from o(n) to o(log n)
	*					- The capacity is the number of buckets in the hash table, the load factor is a measure of how full the hash table is allowed to get before its capacity is automatically increased.
	*					- increasing the size / capacity will involve rehashing all the entries.
	*					- if you use the division method for codes, size the map to that of a prime.
	*					- always maintain hashcode / equals contract, joshua block examples, effective java - also favor composition.
	*					- the hashCode method must consistently return the same integer but only within the same execution environment
	**/

	public static void main(String[] args){

		HashMap<CreateAnIndex, CreateAnIndex> players = new HashMap<CreateAnIndex, CreateAnIndex>(100003, 0.75f);

		HashMap<CreateAPoorIndex, CreateAPoorIndex> players2 = new HashMap<CreateAPoorIndex, CreateAPoorIndex>(100003, 0.75f);

		StopWatch count = new StopWatch();

		for (int i = 0, j = 5000; i < j; i++){
			String name = "player " + i;
			String position = "attacker " + i;
			int number  = i;
			int rating = 100+i;
			CreateAnIndex player = new CreateAnIndex(name, position, number, rating);
			players.put(player, player);
			CreateAPoorIndex player2 = new CreateAPoorIndex(name, position, number, rating);
			players2.put(player2, player2);
		}


		CreateAnIndex aPlayer = new CreateAnIndex("player 2500", "attacker 2500", 2500, 2510 );

		CreateAPoorIndex a2Player = new CreateAPoorIndex("player 2500", "attacker 2500", 2500, 2510 );

		count.start();

		CreateAnIndex returnedPlayer = players.get(aPlayer);

		count.stopAndReport();

		count.restart();

		CreateAPoorIndex returned2Player = players2.get(a2Player);

		count.stopAndReport();

	}
}

class CreateAnIndex{

	private final String name;
	private final String position;
	private final int number;
	private final int rating;

	public CreateAnIndex(String name, String position, int number, int rating){
		this.name = name;
		this.position = position;
		this.number = number;
		this.rating = rating;
	}

	@Override
	public boolean equals(Object o2){
		boolean result = false;
		if (o2!=null && !(o2 instanceof CreateAnIndex)  ) return false;

		if ( this == o2 ) return true;

		CreateAnIndex other = (CreateAnIndex)o2;
		if ( other.getName().equals(this.name) &&
			  other.getPosition().equals(this.position) &&
			   other.getNumber() == this.number ){
			return true;
		}

		return result;
	}

	// javas hashcode for string is : s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
	@Override
	public int hashCode(){
		int hash = 7;

		hash = 31 * name.hashCode();
		hash = 31 * position.hashCode();
		hash = 31 * number;

		return  hash;

	}
/**
			Another way to hash

			//convert all the fields of the object into a single string
			String stringToHash = name + position + number;

			//pass into an encrytion grade hashing function
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
			messageDigest.update(stringToHash.getBytes("UTF-8"));
			String hashedString = new String(messageDigest.digest(), "UTF-8");

			// get the hashcode of that string
			 return hashedString.hashCode();

**/
	public String getName(){
		return name;
	}

	public String getPosition(){
		return position;
	}

	public int getNumber(){
		return number;
	}

	public int getRating(){
		return rating;
	}

	@Override
	public String toString(){
		StringBuilder strb = new StringBuilder();
		strb.append(getName());strb.append(" : ");
		strb.append(getNumber());strb.append(" : ");
		strb.append(getPosition());strb.append(" : ");
		strb.append(getRating());strb.append(" . ");//strb.append("\n");
		return strb.toString();
	}
}

class CreateAPoorIndex{

	private final String name;
	private final String position;
	private final int number;
	private final int rating;

	public CreateAPoorIndex(String name, String position, int number, int rating){
		this.name = name;
		this.position = position;
		this.number = number;
		this.rating = rating;
	}

	@Override
	public boolean equals(Object o2){
		boolean result = false;
		if (o2!=null && !(o2 instanceof CreateAPoorIndex)  ) return false;

		if ( this == o2 ) return true;

		CreateAPoorIndex other = (CreateAPoorIndex)o2;
		if ( other.getName().equals(this.name) &&
			  other.getPosition().equals(this.position) &&
			   other.getNumber() == this.number ){
			return true;
		}

		return result;
	}

	// javas hashcode for string is : s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
	@Override
	public int hashCode(){

		return 7;

	}

	public String getName(){
		return name;
	}

	public String getPosition(){
		return position;
	}

	public int getNumber(){
		return number;
	}

	public int getRating(){
		return rating;
	}

	@Override
	public String toString(){
		StringBuilder strb = new StringBuilder();
		strb.append(getName());strb.append(" : ");
		strb.append(getNumber());strb.append(" : ");
		strb.append(getPosition());strb.append(" : ");
		strb.append(getRating());strb.append(" . ");//strb.append("\n");
		return strb.toString();
	}
}