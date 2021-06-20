
/*-------------------------------------------------------------
// AUTHOR: Noah Mitrevski
// FILENAME: Lab7.java
// SPECIFICATION: This program makes a record
//-----------------------------------------------------------*/
import java.util.Scanner;
public class Lab7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sFirstname, sLastname, sAsuID;
        double sGrade;
        String pName, pDesc, pFname;

        // Read some input data
        println("The student's first name?");
        sFirstname = scan.nextLine();
        println("The student's last name?");
        sLastname = scan.nextLine();
        println("The student's ASU ID?");
        sAsuID = scan.nextLine();
        println("Program name?");
        pName = scan.nextLine();
        println("Program desc?");
        pDesc = scan.nextLine();
        println("Program filename?");
        pFname = scan.nextLine();
        println("Program grade?");
        sGrade = scan.nextDouble(); scan.nextLine();
        println(""); scan.close();

        // Create a Student object "student1"
        Student student1 = new Student(sFirstname, sLastname, sAsuID);
        System.out.println("Making a Student record\n...[" + student1 + "]");

        // Use the setGrade setter to set student1's grade
        student1.setGrade(sGrade);


        // Create a Program object "program1" by "student1"
        Program program1 = new Program(pName, pDesc, pFname, student1);
        System.out.println("Making a program record\n...[" + program1 + "]");

        // Invoke makeReport to show the report of student1
        makeReport(program1);

    }



    private static void makeReport(Program program) {
        println("\n========== Program Submission Detail ==========");
        pprint("Student", program.getAuthor().getFullName());
        pprint("ASU ID", program.getAuthor().getAsuID());
        pprint("Grade", "" + program.getAuthor().getGrade());
        println("");
        pprint("Program", program.getProgramName());
        pprint("Filename", program.getFileName());
        pprint("Description", program.getDescription());
        pprint("Datetime", program.getCreatedDate());
    }

    private static void pprint(String key, String value) {
        println(String.format("%-12s: %-10s", key, value));
    }

    private static void println(String s) {
        System.out.println(s);
    }
}
/*Output: The student's first name?
			Noah
			The student's last name?
			Mitevski
			The student's ASU ID?
			1219008323
			Program name?
			Lab7.java
			Program desc?
			First time learning java
			Program filename?
			lol
			Program grade?
			20
			
			Making a Student record
			...[Name: Noah Mitevski, ASU ID: 1219008323, Grade: -1.00]
			Making a program record
			...[Program: Lab7.java, Desc: First time learning java, Filename: lol, Author: Name: Noah Mitevski, ASU ID: 1219008323, Grade: 20.00]
			
			========== Program Submission Detail ==========
			Student     : Noah Mitevski
			ASU ID      : 1219008323
			Grade       : 20.0      
			
			Program     : Lab7.java 
			Filename    : lol       
			Description : First time learning java
			Datetime    : 2021-06-14T15:49:20.391914700
 */
