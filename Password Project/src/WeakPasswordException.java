/**
 * Thrown if a password has fewer than 10 chars but is otherwise valid
 * @author Sam Brinker
 */


public class WeakPasswordException extends RuntimeException {
	
	public WeakPasswordException() {
		this("Length must be greater than 6; a strong password will contain at least 10 characters");
	}
	
	/**
	 * Parameterized constructor.
	 * @param message String message to be shown.
	 */
	
	public WeakPasswordException(String message) {
		super(message);
	}

}
