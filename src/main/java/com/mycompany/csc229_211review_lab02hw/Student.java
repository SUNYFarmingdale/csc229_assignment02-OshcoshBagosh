package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person {
	// ToDo 1: Make this class a child of Person
    private double gpa;
	
	// ToDo 2: Fix the resulting errors

    public String getAddress(){

    }

    @Override
    public void setAddress(String address) {

    }

    // ToDo 3: Add a field for GPA and create setter and getter
    public void setGPA(double gpa)
    {
        this.gpa = gpa;
    }

    public double getGPA()
    {
        return this.gpa;
    }
	
	// ToDo 4: Add comments to your code

}