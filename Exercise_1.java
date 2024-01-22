// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return(top<0);//Write your code here 
    } 

    Stack() 
    { 
        top=-1;//Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
    	Scanner sc= new Scanner(System.in);
        if(top==MAX-1){
        	System.out.println("Stack Overflow!");
        	return false;//Check for stack Overflow
        }
        else
        {
        	System.out.println("Enter value");
        	int val= sc.nextInt();
        	top++;
        	a[top]=val;
        	System.out.println("Push Complete!");
        	return true;
        }
        //Write your code here
    } 
  
    int pop() 
    { 
        if(top==-1)
        {
        	System.out.println("Stack Underflow!");
        	return 0;//If empty return 0 and print " Stack Underflow"
        }
        else
        {
        	top--;
        	System.out.println("Pop Complete!");
        	return 1;
        }
        //Write your code here
    } 
  
    int peek() 
    { 
    	System.out.println("Printing stack elements");
        for(int i=top; i>=0; i--){
        	System.out.println(a[i]);//Write your code here
        }
        return 1;
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
