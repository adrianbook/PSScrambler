/**
 * Class writen by Björn Munthe
 **/

package utilities;

import java.util.List;


public class Cruncher {
	private StringBuilder builder = new StringBuilder();
	private char[] specialSigns = { '@', '%', '+', '/', '!', '#', '$', '?', '(', ')' };
	private List<Character> randomChar1 = List.of('q', 'w', 'e', 't', 'y', 'u', 'i', 'a');
	private List<Character> randomChar2 = List.of('s', 'd', 'f', 'g', 'j', 'k', 'l', 'z');
	private List<Character> randomChar3 = List.of('v', 'n', 'm', 'p', 'o', 'x', 'c');
	private List<Character> randomChar4 = List.of('v', 'b', 'n', 'm', 'h', 'r', 'b');

	/**
	 * 
	 * @param a 10 char string
	 * @return a string with new characters
	 */
	public String crunch(String s) {
		String output = null;
		if (s.length() != 10) {
			throw (new RuntimeException("Något gick fel"));
		} else {
			s = addSpecialSigns(s);
			output = addNumbers(s);
		}

		return output;
	}

	/**
	 * A method that exchanges letters to special signs
	 * @param String s
	 * @return a changed string
	 */
	public String addSpecialSigns(String s) {
		char[] letters = s.toCharArray();
		for (int i = 0; i < letters.length; ++i) {
			if (randomChar1.contains(letters[i])) {
				builder.append(specialSigns[i]);
			} else if (randomChar3.contains(letters[i])) {
				builder.append(specialSigns[specialSigns.length - i]);
			} else {
				builder.append(letters[i]);
			}
		}
		return builder.toString();
	}
	
	/**
	 * a method that exchange letters to numbers
	 * 
	 * @param A string containing letters and special characters
	 * @return A string with numbers
	 */
	public String addNumbers(String s) {
		char[] letters = s.toCharArray();

		for (int i = 0; i < letters.length; ++i) {
			if (randomChar2.contains(letters[i])) {
				builder.append(String.valueOf(10 - i + 1));
			} else if (randomChar4.contains(letters[i])) {
				builder.append(String.valueOf(i + 10 / 2));
			} else {
				builder.append(letters[i]);
			}
		}
		return builder.toString();
	}
}
