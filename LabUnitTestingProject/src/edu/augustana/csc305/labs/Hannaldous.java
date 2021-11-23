/**
 *Author: Talha Hassan
 *Course: 305
 */
package edu.augustana.csc305.labs;

// Supervisor's note: Here's the smelly code that Hannaldous left us...
//
// In this order, please:
//  First, try to figure out what each method DOES by reading the code 
//     and methodically testing each method (from main).
//  Second, create a HannaldousTest class with a series of unit tests
//     that carefully test ALL the methods inside Hannaldous
//     that test the full range of behavior (including corner cases)
//  Third, refactor this code to make it as elegant as possible!
//      After each change, run your suite of unit tests to make sure
//      that all tests still pass!
//  Fourth, include a proper Javadoc comment for the public method 
//         (see Skrien appendix B, pp 318-331)
//   
//  NOTE: You should leave the class name (Hannaldous) the same, 
//       but methods should be renamed, parameters improved, etc...
//
//  HINT: the post-increment operator (e.g. i++) is weirder than you knew
//         (read Skrien appendix B, pp 318-331)

public class Hannaldous {

	/**
	 * This method goes through the list of passwords to check if they are eligible
	 * based on the set limit.
	 * @param limit: limit is an int parameter which helps evaluate the length of a password.
	 * @param listStrings: It comprises of the list of passwords to be checked
	 * @return num: It is the number of bad passwords found.
	 */
	public static int numIncorrectPasswords(int limit, String[] listStrings) {
		int j = listStrings.length - 1;
		int num = 0;

		for (int i = 0; i < listStrings.length; i++) {
			if (listStrings[j].length() < limit || passwordStatus(listStrings[j]).equals("y")) {
				num++;

			}
			j--;
		}
		return num;
	}

	/**
	 * This method goes through the String passed as parameter
	 *  to check if they are eligible based on the conditional statement(which checks characters).
	 * @param strings: It comprises of the password as string
	 * @return: It returns a "yes" or "no: response of type String
	 */

	static String passwordStatus(String string) {
		int slot = -1;
		while (slot++ < string.length() - 1) {
			char character = string.charAt(slot);

			if (!(character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z')) {
				return "no";
			}
		}

		return "yes";

	}

	public static void main(String[] args) {

		System.out.println(passwordStatus("bigmoose$"));
		System.out.println(passwordStatus("emusareawesome"));
		System.out.println(passwordStatus("17"));

		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		System.out.println(numIncorrectPasswords(8, passwords));
	}

}
