/*-------------------------------------------------------------
//AUTHOR: Noah Mitrevski
//FILENAME: Program.java
//SPECIFICATION: A template file for the Program class.
//FOR: CSE110 Lab 7
//-----------------------------------------------------------*/
public class Student{
	//Declare the attributes
	private String fullName, asuId;
	private double grade;
	
	
	//default constructor
	public Student(String fullname, String asuID, double yourGrade) {
		
		this.fullName = fullname;
		this.asuId = asuID;
		this.grade = yourGrade;
		
;	}

	
	
	public String getFullName() {
		return fullName;
	}
	public void setName(String yourFullName) {
		this.fullName = yourFullName;
	}
	public String getId() {
		return asuId;
	}
	public void setId(String yourAsuID) {
		this.asuId = yourAsuID;
	}
	public double getGrade() {
		return grade;
	}
	
	//setter for grade
	public void setGrade(double yourGrade) {
		this.grade = yourGrade;
	}
	//toString method
	public String toString() {
		return String.format("%20s %10s", this.fullName, this.asuId);
	}
	
	//add equals method
	public boolean equals(Object other) {
		//check three condition one by one
		if(other == null) {
			return false; 
		}else if(this.getClass() != other.getClass()) {
			return false;
		}else {
			Student another = (Student)other;
			if(this.asuId.equals(another.asuId)) {
				return true;
			}else {
				return false;
			}
		}
		
	}
}
