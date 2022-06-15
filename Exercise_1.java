// Time Complexity: O(1) for push,pop and peek operation
// Space Complexity: O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :  n


class Stack { 
    //Please read sample.java file before starting.
	//Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top==-1)
			return true;
		else
			return false;
    } 

    Stack() 
    { 
        top=-1;
    } 
  
    boolean push(int x) 
    { 
        if(top == MAX-1)
		{
			System.out.println("stack overflow");
			return false;
		}
		else
		{
			top++;
			a[top]=x;
			return true;
		}
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
		if(top==-1)
		{
			System.out.println("stack underflow");
			return 0;
		}
		else
		{
			int val = a[top];
			top--;
			return val;
		}
    } 
  
    int peek() 
    { 
		if(top==-1)
		{
			System.out.println("stack underflow");
			return 0;
		}
		else
		{
			int val = a[top];
			return val;

		}
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
