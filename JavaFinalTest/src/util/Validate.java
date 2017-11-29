package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author User
 * @date Nov 28, 2017
 */
public class Validate {
	private Pattern pattern1, pattern2, pattern3;
  private Matcher matcher1, matcher2, matcher3;
  private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
      + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
  
  private static final String BIRTHDAY_PATTERN = "^(19|20)\\d{2}$";
  private static final String PHONE_PATTERN = "^[0-9]{7,}$";

  
  public Validate() {
    pattern1 = Pattern.compile(EMAIL_PATTERN);
    pattern2 = Pattern.compile(BIRTHDAY_PATTERN);
    pattern3 = Pattern.compile(PHONE_PATTERN);
  }
  /**
   * @description validate string hex, return true if valid hex, false if invalid hex
   * @author User
   * @date Nov 28, 2017
   */
  public boolean validateEmail(final String hex) {
    matcher1 = pattern1.matcher(hex);
    return matcher1.matches();
  }
  
  /**
   * @description validate string hex, return true if valid hex, false if invalid hex
   * @author User
   * @date Nov 28, 2017
   */
  public boolean validateBirthDay(final String hex) {
  	matcher2 = pattern2.matcher(hex);
  	return matcher2.matches();
  }
  
  /**
   * @description validate string hex, return true if valid hex, false if invalid hex
   * @author User
   * @date Nov 28, 2017
   */
  public boolean validatePhone(final String hex) {
    matcher3 = pattern3.matcher(hex);
    return matcher3.matches();
  }
}