package jp.co.ana.cas.resources.handler;

/**
 * The Class for BadRequestCustomException.
 *
 * @author IBS Anu
 */
public class BadRequestCustomException extends RuntimeException {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /**
   * Instantiates a new bad request custom exception.
   */
  public BadRequestCustomException() {}

  /**
   * Instantiates a new bad request custom exception.
   *
   * @param msg the msg
   */
  public BadRequestCustomException(String msg) {
    super(msg);
  }

  /**
   * Instantiates a new bad request custom exception.
   *
   * @param exception the exception
   */
  public BadRequestCustomException(Exception exception) {
    super(exception);
  }

}
