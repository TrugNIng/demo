package assigment.model;

/**
 * @author Minh Quang.
 * @date 2017-Oct-30
 */
public class User {
  private String account;
  private String firstname;
  private String lastname;
  private String email;

  public User() {

  }

  /**
   * @param account
   * @param firstname
   * @param lastname
   * @param email
   */
  public User(String account, String firstname, String lastname, String email) {
    this.account = account;
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
  }

  /**
   */

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
