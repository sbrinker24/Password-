
/**
 * Thrown if a password has no upper case chars.
 * @author Sam Brinker
 */

public class NoUpperAlphaException extends RuntimeException {

	public NoUpperAlphaException() {
		this("The password must contain at least 1 upper case character");
	}
	
	/**
	 * Parameterized constructor.
	 * @param message String message to be shown.
	 */
	
	public NoUpperAlphaException(String message) {
		super(message);
	}
	
}
