package assigment.bus;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import assigment.dao.UserDao;
import assigment.model.User;
import assigment.util.Validate;

/**
 * @author Minh Quang.
 * @date 2017-Oct-30
 */
public class UserBus {
  static Scanner sc = new Scanner(System.in);

  public static boolean exists(User user) {
    ResultSet rs;
    try {
      rs = new UserDao().getByAccount(user);
      if (rs.next()) {
        return true;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }

  public void getAllUsers() throws SQLException {
    UserDao userDao = new UserDao();
    try {
      userDao.show();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  /**
   * 
   * @author Minh Quang.
   * @date 2017-Oct-31
   */
  public void input() {
    int i = 0;
    String account = null;
    String firstname = null;
    String lastname = null;
    String email = null;

    while (i == 0) {
      System.out.println("Input Account: ");
      account = sc.nextLine();
      i++;
      if (account.length() < 1) {
        System.out.println("Input again!");
        i--;
      }

      while (i == 1) {
        System.out.println("Input First Name: ");
        firstname = sc.nextLine();
        i++;
        if (firstname.length() < 1) {
          System.out.println("Input again!");
          i--;
        }
      }

      while (i == 2) {
        System.out.println("Input Last Name: ");
        lastname = sc.nextLine();
        i++;
        if (lastname.length() < 1) {
          System.out.println("Input again!");
          i--;
        }
      }

      while (i == 3) {
        System.out.println("Input Email: ");
        email = sc.nextLine();
        Validate validate = new Validate();
        i++;
        if (email.length() > 1 && validate.validate(email)) {
          continue;
        } else {
          System.out.println("Input again!");
          i--;
        }
      }

      while (i == 4) {
        User user = new User(account, firstname, lastname, email);
        if (exists(user)) {
          new UserBus().Update(user);
          i++;
        } else
          new UserBus().Insert(user);
        i++;
      }
      if (i ==5 ) break;
    }
  }

  /**
   * 
   * @author Minh Quang.
   * @date 2017-Oct-31
   * @param user
   */
  public void Insert(User user) {
    UserDao userDao = new UserDao();
    try {
      userDao.insert(user);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  /**
   * 
   * @author Minh Quang.
   * @date 2017-Oct-31
   * @param user
   */
  public void Update(User user) {
    UserDao userDao = new UserDao();
    try {
      userDao.update(user);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}