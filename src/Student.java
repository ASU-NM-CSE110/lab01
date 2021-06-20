/*-------------------------------------------------------------
//AUTHOR: Noah Mitrevski
//FILENAME: Program.java
//SPECIFICATION: A template file for the Program class.
//FOR: CSE110 Lab 7
//-----------------------------------------------------------*/
public class Student {
	//Declare the attributes
	private String firstName, lastName, fullName, asuId;
	private double grade;
	
	//Constructor
	public Student(String fName, String lName, String asuID) {
		this.firstName = fName;
		this.lastName = lName;
		this.fullName = fName + " " + lName;
		this.asuId = asuID;
		this.grade = -1.0; //default value for grade 
	}
	
	//Getters for all attributes
	//getter for firts name
	public String getFirstName() {
		return firstName; 
	}
	public String getlastName() {
		return lastName;
	}
	public String getFullName() {
		return fullName;
	}
	public String getAsuID() {
		return asuId;
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
		return String.format("Name: %s, ASU ID: %s, Grade: %.2f", fullName, asuId, grade);
	}
}
