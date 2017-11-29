package view;

import java.sql.SQLException;
import java.util.Scanner;

import bus.CandidateBus;
import util.Constant;

/**
 * @author User
 * @date Nov 28, 2017
 */
public class Main {
	
	
	/**
	 * @description Main function
	 * @author User
	 * @date Nov 29, 2017
	 */
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		menu();
	}
	/**
	 * @description Menu of application
	 * @author User
	 * @date Nov 28, 2017
	 * @exception SQLException, ClassNotFoundException
	 */
	public static void menu() throws SQLException, ClassNotFoundException {
		CandidateBus bus = new CandidateBus();
		Scanner sc = new Scanner(System.in);
		int number;
		do{
			System.out.println(Constant.MENU);
			System.out.print("\nYour choose: ");
			try {
        number = sc.nextInt();
      } catch (Exception e) {
        System.err.println("Wrong number");
        sc.nextLine();
        continue;
      }
			if ( number < 1 || number > 4) {
				System.out.println("Wrong choose. Try again.");
				continue;
			}
			if ( number == 1){
				bus.input();
			} else if (number == 2){
				System.out.println("List Experience Candidate: ");
				System.out.printf(Constant.LIST_EXP,"FistName","LastName","BirthDate","Address","Phone","Email","Exp In Year","Pro Skill");
				bus.getExperience();
				System.out.println("List Fresher Candidate: ");
				System.out.printf(Constant.LIST_FRESHER,"FistName","LastName","BirthDate","Address","Phone","Email","Graduation Date","Graduation Rank","Education");
				bus.getFresher();
				System.out.println("List Intern Candidate: ");
				System.out.printf(Constant.LIST_INTERN,"FistName","LastName","BirthDate","Address","Phone","Email","Majors","Semeter","University Name");
				bus.getIntern();
			} else if (number==3) {
				System.out.println("Enter email of Candicate: ");
				String email;
				email = sc.next();
				System.out.println("Enter recruitment Package: ");
				int rePackage;
				do{
					try {
						rePackage = sc.nextInt();
					} catch (Exception e) {
						System.err.println("Invalid number");
						sc.nextLine();
						continue;
					} 
					if ( rePackage < 10000 || rePackage > 99999) {
						System.out.println("Invalid code");
						continue;
					}
					break;
				} while(true);
				if (bus.check(email,rePackage)) {
					System.out.println("Submitted this candidate successfully");
				} else {
					System.out.println("This candidate not matching");
				};
				
			} else {
				System.out.printf("Bye, Have a Great Time!");
				break;
			}
			
		} while ( true);
		sc.close();
	}
	
}
