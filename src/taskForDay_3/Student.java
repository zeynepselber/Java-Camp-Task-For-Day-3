package taskForDay_3;

public class Student extends User{

	private String studentNumber ;
	private String address ;
	private String[] certificates ;
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getStudentNumber() {
		
		this.studentNumber = super.getFirstName().substring(0 , 1).toUpperCase() + 
				             super.getLastName().substring(0 , 1).toUpperCase()  + 
				             super.getId();
		
		return studentNumber;
	}
	
	public String[] getCertificates() {
		return this.certificates ;
	}
	
	public void setCertificates( String[] certificates ) {
		this.certificates = certificates ;
	}
}
