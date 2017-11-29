package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.ExperienceCandidate;
import model.FresherCandidate;
import model.InternCandidate;
import util.ConnectionDatabase;
import util.SqlQuery;

/**
 * @author User
 * @date Nov 28, 2017
 */
public class CandidateDao {
	/**
	 * @description Show data of a Fresher candidate
	 * @author User
	 * @date Nov 29, 2017
	 * @exception SQLException
	 */
	public void showExperience() throws SQLException {
    Connection myConn = DriverManager.getConnection(ConnectionDatabase.dbUrl);
    Statement stm = myConn.createStatement();
    ResultSet rs = stm.executeQuery(SqlQuery.SELECT_EXPERIENCE);
    while (rs.next()) {
    	System.out.printf("%-10s",rs.getString(SqlQuery.FIRST_COLUMN));
    	System.out.printf("%-10s",rs.getString(SqlQuery.SECOND_COLUMN));
    	System.out.printf("%-10s",rs.getString(SqlQuery.THIRD_COLUMN));
    	System.out.printf("%-20s",rs.getString(SqlQuery.FORTH_COLUMN));
    	System.out.printf("%-10s",rs.getString(SqlQuery.FIFTH_COLUMN));
    	System.out.printf("%-15s",rs.getString(SqlQuery.SIXTH_COLUMN));
    	System.out.printf("%-15s",rs.getString(SqlQuery.EIGHTH_COLUMN));
    	System.out.printf("%-10s",rs.getString(SqlQuery.NINETH_COLUMN)+ "\n");
    }
  }
	
	/**
	 * @description Show data of a Fresher candidate
	 * @author User
	 * @date Nov 29, 2017
	 * @exception SQLException
	 */
	public void showFresher() throws SQLException {
    Connection myConn = DriverManager.getConnection(ConnectionDatabase.dbUrl);
    Statement stm = myConn.createStatement();
    ResultSet rs = stm.executeQuery(SqlQuery.SELECT_FRESHER);
    while (rs.next()) {
    	System.out.printf("%-10s",rs.getString(SqlQuery.FIRST_COLUMN));
    	System.out.printf("%-10s",rs.getString(SqlQuery.SECOND_COLUMN));
    	System.out.printf("%-10s",rs.getString(SqlQuery.THIRD_COLUMN));
    	System.out.printf("%-20s",rs.getString(SqlQuery.FORTH_COLUMN));
    	System.out.printf("%-10s",rs.getString(SqlQuery.FIFTH_COLUMN));
    	System.out.printf("%-15s",rs.getString(SqlQuery.SIXTH_COLUMN));
    	System.out.printf("%-20s",rs.getString(SqlQuery.SEVENTH_COLUMN));
    	System.out.printf("%-10s",rs.getString(SqlQuery.TENTH_COLUMN));
    	System.out.printf("%-10s",rs.getString(SqlQuery.ELEVENTH_COLUMN));
    	System.out.printf("%-10s",rs.getString(SqlQuery.TWELFTH_COLUMN));
    }
  }
	
