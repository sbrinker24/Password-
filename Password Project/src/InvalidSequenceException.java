/**
 * Thrown if a password has 2+ of the same char in a row
 * @author Sam Brinker
 */


public class InvalidSequenceException extends RuntimeException {
	
	public InvalidSequenceException() {
		this("May not have more than 2 of the same character in sequence");
	}
	
	/**
	 * Parameterized constructor.
	 * @param message String message to be shown.
	 */
	
	public InvalidSequenceException(String message) {
		super(message);
	}

}
