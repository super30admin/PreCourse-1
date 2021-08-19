class Stack { 
   //Please read sample.java file before starting.
  //Time Complexity O(1)
 //Space Complexity O(MAX) ~= O(n)

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
    	if (top < 0) {
    		return true;
    	}
    		return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(top >= MAX-1) {
    		System.out.println("Stack overflow");
    		return false;
    	}
    	else {
    		top = top + 1;
    		a[top] = x;
    		return true;
    	}
    	
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	//Write your code here
    	if(top <= 0) {
    		System.out.println("Stack UnderFlow");
    		return 0;
    	}
    	else {
    		int num = a[top];
    		top = top - 1;
    		return num;
    	}
        
    } 
  
    int peek() 
    { 
        //Write your code here
    	if(top < 0) {
    		System.out.println("Stack UnderFlow");
    		return 0;
    	}
    	else {
    		int num = a[top];
    		return num;
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
