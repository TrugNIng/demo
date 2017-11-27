package assigment.util;

/**
 * @author Minh Quang.
 * @date 2017-Oct-30
 */
public class SqlQuery {
  public static final String SELECT = "SELECT * FROM dbo.JDBC";
  public static final String FIRST_COLUMN = "ACCOUNT";
  public static final String SECOND_COLUMN = "FIRSTNAME";
  public static final String THIRD_COLUMN = "LASTNAME";
  public static final String FORTH_COLUMN = "EMAIL";
  public static final String INSERT = "INSERT INTO dbo.JDBC(" + FIRST_COLUMN + ", " + SECOND_COLUMN
      + ", " + THIRD_COLUMN + ", " + FORTH_COLUMN + ") VALUES (?,?,?,?)";
  public static final String UPDATE = "UPDATE dbo.JDBC SET " + SECOND_COLUMN + "=?, " + THIRD_COLUMN
      + "=?, " + FORTH_COLUMN + "=?  WHERE " + FIRST_COLUMN + " = ?";
  public static final String PREPARED_STATEMENT = "SELECT * FROM dbo.JDBC WHERE ACCOUNT = ? ";
  public static final String FIND_BY_ACCOUNT = "SELECT ACCOUNT FROM dbo.JDBC WHERE ACCOUNT = ?";
}
