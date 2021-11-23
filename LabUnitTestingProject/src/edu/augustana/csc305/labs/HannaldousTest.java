package edu.augustana.csc305.labs;
import static org.junit.Assert.*;


import org.junit.Test;
public class HannaldousTest {
	@Test
	//test case for numIncorrectPasswords method
	public void numIncorrectPasswordsTest() {
		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat"};
		int s = Hannaldous.numIncorrectPasswords(8, passwords);
		assertEquals(3, s);
	}
	//test case for PasswordStatus method
	public void passwordStatusTest() {
		
		String f = Hannaldous.passwordStatus("uiop");
		assertEquals("yes", f);
		
	}
	//test case for PasswordStatus method
	public void passwordStatusTest2() {
		
		String f = Hannaldous.passwordStatus("uiop$");
		assertEquals("no", f);
		
	}	

}


