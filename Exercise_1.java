import java.util.*;

class Stack { 
    static final int MAX = 6; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    
    //New variable to keep track of the stack size
    int size;
  
   boolean isEmpty() 
    { 
        if (this.size == 0)
        	return true;
        return false;
    }

    Stack() 
    { 
        //Initialize your constructor
    	this.size = 0;
    	this.top=0;
    } 
    
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if (this.top+1 > this.a.length) {
        	System.out.println("Stack Overflow");
        	return false;
        }
        else {
        	this.top = this.top + 1;
        	this.a[this.size++] = x;
        	
        }
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	if (this.size == 0) 
    	{
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	else 
    	{
    	    this.top = this.top - 1;
    		
    		this.size--;
    		return this.a[this.size];
    		
    	}
    } 
  
    int peek() 
    { 
    	if (this.size == 0) 
    	{
    		System.out.println("Empty Stack");
    		return -1;
    	}
    	else 
    	{
    		return this.a[this.size-1];
    		
    	}
    } 
    
    /*public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
       
        for (int i=0;i<4;i++){
        	int value = new Random().nextInt(1000);
        	
        	System.out.println(s.push(value) + " Pushed new element to stack"); 
        	System.out.println(s.peek() + " Element at top is being printed");
        	System.out.println(s.pop() + " Popped from stack"); 
        	
         }
        System.out.println(s.isEmpty() + " List is empty");
        System.out.println(s.pop() + " Popped from stack");
        
        
    } */
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

