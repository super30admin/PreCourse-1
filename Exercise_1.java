class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	this.top = -1; //initialising top with -1
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(this.top == this.MAX - 1) {
    		System.out.println("Stack Overflow");
    		return false;
    	}else {
    		this.top++; //incrementing top
    		this.a[top] = x;
    		return true;
    	}
    	
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	int val ;
    	if(this.top == -1) {
    		System.out.println("Stack Underflow");
    	}else {
    		val = this.arr[this.top];
    		this.top--;
    		
    	}
    	return val;
    } 
  
    int peek() 
    { 
        //Write your code here
    	return this.a[this.top];
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
