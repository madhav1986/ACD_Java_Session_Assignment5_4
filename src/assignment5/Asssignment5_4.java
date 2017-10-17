package assignment5; // package declaration is compulsory.
import java.util.Scanner; // import scanner class
import myPack.Stack; // import Stack interface

/*
 This class will help understand the concepts of Package and Interface
 */
class FixedStack implements Stack // FixedStack class implementing Stack interface
{
	// variables declaration
	int stck[ ];
    int topOfStack;
    
    // constructor with parameter size to accept the size of stack
     FixedStack(int size)
     {
    	 stck=new int[size];
    	 topOfStack=-1; // initializing top of stack to -1
     }
     
     // method to push elements to the stack
     public void push(int item)
     {
    	 	// condition to check stack overflow, else push the element
             if(topOfStack==stck.length-1)
             {
                     System.out.println("Stack Overflows");
                    
             }
             else
             {
            	 stck[++topOfStack]=item;
            	 System.out.println("Element Pushed : "+item);
             }
            	 
     }
     
     // method to pop element from stack
     public int pop()
     {
    	 	// condition to check stack underflow, else pop the element
             if(topOfStack<0)
             {
                     System.out.println("Stack Underflows");
                     return 0;
             }
             else
                     return stck[topOfStack--];
     }
}

class DynamicStack implements Stack // DynamicStack class implementing Stack interface
{
	// variables declaration
	 int stck[ ];
     int topOfStack;
    
     // constructor with parameter size to accept the size of stack
     DynamicStack(int size)
     {
    	 stck=new int[size];
    	 topOfStack=-1; // initializing top of stack to -1
     }
     
  // method to push elements to the stack
     public void push(int item)
     {
    	 	// logic to increase the size of stack dynamically if stack gets full and push the element
             if(topOfStack==stck.length-1)
             {
                     
                     int t[ ]=new int[stck.length * 2];
                     for(int i=0;i<stck.length;i++)
                             t[i]=stck[i];
                     stck=t;
                     stck[++topOfStack]=item;
             }
             else
             {
            	 stck[++topOfStack]=item;
            	 System.out.println("Element Pushed : "+item);
             }
            	 
     }
     
     // pop the element from dynamic stack
     public int pop()
     {
              return stck[topOfStack--];
     }
}

public class Asssignment5_4 // main class
{

	public static void main(String[] args) // main method starts
	{
		// TODO Auto-generated method stub
		// variable declaration
		int n;
		FixedStack fs=new FixedStack(3); // creating the object of FixedStack
		DynamicStack ds=new DynamicStack(3); // creating the object of DynamicStack
		
		Scanner input=new Scanner(System.in); // scanner to take input from the user.
		System.out.println("Enter the number of elements to be pushed and popped");
		n=input.nextInt(); // initializing the number
		
		System.out.println("Fixed length Stack elements : ");
		// loop to push elements to the fixed stack
		for (int i=0;i<n;i++)
		{
			fs.push(i);
		}
		
		// loop to pop elements from the fixed stack
		
		for (int i=0;i<n;i++)
		{
			System.out.println("Element popped : "+fs.pop());
		}
		
		System.out.println("Dynamic length Stack elements : ");
		
		// loop to push elements to the dynamic stack
		
		for (int i=0;i<n;i++)
		{
			ds.push(i);
		}
		
		// loop to pop elements from the dynamic stack
		
		for (int i=0;i<n;i++)
		{
			System.out.println("Element popped :"+ds.pop());
		}

	}

}
