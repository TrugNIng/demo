package bus;

import java.sql.SQLException;
import java.util.Scanner;

import dao.CandidateDao;
import model.ExperienceCandidate;
import model.FresherCandidate;
import model.InternCandidate;
import util.Validate;

/**
 * @author User
 * @date Nov 28, 2017
 */
public class CandidateBus {
	static Scanner sc = new Scanner(System.in);
	CandidateDao dao = new CandidateDao();
	
	/**
	 * @description Get data of all Experience candidate
	 * @author User
	 * @date Nov 29, 2017
	 * @exception SQLException
	 */
	public void getExperience() throws SQLException {
    try {
      dao.showExperience();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
	
	/**
	 * @description Get data of all Fresher candidate
	 * @author User
	 * @date Nov 29, 2017
	 * @exception SQLException
	 */
	public void getFresher() throws SQLException {
    try {
      dao.showFresher();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
	
	/**
	 * @description Get data of all Intern candidate
	 * @author User
	 * @date Nov 29, 2017
	 * @exception SQLException
	 */
	public void getIntern() throws SQLException {
    try {
      dao.showIntern();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
	
	/**
	 * @description Check if a candidates match with the recruitment will return true or false
	 * @author User
	 * @date Nov 29, 2017
	 * @exception SQLException
	 */
	public boolean check(String email,int packageRe) throws SQLException{
		String packageName = dao.getPackageName(packageRe);
		if (packageName==null) return false;
		else {
		String check = null;
		if ("A".equals(packageName)){
			check = "0";
		} else if ("B".equals(packageName)){
			check = "1";
		} else check = "2";
		String type = null;
		type = dao.getCandidateType(email);
		if(check.equals(type)) {
			try {
				dao.updateRecruiment(packageRe);
			} catch (SQLException e) {
	      e.printStackTrace();
	    }
			return true;
		} else {
			return false;
		}
		}
	}
	
	
	/**
	 * @description Input data of a candidate from keyboard
	 * @author User
	 * @date Nov 29, 2017
	 */
	public void input() {
		Validate validate = new Validate();
		CandidateDao dao = new CandidateDao();
		int i=0;
		String firstName = null;
		String lastName = null;
		int birthDay = 0;
		String address = null;
		int phone =0 ;
		String email = null;
		int candidateType = 0;
		while (i==0) {
			System.out.println("Input First Name");
			firstName = sc.nextLine();
			i++;
			if (firstName.length() < 1) {
        System.out.println("Input again!");
        i--;
      }
			
			while (i == 1) {
        System.out.println("Input Last Name: ");
        lastName = sc.nextLine();
        i++;
        if (lastName.length() < 1) {
          System.out.println("Input again!");
          i--;
        }
			}
       
			while (i == 2) {
        System.out.println("Input Birth Day(1900-2017): ");
        try {
          birthDay = sc.nextInt();
        } catch (Exception e) {
          System.err.println("Invalid birth day");
          sc.nextLine();
          continue;
        }
        i++;
        String birth = "" + birthDay;
        if (birthDay < 2018 && validate.validateBirthDay(birth)) {
        	continue;
        } else {
        	System.out.println("Input again!");
        	i--;
        }
			}
			
			while (i == 3) {
        System.out.println("Input Address: ");
        address = sc.next();
        i++;
        if (address.length() < 1) {
          System.out.println("Input again!");
          i--;
        }
			}
			
			while (i == 4) {
        System.out.println("Input Phone: ");
        try {
          phone = sc.nextInt();
        } catch (Exception e) {
          System.err.println("Invalid phone number");
          sc.nextLine();
          continue;
        }
        i++;
        String phoneS = "" + phone;
        if (phone > 0 && validate.validatePhone(phoneS)) {
        	continue;
        } else {
        	System.out.println("Input again!");
        	i--;
        }
			}

			while (i == 5) {
        System.out.println("Input Email: ");
        email = sc.next();
        i++;
        if (email.length() > 1 && validate.validateEmail(email)) {
          continue;
        } else {
          System.out.println("Input again!");
          i--;
        }
      }
			
			while (i == 6){
				System.out.println("Input Candidate(0-2): ");
				try {
					candidateType = sc.nextInt();
				} catch (Exception e) {
          System.err.println("Invalid phone number");
          sc.nextLine();
          continue;
				} 
				if ( candidateType < 0 || candidateType > 2 ) {
					System.out.println("Input again");
					continue;
				}
				i++;
				// Input date of Experience candidate
				if (candidateType == 0) {
					int j=0;
					int expInYear = 0;
					String proSkill = null;
					while (j == 0){
						System.out.println("Type Exp In Year: ");
						try {
							expInYear = sc.nextInt();
						} catch (Exception e) {
		          System.err.println("Invalid number");
		          sc.nextLine();
		          continue;
						}
						if( expInYear < 0 ) {
							System.out.println("Try again!");
							continue;
						}
						j++;
					}
					
					while (j == 1) {
		        System.out.println("Input Pro Skill: ");
		        proSkill = sc.next();
		        j++;
		        if (proSkill.length() < 1) {
		          System.out.println("Input again!");
		          j--;
		        }
		      }
					ExperienceCandidate exp = new ExperienceCandidate(firstName,lastName,birthDay,address,phone,email,candidateType,expInYear,proSkill);
					try {
						dao.insertExperience(exp);
					} catch (ClassNotFoundException e) {
			      e.printStackTrace();
			    } catch (SQLException e) {
			      e.printStackTrace();
			    }
					if (j==2) break;
				}
				// Input date of Frehser candidate
				else if (candidateType==1) {
					int j=0;
					int graDate = 0;
					String graRank = null;
					String education = null;
					while (j == 0){
						System.out.println("Input Graduation Date: ");
						try {
							graDate = sc.nextInt();
						} catch (Exception e) {
		          System.err.println("Invalid graduation date");
		          sc.nextLine();
		          continue;
						} 
						j++;
					}
					
					while (j == 1) {
		        System.out.println("Input Graduation Rank( Excellent, Good, Fair, Poor): ");
		        graRank = sc.next();        
		        if (graRank.length() < 1) {
		          System.out.println("Input again!");
		          j--;
		        }
		        j++;
		      }
					
					while (j==2) {
						System.out.println("Input Education: ");
		        education = sc.nextLine();
		        j++;
		        if (education.length() < 1) {
		          System.out.println("Input again!");
		          j--;
		        }
					}
					FresherCandidate fresher = new FresherCandidate(firstName,lastName,birthDay,address,phone,email,candidateType,graDate,graRank,education);
					try {
						dao.insertFresher(fresher);
					} catch (ClassNotFoundException e) {
			      e.printStackTrace();
			    } catch (SQLException e) {
			      e.printStackTrace();
			    }
					if (j==3) break;
				}
				// Input date of Intern candidate
				else {
					int j=0;
					String majors = null;
					int semeter = 0;
					String university = null;
					while (j == 0){
						System.out.println("Input Majors: ");
						majors = sc.next();
		        j++;
		        if (majors.length() < 1) {
		          System.out.println("Input again!");
		          j--;
		        }
					}
					
					while (j == 1) {
		        System.out.println("Input Semeter: ");
						try {
							semeter = sc.nextInt();
						} catch (Exception e) {
		          System.err.println("Invalid graduation date");
		          sc.nextLine();
		          continue;
						} 
						j++;
		      }
					
					while (j==2) {
						System.out.println("Input University Name: ");
						university = sc.next();
		        j++;
		        if (university.length() < 1) {
		          System.out.println("Input again!");
		          j--;
		        }
					}
					InternCandidate intern = new InternCandidate(firstName,lastName,birthDay,address,phone,email,candidateType,majors,semeter,university);
					try {
						dao.insertIntern(intern);
					}  catch (ClassNotFoundException e) {
			      e.printStackTrace();
			    } catch (SQLException e) {
			      e.printStackTrace();
			    }
					if (j==3) break;
				}
			}		
		}
	}
}
