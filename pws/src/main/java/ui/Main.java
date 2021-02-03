package ui;

import java.io.IOException;

import utilities.Cruncher;
import utilities.Scrambler;

public class Main {
	public static void main(String[] args) throws IOException {

		IoControl ioControl = new IoControl();
		Cruncher cruncher = new Cruncher();

		System.out.println(
				"Welcome. This application converts a password containing only letters to a more secure password containing 10 letters, digits and special characters");
		System.out.println("Enter q to quit at any time.");
		System.out.println("Please enter source password.");

		int i = 1;
		while (i != 0) {
			i = 1;
			ioControl.setUserPassword(ioControl.reader.readLine());
			i = i * ioControl.inputQuit();
			i = i * ioControl.checkLength();
			if (i > 0) {
				i = i * ioControl.checkChars();
			}
			if (i < 0) {
				System.out.println("Source password must contain 4-10 english letters or digits.");
			}
		}
		/*
		 * Här skall vi anropa metoderna i instanserna av de två andra klasserna för att
		 * sedan returnera det färdiga lösenordet
		 */
		if (ioControl.inputQuit()!=0){
		try {
			String scrambled = Scrambler.scramble(ioControl.getCheckedUserPassword());
			String crunched = cruncher.crunch(scrambled);

			System.out.println("(Scrambled: " + scrambled + ")");
			System.out.println("(Crunched: " + crunched + ")");
			System.out.println(crunched);
		}

		catch (IOException exc) {
		}
	}
		System.out.println("quitting...");
	}
}
