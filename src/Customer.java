import java.time.LocalDate;

public class Customer {
	
	private int employeeId;
	private String employeeName;
	private LocalDate dateOfJoning;
	private String gender;
	private String qualification;
	private String role;
	private int experience;
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public LocalDate getDateOfJoning() {
		return dateOfJoning;
	}
	public void setDateOfJoning(LocalDate dateOfJoning) {
		this.dateOfJoning = dateOfJoning;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public Customer(int employeeId, String employeeName, LocalDate dateOfJoning, String gender, String qualification,
			String role, int experience) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfJoning = dateOfJoning;
		this.gender = gender;
		this.qualification = qualification;
		this.role = role;
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "User [employeeId=" + employeeId + ", employeeName=" + employeeName + ", dateOfJoning=" + dateOfJoning
				+ ", gender=" + gender + ", qualification=" + qualification + ", role=" + role + ", experience="
				+ experience + "]";
	}
}
