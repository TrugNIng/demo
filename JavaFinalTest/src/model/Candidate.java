package model;

/**
 * @author User
 * @date Nov 28, 2017
 */
public class Candidate {
	String firstName;
	String lastName;
	int birthDay;
	String address;
	int phone;
	String email;
	int candidateType;
	
	public Candidate(String firstName, String lastName, int birthDay,
			String address, int phone, String email, int candidateType) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.candidateType = candidateType;
	}
	
	public Candidate() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCandidateType() {
		return candidateType;
	}

	public void setCandidateType(int candidateType) {
		this.candidateType = candidateType;
	}	
}
