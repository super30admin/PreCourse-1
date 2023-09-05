
// Time Complexity : O(1) for all the operations 
// Space Complexity :O(1) for all the operations
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
	
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    
    
    boolean isEmpty() 
    { 
        //Write your code here 
    	return (top<0);
    	
    } 

    // using top variable to store the index of the topmost element 
    // its -1 when stack is empty 

    Stack() 
    { 
        //Initialize your constructor 
    	top=-1;
    } 
  
    // incrementing top and adding new element at index top 
    
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(top>=(MAX-1)) {
    		System.out.println("Stack Overflow");
    		return false;
    	}
    		
    	else {
    		a[++top]=x;
    		return true;
    		}
    } 
  
    // decrementing top after retrieving its element
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(top<1) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	else {
    		int x= a[top--];
    		return x;
    	}
    } 
  
    // returning the element at top index
    int peek() 
    { 
        //Write your code here
    	if(top<0) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	else {
    		int x= a[top];
    		return x;
    	}
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
