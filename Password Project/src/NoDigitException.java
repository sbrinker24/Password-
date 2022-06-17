/**
 * Thrown if a password has no numeric chars
 * @author Sam Brinker
 */


public class NoDigitException extends RuntimeException {
	
	public NoDigitException() {
		this("The password must contain at least 1 numeric character");
	}
	
	/**
	 * Parameterized constructor.
	 * @param message String message to be shown.
	 */
	
	public NoDigitException(String message) {
		super(message);
	}

}
