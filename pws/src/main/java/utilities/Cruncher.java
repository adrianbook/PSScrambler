package utilities;

public class Cruncher {
	StringBuilder builder = new StringBuilder();
	
	public String crunch(String s) {
		builder.append(s);
		
		System.out.println("hej hej");
		
		return builder.toString();
	}
	
	
}
