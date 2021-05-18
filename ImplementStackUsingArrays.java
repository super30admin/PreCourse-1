package PreCourse_1;

// Time complexity is O(1) for push, pop and peek operations & space complexity is O(1).
/* Approach : Create an array with predefined size and initialise starting pointer to -1. 
Unless the array doesn't go out of bound, increase the pointer and insert elements. 
To pop an element, decrease the pointer index and delete the element.*/

public class ImplementStackUsingArrays {
	
    public static void main(String args[]) 
    { 
    	ImplementStackUsingArrays s = new ImplementStackUsingArrays(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
    
    
	    static final int MAX = 1000; 
	    int top; 
	    int a[] = new int[MAX]; // Maximum size of Stack 
	    
	    ImplementStackUsingArrays() 
	    { 
	        //Initialize your constructor 
	    	top = -1;
	    }
	    
	 
	    boolean isEmpty()
	    {
	        return (top < 0);
	    }
	 
	    boolean push(int x)
	    {
	        if (top >= (MAX - 1)) {
	            System.out.println("Stack Overflow");
	            return false;
	        }
	        else {
	            a[++top] = x;
	            System.out.println(x + " pushed into stack");
	            return true;
	        }
	    }
	 
	    int pop()
	    {
	        if (top < 0) {
	            System.out.println("Stack Underflow");
	            return 0;
	        }
	        else {
	            int x = a[top--];
	            return x;
	        }
	    }
	 
	    int peek()
	    {
	        if (top < 0) {
	            System.out.println("Stack Underflow");
	            return 0;
	        }
	        else {
	            int x = a[top];
	            return x;
	        }
	    }
	}
	  


