package org.gazampa.datatypes;

import java.lang.Enum;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
public class DataTypes{

/** the way the jvm sees it
*
*
*							/[ floating types ] - [ float, double ]*
*			/ [ numeric ]
*[primitive]				\[ integral types]-[byte, short, int, long, char]
*			\ [ boolean ]
*
*			\ [ returnAddress ]
*
*
*
*[ reference ] - [ reference ] - [ class, interface, type, array ]
*
*
* Java specification states that all memory allocations are aligned to addresses that are divisible by 8
*
**/

	public static void main(String[] args){
		/**
		*	size dependant on vm implementaton
		*	holds only a true or false value
		**/
		boolean bool;

		/**
		*	8-bit signed twos complement
		*	min : -128 max : 127
		*   16 bit version is short : min - 32768 max 32767
		*/
		byte b;
		short sh;

		/**
		*	32 bit signed two complement
		*	min : -2^31 max : 2^31 -1
		*	64 bit version is long : min : -2^64 max : 2^64 - 1
		*/
		int i;
		long l;

		/**
		*	8 / 16 bytes of object overhead
		*	size of Integer is jvm dependant ~ 128 bits on a 32 bit machine, x2 for 64
		**/
		Integer integer;

		/**
		*	8 / 16 bytes of object overhead
		*	size of Long is jvm dependant ~ 144 bits on a 32 bit machine, x2 for 64
		**/
		Long longInteger;

		/**
		*	Immutable arbitrary-precision integers.
		*	operations behave as if BigIntegers were represented in two's-complement notation
		*	8 / 16 bytes of object overhead
		**/
		BigInteger bi;

		/**
		*	single-precision 32 bit IEEE 754 floating point
		*	positive and negative numbers that consist of a sign and magnitude, but also positive and negative zeros, positive and negative infinities, and special Not-a-Number values
		*	min / max : s · m · 2(e - N + 1), where s is +1 or -1, m is a positive integer less than 2N, and e is an integer between Emin = -(2K-1-2) and Emax = 2K-1-1, inclusive, and where N and K are parameters that depend on the value set.
		*	bit zero is the sign bit, S,
		*	bit[1-8] are the exponent bits, 'E', and
		*	bit[9-32] bits are the fraction 'F':
		*
		*	double-precision 64 bit IEEE 754 floating point
		*	bit zero is the sign bit, S,
		*	bit[1-11] are the exponent bits, 'E', and
		*	bit[12-63] bits are the fraction 'F':
		*
		*	8 / 16 bytes of object overhead
		**/
		float f;
		double d;

		/**
		* Immutable, arbitrary-precision signed decimal numbers.
		* 8 / 16 bytes of object overhead
		* consists of an arbitrary precision integer unscaled value and a 32-bit integer scale
		* provides operations for arithmetic, scale manipulation, rounding, comparison, hashing, and format conversion.
		*/
		BigDecimal	bd;

		/**
		*	16 bit
		*	min : '\u0000' (or 0) max : '\uffff' (or 65,535 inclusive).
		*	holds a Unicode Character, UTF-16 encoding
		**/
		char c;

		/**
		*	an object, with methods, that represents an immutable series of char
		*	- a char array, thus a separate object containing the actual characters;
		*	- an integer offset into the array at which the string starts; ( not in java 8 )
		*	- the length of the string ( not in java 8 )
		*	- another int for the cached calculation of the hash code.
		*	- Minimum String memory usage (bytes) = 8 * (int) ((((no chars) * 2) + 45) / 8) - 32 bit jvm
		*	- Minimum String memory usage (bytes) = 8 * (int) ((((no chars) * 2) + 37) / 8)	- 32 bit jvm
		**/
		String str;

		/**
		*	holds a fixed size indexed series of elements of the same type
		*	in java an arrays type can be reassigned to a subtype, covariant -- > led to generics
		*	size depandant on data and declared at initialization, memory managed by jvm
		*	jvm uses pointer arithmitic [ptr0, ptr1, ptr2, ptr3, ptr4, ptr5 , ptr5, ... , ptrn ]
		*
		*	A single-dimension array is a single object.
		*	The array has the usual object header. However, this object head is 12/24 bytes to accommodate a four-byte array length.
		*	Then comes the actual array data which, as you might expect, consists of the number of elements
		*	multiplied by the number of bytes required for one element, depending on its type.
		*	The memory usage for one element is 4 bytes for an object reference.
		*	If the total memory usage of the array is not a multiple of 8 / 16 bytes, then the size is rounded up to the next mutlitple of 8 (just as for any other object).
		**/
		int[] iArr;

		/**
		*	user defined data types
		*
		**/
		Reference ref;

		/**
		*	Technically an object so 8/16 bytes of object overhead
		*	- As its a singleton, each reference cost less, typically 4 bytes
		*
		**/
		Enum<enm> enm; // for looks, its actually an enumeration of the enumeration

		/** reference article for this collections section : http://java-performance.info/memory-consumption-of-java-data-types-1/
		*
		*	The following table summarizes the storage occupied per stored value assuming that
		*	a reference occupies 4 bytes. Note that you must spend 4 byte per Object reference
		*	in any case, so subtract 4 bytes from the values in the following table to find out the storage overhead.
		*
		*	EnumSet, BitSet	1 bit per value
		*	EnumMap	4 bytes (for value, nothing for key)
		*	ArrayList	4 bytes (but may be more if ArrayList capacity is seriously more than its size)
		*	LinkedList	24 bytes (fixed)
		*	ArrayDeque	4 to 8 / 16 bytes, 6 bytes on average
		*
		**/

		/**
		*	HeapByteBuffer 64 bit
		*	Field	Type	Size (bytes)
		*	HEADER		16
		*	PADDING		1
		*	address	long	8
		*	bigEndian	boolean	1
		*	capacity	int	4
		*	hb	byte[]	4
		*	isReadyOnly	boolean	1
		*	limit	int	4
		*	mark	int	4
		*	nativeByteOrder	boolean	1
		*	offset	int	4
		*	position	int	4
		*
		**/
		ByteBuffer byteBuffer;

		/**
		*	Each thread of a running program has its own pc register, or program counter, which is created when the thread is started.
		*	The pc register is one word in size, so it can hold both a native pointer and a returnAddress.
		*	As a thread executes a Java method, the pc register contains the address of the current instruction being executed by the thread.
		*	An "address" can be a native pointer or an offset from the beginning of a method's bytecodes.
		*	If a thread is executing a native method, the value of the pc register is undefined.
		*	Each thread gets its own stack.
		*	Threads share the Heap.
		*	A Java stack stores a thread's state in discrete frames.
		*	The Java virtual machine only performs two operations directly on Java Stacks: it pushes and pops frames.
		*	The stack frame has three parts: local variables, operand stack, and frame data.
		*
		**/
		Thread thread;


	}

	/**
	*	Object Size
	*	Java specification states that all memory allocations are aligned to addresses that are divisible by 8
	* 	an object header, consisting of a few bytes of "housekeeping" information;
	*	memory for primitive fields, according to their size (see below);
	*	memory for reference fields (4 bytes each);
	*	padding: potentially a few "wasted" unused bytes after the object data, to make every object start at an address that is a convenient multiple of bytes and reduce the number of bits required to represent a pointer to an object.
	*
	*	housekeeping refers to
	*	- recording an object's class, ID and status flags such as whether the object is currently reachable, currently synchronization-locked
	*
	*
	* 	Java type	Bytes required
	*	boolean	1
	*	byte
	*	char	2
	*	short
	*	int	4
	*	float
	*	long	8
	*	double
	**/
	class Reference{
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		boolean bool;
		char c;
		String str;
	}

	/**
	*	Technically an object so 8/16 bytes of object overhead
	*	- As its a singleton, each reference cost less, typically 4 bytes
	*
	**/
	enum enm{
    	ONE, TWO, THREE
	}
}