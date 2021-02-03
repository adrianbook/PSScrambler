package ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Used to check command line input from user. Code by Staffan Godman.
 * 
 **/

public class IoControl {
	private String userPassword;
	private String checkedUserPassword;
	private static StringBuilder sb = new StringBuilder();
	public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Allows the user to quit application
	 * 
	 * @return either 0, which stops the application, or 1 which keeps it running.
	 */
	public int inputQuit() {

		if (userPassword.trim().toLowerCase().equals("q")) {
			return 0;
		}
		return 1;
	}

	/**
	 * Makes sure the string provided by the user is 4-10 characters long
	 * 
	 * @return either -1, which asks user to enter new string, or 1 which passes the
	 *         string on to checkChars() method.
	 */
	public int checkLength() {
		if (userPassword.length() > 3 && userPassword.length() < 11) {
			return (1);
		}
		return (-1);
	}

	/**
	 * Makes sure the string provided by the user does not contain special
	 * characters.
	 * 
	 * @return either 0, which provides the newly generated password and quits the
	 *         application, or -1 which asks user to enter new string.
	 */
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