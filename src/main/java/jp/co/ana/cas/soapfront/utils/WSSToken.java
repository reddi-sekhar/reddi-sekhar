package jp.co.ana.cas.soapfront.utils;

import static java.lang.System.currentTimeMillis;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.TimeZone;

/**
 * The Class WSSToken.
 *
 * @author IBS Software Services Pvt Ltd. -Siju K J (A-4211)
 * @author IBS Software Services Pvt Ltd. -Sajith Veluthattil (A-6771)
 */

public class WSSToken {

  /** The Constant RANDOM. */
  private static final SecureRandom RANDOM;
  
  /** The Constant NONCE_SIZE_IN_BYTES. */
  private static final int NONCE_SIZE_IN_BYTES = 16;
  
  /** The Constant MESSAGE_DIGEST_ALGORITHM_NAME_SHA_1. */
  private static final String MESSAGE_DIGEST_ALGORITHM_NAME_SHA_1 = "SHA-1";
  
  /** The Constant SECURE_RANDOM_ALGORITHM_SHA_1_PRNG. */
  private static final String SECURE_RANDOM_ALGORITHM_SHA_1_PRNG = "SHA1PRNG";
  
  /** The format. */
  private SimpleDateFormat format;
  
  /** The base 64 encoder. */
  private static Encoder base64Encoder;

  /** The nonce. */
  private String nonce;
  
  /** The created. */
  private String created;
  
  /** The password digest. */
  private String passwordDigest;

  /**
   * Instantiates a new WSS token.
   */
  public WSSToken() {
    format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    format.setTimeZone(TimeZone.getTimeZone("Zulu"));
  }

  static {
    try {
      RANDOM = SecureRandom.getInstance(SECURE_RANDOM_ALGORITHM_SHA_1_PRNG);
      base64Encoder = Base64.getEncoder();
    } catch (NoSuchAlgorithmException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Generate nonce.
   *
   * @param seed the seed
   * @return the byte[]
   */
  private static byte[] generateNonce(long seed) {

    byte[] nonceBytes = new byte[NONCE_SIZE_IN_BYTES];
    RANDOM.setSeed(seed);
    RANDOM.nextBytes(nonceBytes);
    return nonceBytes;
  }

  /**
   * Construct password digest.
   *
   * @param nonceBytes the nonce bytes
   * @param createdDate the created date
   * @param password the password
   * @return the byte[]
   */
  private static byte[] constructPasswordDigest(byte[] nonceBytes,
      String createdDate, String password) {
    try {
      final MessageDigest sha1MessageDigestPassword =
          MessageDigest.getInstance(MESSAGE_DIGEST_ALGORITHM_NAME_SHA_1);
      sha1MessageDigestPassword.reset();
      sha1MessageDigestPassword.update(password.getBytes(StandardCharsets.UTF_8));
      byte[] passwordBytes = sha1MessageDigestPassword.digest();

      final MessageDigest sha1MessageDigest =
          MessageDigest.getInstance(MESSAGE_DIGEST_ALGORITHM_NAME_SHA_1);
      sha1MessageDigest.update(nonceBytes);
      sha1MessageDigest.update(createdDate.getBytes(StandardCharsets.UTF_8));
      sha1MessageDigest.update(passwordBytes);
      return sha1MessageDigest.digest();

    } catch (NoSuchAlgorithmException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Generate token.
   *
   * @param password the password
   * @return the WSS token
   */
  public static WSSToken generateToken(String password) {
    try {
      WSSToken wssToken = new WSSToken();
      long seed = currentTimeMillis();

      final byte[] nonceBytes = generateNonce(seed);
      final byte[] passwordDigestBytes =
          constructPasswordDigest(nonceBytes, wssToken.format.format(seed), password);

      final String nonceBase64Encoded = base64Encoder.encodeToString(nonceBytes);
      final String passwordDigestBase64Encoded = base64Encoder.encodeToString(passwordDigestBytes);

      wssToken.setCreated(wssToken.format.format(seed));
      wssToken.setNonce(nonceBase64Encoded);
      wssToken.setPasswordDigest(passwordDigestBase64Encoded);
      return wssToken;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }

  /**
   * Gets the nonce.
   *
   * @return the nonce
   */
  public String getNonce() {
    return nonce;
  }

  /**
   * Sets the nonce.
   *
   * @param nonce the new nonce
   */
  public void setNonce(String nonce) {
    this.nonce = nonce;
  }

  /**
   * Gets the created.
   *
   * @return the created
   */
  public String getCreated() {
    return created;
  }

  /**
   * Sets the created.
   *
   * @param created the new created
   */
  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * Gets the password digest.
   *
   * @return the password digest
   */
  public String getPasswordDigest() {
    return passwordDigest;
  }

  /**
   * Sets the password digest.
   *
   * @param passwordDigest the new password digest
   */
  public void setPasswordDigest(String passwordDigest) {
    this.passwordDigest = passwordDigest;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "nonce=" + nonce + "\ncreated=" + created + " \npasswordDigest=" + passwordDigest;
  }

}
