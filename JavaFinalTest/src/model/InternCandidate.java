package model;

/**
 * @author User
 * @date Nov 28, 2017
 */
public class InternCandidate extends Candidate{
	String majors;
	int semeter;
	String univeristyName;
	
	public InternCandidate(String firstName, String lastName, int birthDay,
			String address, int phone, String email, int candidateType, String majors,
			int semeter, String univeristyName) {
		super(firstName, lastName, birthDay, address, phone, email, candidateType);
		this.majors = majors;
		this.semeter = semeter;
		this.univeristyName = univeristyName;
	}
	
	public InternCandidate() {
		
	}

	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	public int getSemeter() {
		return semeter;
	}

	public void setSemeter(int semeter) {
		this.semeter = semeter;
	}

	public String getUniveristyName() {
		return univeristyName;
	}

	public void setUniveristyName(String univeristyName) {
		this.univeristyName = univeristyName;
	}
	
	
}
