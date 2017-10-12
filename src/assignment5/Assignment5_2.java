package assignment5; // package declaration is compulsory.
/*
This program will help you to understand the concepts of abstract classes , Methods.
*/

abstract class Figure // abstract class
{
	//variable declaration
	double dim1;
	
	// abstract methods
	abstract void findArea();
	abstract void findPerimeter();
}

class Circle extends Figure //Child class extending abstract class
{
	//variables declaration
	double radius=12.5;
	double pie=3.14;
	
	// abstract methods implementation
	void findArea()
	{
		System.out.println("Area of Circle = "+pie*radius);
	}
	
	void findPerimeter()
	{
		System.out.println("Perimeter of Circle = "+2*pie*radius);
	}
}

class Rectangle extends Figure //Child class extending abstract class
{
	// Variables declaration
	double length=34.23;
	double width=21.08;
	
	// abstract methods implementation
	void findArea()
	{
		System.out.println("Area of Rectangle = "+length*width);
	}
	
	void findPerimeter()
	{
		System.out.println("Perimeter of Rectangle = "+2*(length+width));
	}
	
}

class Triangle extends Figure //Child class extending abstract class
{
	// Variables declaration
	double base=5.6;
	double height=12.7;
	double length=15.6;
	
	// abstract methods implementation
	void findArea()
	{
		System.out.println("Area of Triangle = "+(base*height)/2);
	}
	
	void findPerimeter()
	{
		System.out.println("Perimeter of Rectangle = "+(base+height+length));
	}
	
}


public class Assignment5_2 // Main class
{

	public static void main(String[] args) // Main method starts 
	{
		// TODO Auto-generated method stub
		
		//creating objects of child classes
		Figure c=new Circle();
		Figure r=new Rectangle();
		Figure t=new Triangle();
		
		// calling the methods of Circle class
		c.findArea();
		c.findPerimeter();
		
		// calling the methods of Rectangle class
		r.findArea();
		r.findPerimeter();
		
		// calling the methods of triangle class
		t.findArea();
		t.findPerimeter();

	}

}
