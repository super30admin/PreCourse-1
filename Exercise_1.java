//Time Complexity : O(1)
//Space Complexity : O(1)
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
		return (this.top == -1) ; 
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	this.top=-1;
    	// Initialized only top as MAX and array are already initialized above.
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(top < MAX-1) {
    		a[++top]=x;
    		return true;
    	}
    	System.out.println("Stack Overflow");
    	return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(isEmpty()) {
    		System.out.println(" Stack Underflow");
    		return 0;
    	}else {
    		return a[top--];
    	}
    } 
  
    int peek() 
    { 
        //Write your code here
    	if(isEmpty()) {
    		System.out.println("Stack is empty");
    		return 0;
    	}else {
    		return a[top];
    	}
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        System.out.println("Is Stack empty ::"+s.isEmpty());
        s.push(10); 
        System.out.println("Is Stack empty ::"+s.isEmpty());
        s.push(20); 
        System.out.println("peek :: "+s.peek()); 
        s.push(30); 
        System.out.println("peek :: "+s.peek()); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println("peek :: "+s.peek()); 
    } 
}