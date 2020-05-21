// Time Complexity : O(1)
// Space Complexity : O(1) // since MAX is a constant
// Did this code successfully run on Leetcode : Not Available 
// Any problem you faced while coding this : Determining edge cases
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
		return top==0; // top shows the position available for insertion operation. 
    } 				   // So,if top is zero then array is empty

    Stack() 
    { 
        //Initialize your constructor 
		top=0; // Making the index variable zero so that everytime when an instance is created,
    } 		   // Index starts from Zero.
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
		if(top<MAX) // Checking if top exceeds MAX Limit. Overflow condition
		{
        //Write your code here
		a[top]=x; // Adding the new element in the array
		top++; //Incrementing to next position
		return true;
		}else{
			System.out.println("Stack Overflow");
		}
		return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print "Stack Underflow"
		if(top>0) // If top is more than zero then the array contains elements
		{
        //Write your code here
		top--; // As top shows the Insertion postion, to access previous element top is decremented
		return a[top];
		}else{
			System.out.println("Stack Underflow");
		}
	    return 0;
    } 
  
    int peek() 
    { 
        //Write your code here
		if(top>0) // If top is more than zero then the array is not empty 
		{
		return a[top-1];
		}
		
		return 0;// Array is empty,cant perform peek so returning Zero
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
