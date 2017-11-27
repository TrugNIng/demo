package assigment.view;

import java.sql.SQLException;
import assigment.bus.UserBus;

/**
 * @author Minh Quang.
 * @date 2017-Oct-30
 */
public class Main {

  public static void main(String[] args) throws SQLException, ClassNotFoundException {
    UserBus userBus = new UserBus();
    userBus.input();
    userBus.getAllUsers();
  }
}
