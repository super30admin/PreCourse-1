// Time Complexity : All operations O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : I did not find this question on leetcode
// Any problem you faced while coding this : No


// Code here along with comments explaining your approach



class Stack { 
    
  
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
       if(top==-1) {
	   return true;
       }
       return false;
    } 
    
    //initialise top index as -1
    Stack() 
    { 
        this.top=-1; 
    } 
    
    /*
     * Checks if the top index is out of the range then do not add. Else adds new element at the top index.
     */
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
	top++;
	if(top>=1000) {
	    return false;
	}else {
	    a[top]=x;
	    return true;
	}
    } 
    
    /*
     * Checks if the top index is -1 by checking if the array is empty. If empty then return 0 (covered in peek()),
     * else find the element at the top index and return it. Also decrement the top index after that.
     */
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
	
	int valueattop = peek();
	top--;
	return valueattop;
    } 
    
    /*
     * Checks if the array is not empty, if empty return 0 else find the element at the top index and return it
     */
    int peek() 
    { 
	if(isEmpty()) {
	    System.out.println(" Stack Underflow");
	    return 0;
	}
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
