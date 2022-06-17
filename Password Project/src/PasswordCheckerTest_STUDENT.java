
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



/**
 * This is your test file.  Complete the following test cases to test your project where they make sense.
 * Include additional test cases if you like.  
 *
 * STUDENT tests for the methods of PasswordChecker
 * @author Sam Brinker
 *
 */
public class PasswordCheckerTest_STUDENT {

	String p1, p2, p3;
	ArrayList<String> passwords;
	
	@Before
	public void setUp() throws Exception {
		
		passwords = new ArrayList<String>();
		p1 = "Sam12";
		p2 = "aaaBear11$$";
		p3 = "Sambrinker1219!";
		passwords.add(p1);
		passwords.add(p2);
		passwords.add(p3);
			
		
	}

	@After
	public void tearDown() throws Exception {
	passwords = null;
	}

	/**
	 * Test if the password is less than 6 characters long.
	 * This test should throw a LengthException for second case.
	 */
	@Test
	public void testIsValidPasswordTooShort()
	{
		
		assertTrue(PasswordCheckerUtility.isValidLength(p2));
		
		try{
			assertTrue(PasswordCheckerUtility.isValidLength(p1));
		}
		catch(LengthException e)
		{
			assertTrue("Successfully threw an invalid length exception",true);
		}
	}
	
	/**
	 * Test if the password has at least one uppercase alpha character
	 * This test should throw a NoUpperAlphaException for second case
	 */
	@Test
	public void testIsValidPasswordNoUpperAlpha()
	{
		
		assertTrue(PasswordCheckerUtility.hasUpperAlpha(p1));
		
		try{
			assertTrue(PasswordCheckerUtility.hasUpperAlpha("asdfasdf"));
		}
		catch(NoUpperAlphaException e)
		{
			assertTrue("Successfully threw a no upper Alpha exception",true);
		}
		
	}
	
	/**
	 * Test if the password has at least one lowercase alpha character
	 * This test should throw a NoLowerAlphaException for second case
	 */
	@Test
	public void testIsValidPasswordNoLowerAlpha()
	{
		assertTrue(PasswordCheckerUtility.hasLowerAlpha(p1));
		
		try{
			assertTrue(PasswordCheckerUtility.hasLowerAlpha("ASDFASDF"));
		}
		catch(NoLowerAlphaException e)
		{
			assertTrue("Successfully threw a no lower alpha exception",true);
		}
	}
	/**
	 * Test if the password has fewer than 10 characters
	 */
	@Test
	public void testIsWeakPassword()
	{
		assertFalse(PasswordCheckerUtility.isWeakPassword(p2));
		
		try{
			assertTrue(PasswordCheckerUtility.isWeakPassword(p1));
		}
		catch(WeakPasswordException e)
		{
			assertTrue("Successfully threw a weak password exception",true);
		}
	}
	
	/**
	 * Test if the password has more than 2 of the same character in sequence
	 * This test should throw a InvalidSequenceException for second case
	 */
	@Test
	public void testIsValidPasswordInvalidSequence()
	{
		assertTrue(PasswordCheckerUtility.noInvalidSequence(p3));
		
		try{
			assertTrue(PasswordCheckerUtility.noInvalidSequence("Samaaabrinker"));
		}
		catch(InvalidSequenceException e)
		{
			assertTrue("Successfully threw an invalid sequence exception",true);
		}
	}
	
	/**
	 * Test if the password has at least one digit
	 * One test should throw a NoDigitException
	 */
	@Test
	public void testIsValidPasswordNoDigit()
	{
		assertTrue(PasswordCheckerUtility.hasDigit(p2));
		
		try{
			assertTrue(PasswordCheckerUtility.hasDigit("Sambrinker"));
		}
		catch(NoDigitException e)
		{
			assertTrue("Successfully threw a no digit exception",true);
		}
	}
	
	/**
	 * Test correct passwords
	 * This test should not throw an exception
	 */
	@Test
	public void testIsValidPasswordSuccessful()
	{
		assertTrue(PasswordCheckerUtility.isValidPassword(p3));
		assertTrue(PasswordCheckerUtility.isValidPassword("Sambrinker123!"));
	}
	
	/**
	 * Test the invalidPasswords method
	 * Check the results of the ArrayList of Strings returned by the validPasswords method
	 */
	@Test
	public void testInvalidPasswords() {
		ArrayList<String> tester;
		tester = PasswordCheckerUtility.getInvalidPasswords(passwords);
		assertEquals(tester.size(), 2);
		assertEquals(tester.get(0), "Sam12 -> The password must be at least 6 characters long");
		assertEquals(tester.get(1), "aaaBear11$$ -> May not have more than 2 of the same character in sequence");
	}
	
}
