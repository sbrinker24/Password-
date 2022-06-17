
/**
 * Data manager class for Password checking functions.



 * @author Sam Brinker
 */


import java.util.ArrayList;
import java.util.regex.*;


public class PasswordCheckerUtility {
	
	
	
	public static boolean isValidPassword (String s) throws RuntimeException {
		
		
		PasswordCheckerUtility.isValidLength(s);
		PasswordCheckerUtility.hasUpperAlpha(s);
		PasswordCheckerUtility.hasLowerAlpha(s);  
		PasswordCheckerUtility.hasDigit(s);
		PasswordCheckerUtility.hasSpecialCharacter(s);
		PasswordCheckerUtility.noInvalidSequence(s);
		
		
		
		return true;
		
	}
	
	
public static boolean isValidLength(String s) throws LengthException {
    	
    	if (s.length() >= 6) {
    		return true;
    	}
    	
    	else {
    		throw new LengthException();
    	}
    	
    	
    }
    
    public static boolean hasUpperAlpha(String s) throws NoUpperAlphaException {
    	
    	if (s.matches("(.*)[A-Z](.*)")) {
    		
    		return true;
    		
    	}
    	
    	else {
    		throw new NoUpperAlphaException();
    	}
    	
    	
    }
    
    public static boolean hasLowerAlpha(String s) throws NoLowerAlphaException {
    	
    	if (s.matches("(.*)[a-z](.*)")) {
    		
    		return true;
    	}
    	
    	else {
    		throw new NoLowerAlphaException();
    	}
    }
    
    
    public static boolean hasDigit(String s) throws NoDigitException {
    	
    	
    	
    	if (s.matches("(.*)[0-9](.*)")) {
    		return true;
    	}
    	
    	else {
    		
    		throw new NoDigitException();
    		
    	}
    	
    	
    	
    }
    
    
    public static boolean hasSpecialCharacter(String s) throws NoSpecialCharacterException {
    	
    	
    	if(s.matches("(.*)[!\"#$%&'()*+,./:;<=>?@\\[\\]^_`{|}~-](.*)")) {
    		
    		return true;
    	}
    	
    	else {
    		
    		throw new NoSpecialCharacterException();
    		
    	}
    	
    	
    	
    }
	
	
	public static boolean noInvalidSequence (String s) throws InvalidSequenceException {
		
		
		char[] word = s.toCharArray();
		
		for(int i = 0; i < (s.length() - 2); i++) {
			
			
			if (word[i] == word[i+1] && word[i] == word[i+2]) {
				throw new InvalidSequenceException();
			}
			i++;
		}
		
		
		return true;
		
		
		
	}
    
    public static boolean isWeakPassword (String s) {
		
		if (s.length() < 10) {
			throw new WeakPasswordException();
		}
		
		else {
			return false;
		}
		
	}
	
	
	
	
    public static boolean comparePasswords(String password, String passwordConfirm) throws UnmatchedException {
		
		if (!password.equals(passwordConfirm)) {
			throw new UnmatchedException();
		}
		
		return true;
		
		
	}
	
	
	
	
    
    public static boolean comparePasswordsWithReturn(String p1, String p2) {
		
    	if (p1.equals(p2)) {
    		return true;
    	}
		
    	else {
    		return false;
    	}
    	
	}
	
	public static ArrayList<String> getInvalidPasswords(ArrayList<String> passwords) {
		
		ArrayList<String> invalidPasswords = new ArrayList<String>();
		
		
		for (int i = 0; i < passwords.size(); i++) { 
			try {
				if (PasswordCheckerUtility.isValidPassword(passwords.get(i))) {
					
				}
			}
			catch (RuntimeException e) {
				
				invalidPasswords.add(passwords.get(i) + " -> " + e.getMessage());
				
			}
			 
			
							
		}
		
		
		
		
		return invalidPasswords;	
		
	}



	



	





}
