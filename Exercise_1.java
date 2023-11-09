// Time Complexity : push,pop,peek all have o(1) since we are not iterating over whole array for any operations
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes, had to change the class to Stack1 since its already there in compilation unit of leetcode compiler.
// approach : using varible top to always maintain the top of the stack which helps in push, pop and peek operations without iterating array every time.
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
    	if(top < 0)
    		return true;
    	return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	top=-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(top+1 > MAX-1) {
    		System.out.println("Stack Overflow");
    		return false;
    	}
    	a[++top] = x;
    	return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
    	if(isEmpty()) {
    		System.out.println("Stack Empty");
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
