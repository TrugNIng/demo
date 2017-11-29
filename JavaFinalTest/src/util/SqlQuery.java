package util;

/**
 * @author User
 * @date Nov 28, 2017
 */
public class SqlQuery {
  public static final String FIRST_COLUMN = "FIRSTNAME";
  public static final String SECOND_COLUMN = "LASTNAME";
  public static final String THIRD_COLUMN = "BIRTHDAY";
  public static final String FORTH_COLUMN = "ADDRESS";
  public static final String FIFTH_COLUMN = "PHONE";
  public static final String SIXTH_COLUMN = "EMAIL";
  public static final String SEVENTH_COLUMN = "CANDIDATETYPE";
  public static final String EIGHTH_COLUMN = "EXPINYEAR";
  public static final String NINETH_COLUMN = "PROSKILL";
  public static final String TENTH_COLUMN = "GRADUATIONDATE";
  public static final String ELEVENTH_COLUMN = "GRADUATIONRANK";
  public static final String TWELFTH_COLUMN = "EDUCATION";
  public static final String THIRTEENTH_COLUMN = "MAJORS";
  public static final String FOURTEENTH_COLUMN = "SEMETER";
  public static final String FIFTEENTH_COLUMN = "UNIVERSITYNAME";
  public static final String RECRUITMENT_CODE = "RECRUITMENTCODE";
  public static final String NUMBER_APPLY = "NUMBERAPPLY";
  
  public static final String INSERT_EXPERIENCE = "INSERT INTO dbo.Candidate(" + FIRST_COLUMN + ", " + SECOND_COLUMN
      + ", " + THIRD_COLUMN + ", " + FORTH_COLUMN + ", " + FIFTH_COLUMN + ", " + SIXTH_COLUMN + ", " + SEVENTH_COLUMN
      + ", " + EIGHTH_COLUMN + ", " + NINETH_COLUMN + " ) VALUES (?,?,?,?,?,?,?,?,?)";
  public static final String INSERT_FRESHER = "INSERT INTO dbo.Candidate(" + FIRST_COLUMN + ", " + SECOND_COLUMN
      + ", " + THIRD_COLUMN + ", " + FORTH_COLUMN + ", " + FIFTH_COLUMN + ", " + SIXTH_COLUMN + ", " + SEVENTH_COLUMN 
      + ", " + TENTH_COLUMN + ", " + ELEVENTH_COLUMN + ", " + TWELFTH_COLUMN +") VALUES (?,?,?,?,?,?,?,?,?,?)";
  public static final String INSERT_INTERN = "INSERT INTO dbo.Candidate(" + FIRST_COLUMN + ", " + SECOND_COLUMN
      + ", " + THIRD_COLUMN + ", " + FORTH_COLUMN + ", " + FIFTH_COLUMN + ", " + SIXTH_COLUMN + ", " + SEVENTH_COLUMN 
      + ", " + THIRTEENTH_COLUMN + "," + FOURTEENTH_COLUMN + ", " + FIFTEENTH_COLUMN + ") VALUES (?,?,?,?,?,?,?,?,?,?)";
  
  public static final String SELECT_EXPERIENCE = "SELECT " + FIRST_COLUMN + ", " + SECOND_COLUMN 
  		+ ", " + THIRD_COLUMN + ", " + FORTH_COLUMN + ", " + FIFTH_COLUMN + ", " + SIXTH_COLUMN 
  		+ ", " + EIGHTH_COLUMN + ", " + NINETH_COLUMN + "  FROM dbo.Candidate WHERE " + SEVENTH_COLUMN + " = 0";
  
  public static final String SELECT_FRESHER = "SELECT " + FIRST_COLUMN + ", " + SECOND_COLUMN
  		+ ", " + THIRD_COLUMN + ", " + FORTH_COLUMN + ", " + FIFTH_COLUMN + ", " + SIXTH_COLUMN
  		+ ", " + TENTH_COLUMN + ", " + ELEVENTH_COLUMN + ", " + TWELFTH_COLUMN +" FROM dbo.Candidate WHERE " + SEVENTH_COLUMN + " = 1";
  
  public static final String SELECT_INTERN = "SELECT " + FIRST_COLUMN + ", " + SECOND_COLUMN
      + ", " + THIRD_COLUMN + ", " + FORTH_COLUMN + ", " + FIFTH_COLUMN + ", " + SIXTH_COLUMN
      + ", " + THIRTEENTH_COLUMN + ", " + FOURTEENTH_COLUMN + ", " + FIFTEENTH_COLUMN + " FROM dbo.Candidate WHERE " + SEVENTH_COLUMN + " = 2";
  
  public static final String GET_CANDIDATE_TYPE = "SELECT * FROM dbo.Candidate WHERE " + SIXTH_COLUMN + "=?";
  public static final String GET_PACKAGE_NAME = "SELECT * FROM dbo.Recruitment WHERE " + RECRUITMENT_CODE + "=?";
  public static final String UPDATE_RECRUITMENT = "UPDATE dbo.Recruitment SET " + NUMBER_APPLY + " = " + NUMBER_APPLY + "+1 WHERE " + RECRUITMENT_CODE + "=?";  
}
