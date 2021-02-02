package ui;

import utilities.Cruncher;
import utilities.Scrambler;

public class Main {

	public static void main(String[] args) {
		Cruncher cruncher = new Cruncher();
		Scrambler scrambler = new Scrambler();
		String s = "Password";
		
		String scrambled = scrambler.scramble(s);
		
		String crunched = cruncher.crunch(scrambled);
		
		System.out.println("Scrambled: " + scrambled);
		System.out.println("Crunched: " + crunched);
	}

}
