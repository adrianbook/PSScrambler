package ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IoControl {
	private String userPassword;
	private String checkedUserPassword;
	private static StringBuilder sb = new StringBuilder();
	public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public int inputQuit() {

		if (userPassword.trim().toLowerCase().equals("q")) {
			return 0;
		}
		return 1;
	}

	public int checkLength() {
		if (userPassword.length() > 3 && userPassword.length() < 11) {
			return (1);
		}
		return (-1);
	}

	public int checkChars() {
		sb.setLength(0);
		for (char ch : userPassword.toCharArray()) {
			if (String.valueOf(ch).matches("[a-zA-Z_0-9]+") == true) {
				sb.append(ch);
				if (sb.length() == userPassword.length()) {
					checkedUserPassword = sb.toString();
					System.out.println(checkedUserPassword + " is ok!");
					System.out.println("New password is:");
					return (0);
				}
			}
		}
		return (-1);
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getCheckedUserPassword() {
		return checkedUserPassword;
	}
}