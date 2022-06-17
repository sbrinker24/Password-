/**
 * Thrown if a password has no special characterss
 * @author Sam Brinker
 */


public class NoSpecialCharacterException extends RuntimeException {
	
	public NoSpecialCharacterException() {
		this("The password must contain at least 1 special character");
	}
	
	/**
	 * Parameterized constructor.
	 * @param message String message to be shown.
	 */
	
	public NoSpecialCharacterException(String message) {
		super(message);
	}

}
