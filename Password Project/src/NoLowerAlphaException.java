/**
 * Thrown if a password has no lowercase chars
 * @author Sam Brinker
 */


public class NoLowerAlphaException extends RuntimeException {
	
	public NoLowerAlphaException() {
		this("The password must contain at least 1 lower case character");
	}
	
	/**
	 * Parameterized constructor.
	 * @param message String message to be shown.
	 */
	
	public NoLowerAlphaException(String message) {
		super(message);
	}

}
