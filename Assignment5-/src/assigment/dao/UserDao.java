package assigment.dao;

import assigment.model.User;
import assigment.util.ConnectionPropeties;
import assigment.util.SqlQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Minh Quang.
 * @date 2017-Oct-30
 */
public class UserDao {

  /**
   * 
   * @author Minh Quang.
   * @date 2017-Oct-30
   * @throws SQLException
   *           Show data from table
   */
  public void show() throws SQLException {
    Connection myConn = DriverManager.getConnection(ConnectionPropeties.dbUrl);
    Statement stm = myConn.createStatement();
    ResultSet resultSet = stm.executeQuery(SqlQuery.SELECT);
    while (resultSet.next()) {
      System.out.print(resultSet.getString(SqlQuery.FIRST_COLUMN) + "  ");
      System.out.print(resultSet.getString(SqlQuery.SECOND_COLUMN) + "  ");
      System.out.print(resultSet.getString(SqlQuery.THIRD_COLUMN) + "  ");
      System.out.print(resultSet.getString(SqlQuery.FORTH_COLUMN) + " \n");
    }
  }

  public ResultSet getByAccount(User user) throws SQLException {
    Connection myConn = DriverManager.getConnection(ConnectionPropeties.dbUrl);
    PreparedStatement ps = myConn.prepareStatement(SqlQuery.FIND_BY_ACCOUNT);
    ps.setString(1, user.getAccount());
    ResultSet rs = ps.executeQuery();
    return rs;
  }

  /**
   * 
   * @author Minh Quang.
   * @date 2017-Oct-30
   * @param user
   *          is inserted data
   * @return update data
   * @throws SQLException
   *           exeption SQL
   */
  public boolean insert(User user) throws ClassNotFoundException, SQLException {
    Connection myConn = DriverManager.getConnection(ConnectionPropeties.dbUrl);
    PreparedStatement preparedStatement = myConn.prepareStatement(SqlQuery.INSERT);
    preparedStatement.setString(1, user.getAccount());
    preparedStatement.setString(2, user.getFirstname());
    preparedStatement.setString(3, user.getLastname());
    preparedStatement.setString(4, user.getEmail());
    try {
      preparedStatement.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }

  /**
   * 
   * @author Minh Quang.
   * @date 2017-Oct-30
   * @param user
   *          is updated data
   * @return update data
   * @throws SQLException
   *           exeption SQL
   */
  public boolean update(User user) throws SQLException, ClassNotFoundException {
    Connection myConn = DriverManager.getConnection(ConnectionPropeties.dbUrl);
    PreparedStatement preparedStatement = myConn.prepareStatement(SqlQuery.UPDATE);
    preparedStatement.setString(1, user.getFirstname());
    preparedStatement.setString(2, user.getLastname());
    preparedStatement.setString(3, user.getEmail());
    preparedStatement.setString(4, user.getAccount());
    try {
      preparedStatement.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }
}
