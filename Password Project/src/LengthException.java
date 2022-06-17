
/**
 * Thrown if a password is less than six characters long.
 * @author Sam Brinker
 */
public class LengthException extends RuntimeException {
	/**
	 * Constructor.
	 */
	public LengthException() {
		this("The password must be at least 6 characters long");
	}
	
	/**
	 * Parameterized constructor.
	 * @param message String message to be shown.
	 */
	public LengthException(String message) {
		super(message);
	}
}
