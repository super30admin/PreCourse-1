class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
	
	// Time Complexity : O(1) for each operation
	// Space Complexity : O(MAX) , as we are creating a constant array of size MAX
	// Did this code successfully run on Leetcode : Did not find on Leetcode
	// Any problem you faced while coding this : no


	// Your code here along with comments explaining your approach
    static final int MAX = 1000; 
    int top; // top pointer will point to available index in the array
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
    	return top == 0; // if top is pointing to 0 index, then it means that no element is present in the stack 
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	top =0; // pointing top to the first open position in the array
    	
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
    	if(top >= 999) { // If top point to anything above MAX-1, then the array index would be out of bounds , which would make our stack overflow
    		System.out.println("Stack Overflow");
    		return false;
    	}
        //Write your code here
    	a[top++]=x; // Since top always points to the available open space, putting the item in the space and then incrementing the top pointer by 1
    	return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	if(isEmpty()) { // If top is empty , then it means no items can be poped from it
    		System.out.println("Stack Underflow");
    		return 0;
    	}
        //Write your code here
    	return a[--top]; // decrementing top pointer by one and then returning the item at the index, next time this same index will be available to fill up, as its already been poped
    } 
  
    int peek() 
    { 
        //Write your code here
    	if(isEmpty()) { // is stack is empty, then retrun 0
    		return 0;
    	}
    	
    	return a[top-1]; // as top pointer points to the next available position, we are getting the element from 1 previous position of top
    	
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
