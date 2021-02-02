package utilities;

public class Scrambler {
	StringBuilder builder = new StringBuilder();
	public String scramble(String s) {
		builder.append(s.substring(s.length()/2));
		builder.append(s.substring(0, s.length()/2));
		
		return builder.toString();
	}
}
