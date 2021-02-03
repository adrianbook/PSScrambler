package ui;

import java.io.IOException;

import utilities.Cruncher;
import utilities.Scrambler;

public class Main {

	public static void main(String[] args) {
		Cruncher cruncher = new Cruncher();
		String s = "Password";
		
		try {
			String scrambled = Scrambler.scramble(s);			
			String crunched = cruncher.crunch(scrambled);
			
			System.out.println("Scrambled: " + scrambled);
			System.out.println("Crunched: " + crunched);
		}
		
		catch (IOException exc) {
			
		}
	}

}
