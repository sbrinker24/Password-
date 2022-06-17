/**
 * Thrown if passwords do not match
 * @author Sam Brinker
 */


public class UnmatchedException extends RuntimeException {
	
	public UnmatchedException() {
		this("Passwords do not match");
	}
	
	/**
	 * Parameterized constructor.
	 * @param message String message to be shown.
	 */
	
	public UnmatchedException(String message) {
		super(message);
	}

}