	/**
	 * @description Show data of a Intern candidate
	 * @author User
	 * @date Nov 29, 2017
	 * @exception SQLException
	 */
	public void showIntern() throws SQLException {
    Connection myConn = DriverManager.getConnection(ConnectionDatabase.dbUrl);
    Statement stm = myConn.createStatement();
    ResultSet rs = stm.executeQuery(SqlQuery.SELECT_INTERN);
    while (rs.next()) {
    	System.out.printf("%-10s",rs.getString(SqlQuery.FIRST_COLUMN));
    	System.out.printf("%-10s",rs.getString(SqlQuery.SECOND_COLUMN) );
    	System.out.printf("%-10s",rs.getString(SqlQuery.THIRD_COLUMN) );
    	System.out.printf("%-20s",rs.getString(SqlQuery.FORTH_COLUMN) );
    	System.out.printf("%-10s",rs.getString(SqlQuery.FIFTH_COLUMN) );
    	System.out.printf("%-15s",rs.getString(SqlQuery.SIXTH_COLUMN) );
    	System.out.printf("%-10s",rs.getString(SqlQuery.THIRTEENTH_COLUMN) );
    	System.out.printf("%-10s",rs.getString(SqlQuery.FOURTEENTH_COLUMN) );
     	System.out.printf("%-10s",rs.getString(SqlQuery.FOURTEENTH_COLUMN) + "\n"); 	
    }
	}
	
	
	/**
	 * @description Insert data of a Experience candidate
	 * @author User
	 * @date Nov 29, 2017
	 * @exception SQLException, ClassNotFoundException
	 */
	public boolean insertExperience(ExperienceCandidate experoenceCandidate) throws ClassNotFoundException, SQLException {
    Connection myConn = DriverManager.getConnection(ConnectionDatabase.dbUrl);
    PreparedStatement preparedStatement = myConn.prepareStatement(SqlQuery.INSERT_EXPERIENCE);
    preparedStatement.setString(1, experoenceCandidate.getFirstName());
    preparedStatement.setString(2, experoenceCandidate.getLastName());
    preparedStatement.setInt(3, experoenceCandidate.getBirthDay());
    preparedStatement.setString(4, experoenceCandidate.getAddress());
    preparedStatement.setInt(5, experoenceCandidate.getPhone());
    preparedStatement.setString(6, experoenceCandidate.getEmail());
    preparedStatement.setInt(7, 0);
    preparedStatement.setInt(8, experoenceCandidate.getExpInYear());
    preparedStatement.setString(9, experoenceCandidate.getProSkill());
    try {
      preparedStatement.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }
	
	/**
	 * @description Insert data of a Fresher candidate
	 * @author User
	 * @date Nov 29, 2017
	 * @exception SQLException, ClassNotFoundException
	 */
	public boolean insertFresher(FresherCandidate fresherCandidate) throws ClassNotFoundException, SQLException {
    Connection myConn = DriverManager.getConnection(ConnectionDatabase.dbUrl);
    PreparedStatement preparedStatement = myConn.prepareStatement(SqlQuery.INSERT_FRESHER);
    preparedStatement.setString(1, fresherCandidate.getFirstName());
    preparedStatement.setString(2, fresherCandidate.getLastName());
    preparedStatement.setInt(3, fresherCandidate.getBirthDay());
    preparedStatement.setString(4, fresherCandidate.getAddress());
    preparedStatement.setInt(5, fresherCandidate.getPhone());
    preparedStatement.setString(6, fresherCandidate.getEmail());
    preparedStatement.setInt(7, 1);
    preparedStatement.setInt(8, fresherCandidate.getGraduationDate());
    preparedStatement.setString(9, fresherCandidate.getGraduaationRank());
    preparedStatement.setString(10, fresherCandidate.getEducation());
    try {
      preparedStatement.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }
	
	/**
	 * @description Insert data of a Intern candidate
	 * @author User
	 * @date Nov 29, 2017
	 * @exception SQLException, ClassNotFoundException
	 */
	public boolean insertIntern(InternCandidate internCandidate) throws ClassNotFoundException, SQLException {
    Connection myConn = DriverManager.getConnection(ConnectionDatabase.dbUrl);
    PreparedStatement preparedStatement = myConn.prepareStatement(SqlQuery.INSERT_INTERN);
    preparedStatement.setString(1, internCandidate.getFirstName());
    preparedStatement.setString(2, internCandidate.getLastName());
    preparedStatement.setInt(3, internCandidate.getBirthDay());
    preparedStatement.setString(4, internCandidate.getAddress());
    preparedStatement.setInt(5, internCandidate.getPhone());
    preparedStatement.setString(6, internCandidate.getEmail());
    preparedStatement.setInt(7, 2);
    preparedStatement.setString(8, internCandidate.getMajors());
    preparedStatement.setInt(9, internCandidate.getSemeter());
    preparedStatement.setString(10, internCandidate.getUniveristyName());
    try {
      preparedStatement.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }
	
	/**
	 * @description Update number apply of 1 recruitment 
	 * @author User
	 * @date Nov 29, 2017
	 * @exception SQLException
	 */
	public boolean updateRecruiment(int Repackage) throws SQLException{
		Connection myConn = DriverManager.getConnection(ConnectionDatabase.dbUrl);
    PreparedStatement preparedStatement = myConn.prepareStatement(SqlQuery.UPDATE_RECRUITMENT);
    preparedStatement.setInt(1, Repackage);
    try {
      preparedStatement.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    return true;
	}
	
	/**
	 * @description Get candidate type from candidate table with email candidate
	 * @author User
	 * @date Nov 29, 2017
	 * @exception SQLException
	 */
	public String getCandidateType(String email) throws SQLException{
		Connection myConn = DriverManager.getConnection(ConnectionDatabase.dbUrl);
		PreparedStatement preparedStatement = myConn.prepareStatement(SqlQuery.GET_CANDIDATE_TYPE);
		preparedStatement.setString(1,email);
		ResultSet rs = preparedStatement.executeQuery();
		String candidateType = null;
		while (rs.next()) {
			candidateType = rs.getString(SqlQuery.SEVENTH_COLUMN);
		}
    return candidateType; 
	}
	
	/**
	 * @description Get package name from recruitment table with recruitment code
	 * @author User
	 * @date Nov 29, 2017
	 * @exception SQLException
	 */
	public String getPackageName(int code) throws SQLException{
		Connection myConn = DriverManager.getConnection(ConnectionDatabase.dbUrl);
		PreparedStatement preparedStatement = myConn.prepareStatement(SqlQuery.GET_PACKAGE_NAME);
		preparedStatement.setInt(1,code);
		ResultSet rs = preparedStatement.executeQuery();
		String packageName = null;
		while (rs.next()) {
			packageName = rs.getString(SqlQuery.RECRUITMENT_CODE);
		}
    return packageName; 
	}
	
}
