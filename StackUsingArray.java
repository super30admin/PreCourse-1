package precourse1;

class StackUsingArray { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] ; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
    	return top < 0;
    }
    
    

    StackUsingArray() 
    { 
        //Initialize your constructor
    	a = new int[MAX];
    	top = -1;
    }
    
    
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if (top + 1 == MAX) {
    		return false;
    	}
    	
    	top++;
    	a[top] = x;
    	
    	return true;
    	
    	
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if (top == -1) {
    		return 0;
    	}
    	
    	int popped = a[top];
    	top--;
    	return popped;
    } 
  
    int peek() 
    { 
        //Write your code here
    	if (top == -1) {
    		System.out.println("Stack is empty");
    		return -1;
    	}
    	int peeked = a[top];
    	return peeked;
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
    	StackUsingArray s = new StackUsingArray(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}