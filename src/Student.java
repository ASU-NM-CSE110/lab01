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
	
	//counting the number of updates 
	private int numOfAccessed, numOfUpdates; 
	
	//default constructor
	public Student() {
		this.firstName = "null";
		this.lastName = "null";
		this.fullName = "null";
		this.asuId = "null";
		this.grade = -1.0;
		this.numOfAccessed = 0;
		this.numOfUpdates = 0;
;	}
	//Constructor
	public Student(String fName, String lName, String asuID) {
		this.firstName = fName;
		this.lastName = lName;
		this.fullName = fName + " " + lName;
		this.asuId = asuID;
		this.grade = -1.0; //default value for grade 
		
		this.numOfAccessed = 0;
		this.numOfUpdates = 0;
	}
	//implement third constructor
	public Student(String flName, String id, double newGrade) {
		String[] nameParts = flName.split(" ");
		this.firstName = nameParts[0];
		this.lastName = nameParts[1];
		this.fullName = flName;
		this.asuId = id;
		this.grade = newGrade; 
		this.numOfAccessed = 0;
		this.numOfUpdates = 0;
	}
	
	//Getters for all attributes
	//getter for first name
	public String getFirstName() {
		numOfAccessed+=1;
		return firstName; 
	}
	public void setFirstName(String yourFirstName) {
		numOfUpdates += 1;
		this.firstName = yourFirstName; 
	}
	public String getlastName() {
		numOfAccessed+=1;
		return lastName;
	}
	public void setlastName(String yourLastName) {
		numOfUpdates += 1;
		this.lastName = yourLastName; 
	}
	public String getFullname() {
		numOfAccessed+=1;
		return fullName;
	}
	public void setName(String yourFullName) {
		numOfUpdates += 1;
		this.fullName = yourFullName;
	}
	public String getAsuID() {
		numOfAccessed+=1;
		return asuId;
	}
	public void setId(String yourAsuID) {
		numOfUpdates += 1;
		this.asuId = yourAsuID;
	}
	public double getGrade() {
		numOfAccessed+=1;
		return grade;
		
	}
	
	public int getNumOfAccessed() {
		numOfAccessed+=1;
		return numOfAccessed; 
	}
	//setter for grade
	public void setGrade(double yourGrade) {
		numOfUpdates += 1;
		this.grade = yourGrade;
	}
	public int getNumOfUpdates() {
		numOfUpdates += 1;
		return numOfUpdates;
	}
	//toString method
	public String toString() {
		return String.format("Name: %s, ASU ID: %s, Grade: %.2f", fullName, asuId, grade);
	}
	
	//add equals method
	public boolean equals(Student other) {
		//check three condition one by one
		if(this.asuId.equals(other.asuId)) {
			return true;
		}else if(this.fullName.toLowerCase().equals(other.fullName.toLowerCase())) {//both Asu ID are not the same
			return true;
		}else {
			return false; 
		}
		
	}
}
