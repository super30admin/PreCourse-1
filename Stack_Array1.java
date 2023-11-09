	//Precourse 1: Exercise 1    --  Implementing stack using array
	// Time Complexity : O(n) because there is traversal from bottom or first index till last in order to add item at last+1 position. 
	// Space Complexity :O(n) because all n elements have to be stored in array in worst case 
    // Any problem you faced while coding this : no

/*
 * is stack empty?true
Stack is Empty. Can't perform peek operation
Stack Underflow!! Can't pop items
The size of Stack is 0
true	Item 10 Pushed to stack
true	Item 20 Pushed to stack
true	Item 30 Pushed to stack
Printing stack elements[10, 20, 30]
The size of Stack is 3
the peeked item is: 30
the popped item is: 30
The size of Stack is 2
Printing stack elements[10, 20]

 */

public class Stack_Array1 {

		    static final int MAX = 1000; 
		    public int top=0; 
		    int a[]; // Maximum size of Stack		    
			int cap;

		    public Stack_Array1(int cap) 
		    { 
		        //Initialize your constructor 
		    	this.cap=cap;
		    	a = new int[cap];
		    } 
		  
		    public int size() {
		    	return top;
		    }
		    boolean isEmpty() 
		    { 
		        //Write your code here 
		    	if(top <= 0) {
		    		return true;
		    	}
		    	else {
		    		return false;
		    	}
		    	
		    } 

		    public boolean push(int x) 
		    { 
		        //Check for stack Overflow
		    	if(top > cap)
		    	{
		    		System.out.println("Stack overflow!!!");
		    		return false;
		    	}
		        //Write your code here
		    	else {
		    		a[top] = x;
		    		top++;
		    		return true;
		    	}		    	
		    } 
		  
		    
		    public int pop() 
		    { 
		        //If empty return 0 and print " Stack Underflow"
		    	if(isEmpty()) {
		    		System.out.println("Stack Underflow!! Can't pop items");
		    		return -1;
		    	}
		        //Write your code here
		    		int p= a[top-1];
		    		System.out.println("the popped item is: "+p);
		    		top--;
		    		return p;
		    } 
		  
		    public int peek() 
		    { 
		        //Write your code here
		    	if(isEmpty()) {
		    		System.out.println("Stack is Empty. Can't perform peek operation");
		    		return -1;
		    	}
		    		System.out.println("the peeked item is: "+ a[top-1]);
		    		return a[top-1];
		    }
		    
		    public String toString() {
		        String s;
		        s = "[";
		        if (size() > 0)
		            s += a[0];
		        if (size() > 1)
		        for (int i = 1; i <= size()-1; i++) {
		            s += ", " + a[i];
		        }
		        return s + "]";
		    }

		    public static void main(String args[]) 
		    
		    { 
		    	Stack_Array1 s = new Stack_Array1(4);
		    	int a=10, b=20, c=30;
		        System.out.println("is stack empty?"+ s.isEmpty());
		        s.peek();
		        s.pop();
		        System.out.println("The size of Stack is "+s.size());
		        System.out.println(s.push(a) + "\tItem "+ a +" "+ "Pushed to stack");
		        System.out.println(s.push(b) + "\tItem "+ b +" "+ "Pushed to stack");
		        System.out.println(s.push(c) + "\tItem "+ c +" "+ "Pushed to stack");
		        System.out.println("Printing stack elements" + s.toString());
		        System.out.println("The size of Stack is "+s.size());
		        s.peek();
		        s.pop();
		        System.out.println("The size of Stack is "+s.size());
		        System.out.println("Printing stack elements" + s.toString());

		    }

	}
