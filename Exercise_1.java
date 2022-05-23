package s30PreCourse;

//Time Complexity :O(1)
//All the Methods in this class has Time Complexity O(1).
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Didn't see this problem on Leetcode and hence solve locally.
//Any problem you faced while coding this : NO

class Stack { 
    //Please read sample.java file before starting.
	//Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    
    boolean isEmpty() 
    { 
        //Write your code here 
    	//check if top is empty or not, if it is empty we can add the new value.
    	if(top == -1){
    		return true;
    	}
    	return false;
    	
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	top= -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(top == MAX-1){
    		return false;
    	}else{
    		//increament the top and put the value x at the location top is pointing to.
    		top++;
    		a[top] = x;
    		return true;
    	}
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(isEmpty()){
    		System.out.println(" Stack Underflow");
    		return 0;
    	}else{
    		//return the top and postdecreament the top.

    		int value = a[top];
            top--;
            return value;
    	}
    	
    } 
  
    int peek() 
    { 
        //Write your code here
    	//check if the stack is empty or not
    	if(isEmpty()){
    		System.out.println(" Stack Underflow");
    		return 0;
    	}
    	//if It is not Empty then return the top elemnt but do not decrement the top pointer as Peek only check for the last added value and does not removeit.
    	return a[top];
    	
    } 
} 
  
// Driver code 
class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
        s.push(30);
        System.out.println(s.peek() + " Peeked from stack");
    } 
}
