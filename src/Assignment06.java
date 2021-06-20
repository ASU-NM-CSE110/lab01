/*CSE 110 : 40448 / M-Th 6:00 - 7:15 
 * Assignment : Assignment 6
 * Author : Noah Mitrevski 1219008323
 * Description : This program is just 10 arrays in methods
 */
import java.util.Scanner;
public class Assignment06 {

    public static void main(String[] args) {
        // Write any code here that you may wish to test your methods defined below.
    	Scanner scan = new Scanner(System.in);
    	String write;
    	write = scan.nextLine();
    	int[] bla = {1,2,3,4,9};
    	
    	printArray(bla, write);
    	System.out.println(getFirst(bla));
    	System.out.println(getLast(bla));
    	printArray(getAllButFirst(bla), write);
    	System.out.println(getIndexOfMax(bla));
    	//printArray(swapByIndex(bla, 4, 1), "lol");
    	//printArray(removeAtIndex(bla, 1), "lol");
    	printArray(insertAtIndex(bla, 2, 4132), " ");
    }
    
    // 1) Write a public static method named printArray, 
    //   that takes two arguments. The first argument is an Array of int 
    //   and the second argument is a String. The method should print out 
    //   a list of the values in the array, each separated by the value of the second argument.
    public static void printArray(int[] x, String a) {
    	for(int i = 0; i < x.length; i++) { // for loop goes through every index of the array
    		System.out.print(x[i]); // index of array
    		System.out.print(a); // the string
    		
    	}
    }
   
    // 2) Write a public static method named getFirst, 
    //    that takes an Array of int as an argument and returns 
    //    the value of the first element of the array.
    public static int getFirst(int[] x) {
    	return x[0]; // giving the very first element
    }
    
    
    // 3) Write a public static method named getLast, 
    //    that takes an Array of int as an argument and returns 
    //    the value of the last element of the array.
    public static int getLast(int[] x) {
    	return x[x.length - 1]; // this will get the very last element
    }
    
    
    // 4) Write a public static method named getAllButFirst, 
    //    that takes an Array of int as an argument and creates and returns 
    //    a new array with all of the values in the argument array except the first value.
    public static int[] getAllButFirst(int[] x) {
    	int[] a = new int[x.length - 1]; // creates a new array
    	for(int i = 0; i < a.length; i++){
    		a[i] = x[i+1]; // shifts the array over
    	}
    	return a; 
    }
    
    
    // 5) Write a public static method named getIndexOfMin, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the least value in the array.
    public static int getIndexOfMin(int[] x) {
    	int smallest = x[0]; 
    	int index = 0; 
    	 for(int i = 0; i < x.length; i++) {
    		 	if(smallest > x[i]) { // checks if it is the smallest
    		 		smallest = x[i];
    		 		index = i; 
    		 }
    	 }
    	 return index;
    }
    
    
    // 6) Write a public static method named getIndexOfMax, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the largest value in the array.
    public static int getIndexOfMax(int[] x) {
    	int max = x[0]; // this can be considered a place holder
    	int index = 0; 
    	 for(int i = 0; i < x.length; i++) {
    		 	if(max < x[i]) { // checks if bigger, if it is than it moves it to the place holder
    		 		max = x[i];
    		 		index = i; 
    		 }
    	 }
    	 return index;
    }
    
    
    // 7) Write a public static method named swapByIndex, 
    //    that takes three arguments. The first argument is an Array of int, 
    //    and the second and third arguments are int indexes. 
    //    This method will swap the values at the two given index arguments 
    //    in the array, and return a reference to the array.
    public static int[] swapByIndex(int[] x, int index1, int index2 ) {
    	int temp = 0; // temp number
    		temp = x[index1]; // moves it to temp
    		x[index1] = x[index2]; // swaps the index's
    		x[index2] = temp; // moves out of temp
    	
    	return x;
    }
    
    
    //8) Write a public static method named removeAtIndex, 
    //  that takes two arguments. The first argument is an Array of int, 
    //  and the second argument is an int index. This method create and return 
    //  a new array with all of the values in the argument array 
    //  except the value at the argument index.
    public static int[] removeAtIndex(int[] x, int index) {
    	int[] a = new int[x.length - 1];  // creates a new array
    		for(int i = 0; i < index; i++) {
    			a[i] = x[i];// up until the index keeps the array the same
    		}
    		for(int i = index; i < x.length - 1; i++) {
    			a[i] = x[i+1]; // skips the index that we are removing
    		}
    		
    	return a;
    }
    
    
    //9) Write a public static method named insertAtIndex, 
    //   that takes three arguments. The first argument is an Array of int, 
    //   the second argument is an int index, and the third argument is an int value. 
    //   This method create and return a new array with all of the values 
    //   in the argument array and including the third argument value 
    //   inserted at the index specified by the second argument value.
    public static int[] insertAtIndex(int[] x, int index, int value) {
    	int[] a = new int[x.length + 1]; //creates a new array
			for(int i = 0; i < index; i++) {
				a[i] = x[i];// up until index it keeps the array the same
			}
			for(int i = index; i < x.length; i++) {
				a[i+1] = x[i]; // skips a space for the new value 
			}
				a[index] = value;// inserts the value 
		
			return a;
    	 
    }
    
    
    //10) Write a public static method named isSorted, 
    //    that takes an Array of int as an argument. 
    //    This method should return the boolean value true 
    //    if all the element values in the array are in ascending order; 
    //    otherwise the method should return the boolean value false.
    public static boolean isSorted(int[] x) {
    		for(int i = 0; i < x.length - 1; i++ ) {
    			if(x[i] > x[i + 1]) { // this will check both numbers at the same time and return false if the condition is met
    				return false;
    			}
    		}
    		return true;
    }
    

}
