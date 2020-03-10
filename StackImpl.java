// Time Complexity : push O(1) pop O(1) peek O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : not tried
// Any problem you faced while coding this : no



public class StackImpl { 
    static final int MAX = 2; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top == 0) {
        	return true;
        }else {
        	return false;
        }
    } 

    StackImpl() 
    { 
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    {
    	if(top < MAX) {
    		a[top] = x;
    		top = top +1;
    		return true;
    	}else {   		
    		return false;
    	}
    	
    } 
  
    int pop() 
    { 
    	if(this.isEmpty()) {
    		return Integer.MIN_VALUE;
    	}else {
    		top = top - 1;
    		return a[top];
    	}
    } 
  
    int peek() 
    { 
        return a[top-1];
    } 

  

    public static void main(String args[]) 
    { 
        StackImpl s = new StackImpl(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
