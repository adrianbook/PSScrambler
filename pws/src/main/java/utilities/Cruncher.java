package utilities;

public class Cruncher {
	StringBuilder builder = new StringBuilder();
	
	public String crunch(String s) {
		builder.append(s);
		builder.append("Fuck off!");
		
		return builder.toString();
	}
}
