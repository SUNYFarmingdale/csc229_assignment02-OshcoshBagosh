package com.mycompany.csc229_211review_lab02hw;

import java.util.Scanner;
import java.util.SortedMap;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
	
	public static void main(String[] args) {
		//Creates scanner object
		Scanner scnr = new Scanner(System.in);
		// ToDo 5: Fix the error
		
		// ToDo 6: Fix the constructor of Student class
		
		// ToDo 7: Add a toString method for Student class
		
		Student std1= new Student("James", 20);
		
		// ToDo 8: Set the gpa of the student using the scanner and user
		// 			input and then print the output.

		//Allows input and sets double for gpa
		System.out.print("Input GPA: ");
		std1.setGPA(scnr.nextDouble());

		System.out.println();
		System.out.println(std1);
		
		// ToDo 9: add comments and explain your code
		
		// ToDo 10: submit using a pull request.
	}

}