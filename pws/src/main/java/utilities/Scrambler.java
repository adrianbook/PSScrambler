package utilities;

import java.io.IOException;

public class Scrambler {
	
	static char[] lengthStandardize(char[] in) {
		char out[] = new char[10];
		int possition = 0;
		for (int i = 0; i < 10; i++) {
			if (possition == in.length) {
				possition = 0;
			}
			out[i] = in[possition++];
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
		char finalArray[] = new char[10];
		
		System.out.println(scrambleArray.toString()+finalArray.toString());
		builder.append(s.substring(s.length()/2));
		builder.append(s.substring(0, s.length()/2));
		
		return builder.toString();
	}
	
}
