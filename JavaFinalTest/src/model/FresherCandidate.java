package model;

/**
 * @author User
 * @date Nov 28, 2017
 */
public class FresherCandidate extends Candidate{
	int graduationDate;
	String graduaationRank;
	String education;
	
	public FresherCandidate(String firstName, String lastName, int birthDay,
			String address, int phone, String email, int candidateType,
			int graduationDate, String graduaationRank, String education) {
		super(firstName, lastName, birthDay, address, phone, email, candidateType);
		this.graduationDate = graduationDate;
		this.graduaationRank = graduaationRank;
		this.education = education;
	}

	public FresherCandidate() {
		
	}

	public int getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(int graduationDate) {
		this.graduationDate = graduationDate;
	}

	public String getGraduaationRank() {
		return graduaationRank;
	}

	public void setGraduaationRank(String graduaationRank) {
		this.graduaationRank = graduaationRank;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
	
	
	
	
}
