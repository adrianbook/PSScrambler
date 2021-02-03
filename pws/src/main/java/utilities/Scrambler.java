package utilities;

import java.io.IOException;

public class Scrambler {
	
	static char[] lengthStandardize(char[] in) {
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
