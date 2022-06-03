package jp.co.ana.cas.resources.handler;

/**
 * Exception class to handle Record Not Found Exception.
 *
 *
 * @author IBS Anu
 *
 */
public class RecordNotFoundException extends RuntimeException {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /**
   * Instantiates a new record not found exception.
   */
  public RecordNotFoundException() {}

  /**
   * Instantiates a new record not found exception.
   *
   * @param msg the msg
   */
  public RecordNotFoundException(String msg) {
    super(msg);
  }

  /**
   * Instantiates a new record not found exception.
   *
   * @param exception the exception
   */
  public RecordNotFoundException(Exception exception) {
    super(exception);
  }

}
