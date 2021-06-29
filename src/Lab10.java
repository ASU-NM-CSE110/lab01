/*-------------------------------------------------------------
//AUTHOR: your name.
//FILENAME: title of the source file.
//SPECIFICATION: your own description of the program.
//FOR: CSE 110 - Lab #10
//TIME SPENT: how long it took you to complete the assignment.
//-----------------------------------------------------------*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab10
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        /* Create an array of Student */
        final int NUM_STUDENTS = 10;
        Student[] gradebook = null;

        // >>>>> YOUR CODE HERE <<<<<
        gradebook = new Student[NUM_STUDENTS];
        /* Read the input file and add new records into the Student array */

        // >>>>> YOUR CODE HERE <<<<<
        BufferedReader reader = new BufferedReader(new FileReader("lab10_student_data.txt"));
        for(int i = 0; i < NUM_STUDENTS; i++) {
        	String line = reader.readLine();
        	if(line != null) {
        		String[] fills = line.split(",");
        		gradebook[i] = new Student(fills[0],fills[1],Double.parseDouble(fills[2]));
        		System.out.printf("read #%-2d: %s\n", (i+1), gradebook[i].toString());
        	}
        }
        /* Find out duplicate student records by .equals() */
        for (int i = 0; i < NUM_STUDENTS; i++)
        {
            for (int j = i + 1; j < NUM_STUDENTS; j++)
            {
                if (gradebook[i].equals(gradebook[j]))
                {
                    System.out.printf("\"%s\" and \"%s\": %s\n",
                            gradebook[i].getFullName(), gradebook[j].getFullName(), gradebook[i].getId());
                }
            }
        }
    }
}
