package utilities;

import java.util.List;

public class Cruncher {
	StringBuilder builder = new StringBuilder();
	char[] specialSigns = { '@', '%', '+', '/', '!', '#', '$', '?', '(', ')' };
	List<Character> randomChar1 = List.of('q', 'w', 'e', 't', 'y', 'u', 'i', 'a');
	List<Character> randomChar2 = List.of('s', 'd', 'f', 'g', 'j', 'k', 'l', 'z');
	List<Character> randomChar3 = List.of('v', 'n', 'm', 'p', 'o', 'x', 'c');
	List<Character> randomChar4 = List.of('v', 'b', 'n', 'm', 'h', 'r', 'b');

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

	private String addSpecialSigns(String s) {
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

	private String addNumbers(String s) {
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
