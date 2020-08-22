package precourse1;

//Time Complexity : O(1)
//Space Complexity : O(n)
//Any problem you faced while coding this : No

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        //Write your code here 
    	if(top==-1)	return true; 	//checks whether the stack is empty
    	return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	top=-1;	
    } 
  
    boolean push(int x) 
    {
        //Check for stack Overflow
        //Write your code here
    	if(top>=MAX-1)	return false; 	//return false if stack limit exceeds the MAX limit
    	a[++top]=x;						//adds the element to the array
    	return true;
    } 
  
    int pop() 
    {	
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	
    	//checks if there is any element in the stack
    	if(top<0) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	return a[top--]; 	//removes the top element from the stack and returns it
    } 
  
    int peek() 
    {
        //Write your code here
    	//returns the top element of the stack
    	return a[top]; 
    } 
} 
  
// Driver code 
public class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");	//removes element 30 from the stack
    } 
}
