package beans;

public class Student {
	String studentName;
	String studentCity;
	String studentEmail;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentCity=" + studentCity + ", studentEmail=" + studentEmail
				+ "]";
	}
	public Student(String studentName, String studentCity, String studentEmail) {
		super();
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.studentEmail = studentEmail;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
