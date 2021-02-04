/**
 * Class for scrambling Strings 
 * written by Adrian Book adrianbook@gmail.com
 * for Utvecklingsverktyg2
 **/ 
 package utilities;

import java.io.IOException;

public class Scrambler {
	/**
	 * Static method for making a char[] of length 10 by repeating the characters of the input char[]
	 * @param in char[] to be lenghtend
	 * @return a char[] of length 10. if the input char[] contains exactly ten characters it is returned unchanged
	 */
	static char[] lengthStandardize(char[] in) {
		if (in.length == 10) {
			return in;
		}
		char out[] = new char[10];
		int position = 0;
		for (int i = 0; i < 10; i++) {
			if (position == in.length) {
				position = 0;
			}
			out[i] = in[position++];
		}
		return out;
	}
	/**
	 * Static method for scrambling a char[] according to a pattern determined by an int
	 * @param s int derived from the String parameter of the scramble() method
	 * @param arr the char[] to be scrambled
	 * @return an array containing characters from the parameter char[]
	 */
	static char[] arrayScrambler(int s, char[] arr) {
		int key = s;
		char arr1[] = new char[10];
		char arr2[] = new char[10];
		char out[] = new char[10];
		if (key == 10) {
			key = 0;
		} 
		for (int i = 0; i < 10; i++) {
			if (i<9) {
				arr1[i] = arr[i+1];		
			} else {
				arr1[i] = arr[0];
			}
			arr2[i] = arr[9-i];
		}
		for (int i = 0; i < 10; i++) {
			if (key < 0) {
				if (i % 2 == 0) {
					out[i] = arr1[i];
				} else {
					out[i] = arr2[i];
				}
			} else {
				if (i % 2 == 0) {
						out[i] = arr2[i+1];					
				} else {
					out[i] = arr1[i];
				}
			}
			key--;
		}
		return out;
	}
	/**
	 * Static method for scrambling a String and changing its length to 10 characters. Calls the statis methods lengthStandardize() and arrayScrambler():
	 * @param s the String to be scrambled. Must be in the length interval 4-10 characters lest an exception is thrown
	 * @return a String of length 10 containing characters from the input String
	 * @throws IOException thrown if length of the input String is outside the interval of 4-10
	 */
	public static String scramble(String s) throws IOException{
		
		if (s.length() < 4 || s.length() > 10) {
			throw new IOException();
		}
		
		StringBuilder builder = new StringBuilder();
		char[] sArray = s.toCharArray();
		char scrambleArray[] = lengthStandardize(sArray);
		char finalArray[] = arrayScrambler(s.length(), scrambleArray);
		
		for (char c : finalArray) {
			builder.append(c);
		}
		
		return builder.toString();
	}
	
}
