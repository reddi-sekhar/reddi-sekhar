package jp.co.ana.cas.resources.handler;

/**
 * 
 * @author IBS AYUSH DEEP.
 *
 */
public class CommonCustomException extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new common custom exception.
	 */
	public CommonCustomException() {
	}

	/**
	 * Instantiates a new common custom exception.
	 *
	 * @param msg the msg
	 */
	public CommonCustomException(String msg) {
		super(msg);
	}

	/**
	 * Instantiates a new common custom exception.
	 *
	 * @param exception the exception
	 */
	public CommonCustomException(Exception exception) {
		super(exception);
	}

}