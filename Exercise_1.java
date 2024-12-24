// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :None
// Your code here along with comments explaining your approach



class Stack { 


    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(a[top]==-1)
        	return true;
        return false; 
    } 

    Stack() 
    { 
        //Initializing the constructor
          top =0; 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
    	if(a[top]==1000)
    		return false;
        //Increase the top index and then insert element
    	top++;
    	a[top]=x;
    	
    	return true;
    } 
  
    int pop() 
    { 
       //If empty return 0 and print " Stack Underflow"
    	if(a[top]==-1) {
    		System.out.println(" Stack Underflow");
    		return 0;
    		
    	}
         
        //get the topmost element
        //reduce the top index and return the topmost element
    	int x=a[top];
    	top--;
    	return x;
    } 
  
    int peek() 
    { 
        //Simply return the topmost element
       return a[top];
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
