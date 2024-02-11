package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person {
	// ToDo 1: Make this class a child of Person

    //Instance Variables
    String address;
    private double gpa;
	
	// ToDo 2: Fix the resulting errors

    //Constructor
    public Student(String nm, int age){
        super.setName(nm);
        super.setAge(age);
    }

    //Overrides and returns address
    @Override
    public String getAddress(){
        return this.address;
    }

    //Overrides and sets address
    @Override
    public void setAddress(String ad) {
        this.address = ad;
    }

    // ToDo 3: Add a field for GPA and create setter and getter

    //sets gpa
    public void setGPA(double gpa)
    {
        this.gpa = gpa;
    }

    //returns gpa
    public double getGPA()
    {
        return this.gpa;
    }

    //Overrides toString() function and returns all student data
    @Override
    public String toString(){
        return "Name: " + super.getName() + "\nAge: " + super.getAge() + "\n" + "Address: " + this.address + "\nGpa: " + this.gpa + "\n";
    }
	
	// ToDo 4: Add comments to your code

}