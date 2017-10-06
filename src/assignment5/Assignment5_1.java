package assignment5; // package declaration is compulsory.
/*
  This program will help you to understand the concepts of abstract class , inheritance and abstract methods.
 */

abstract class Bank // Abstract class 
{
	// Abstract Method
	public abstract int RateOfInterest();
}


class Sbi extends Bank //class extending abstract class
{
	// Implementation of Abstract Method 
	public int RateOfInterest()
	{
		return 4;
	}
}

class Hdfc extends Bank //class extending abstract class
{
	//Implementation of Abstract Method
	public int RateOfInterest()
	{
		return 5;
	}
}

public class Assignment5_1 
{

	public static void main(String[] args) // main method starts
	{
		// TODO Auto-generated method stub
		
		
		Bank sbi =new Sbi(); // creating object of Sbi class
		Bank hdfc =new Hdfc(); // creating object of hdfc class
		
		
		System.out.println("Rate of Interest for SBI Bank is : "+sbi.RateOfInterest()+"%"); // accessing the implementation of abstract method using Sbi class
		
		System.out.println("Rate of Interest for HDFC Bank is : "+hdfc.RateOfInterest()+"%"); // accessing the implementation of abstract method using hdfc class

	}

}
