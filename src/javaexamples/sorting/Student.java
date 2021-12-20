package javaexamples.sorting;

public class Student {
	private Integer studentId;
	private String courseName;
	private String grade;
	
	
	public Student(Integer studentId, String courseName, String grade) {
		//super();
		this.studentId = studentId;
		this.courseName = courseName;
		this.grade = grade;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseName=" + courseName + ", grade=" + grade + "]";
	}
	
	
}
