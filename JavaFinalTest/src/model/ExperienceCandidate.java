package model;

/**
 * @author User
 * @date Nov 28, 2017
 */
public class ExperienceCandidate extends Candidate{
	int expInYear;
	String proSkill;
	
	public ExperienceCandidate(String firstName, String lastName, int birthDay,
			String address, int phone, String email, int candicateType, int expInYear,
			String proSkill) {
		super(firstName, lastName, birthDay, address, phone, email, candicateType);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}
	
	public ExperienceCandidate() {
		
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	public String getProSkill() {
		return proSkill;
	}

	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	
	
	
}
