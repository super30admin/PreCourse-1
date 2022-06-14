import s30precourse1exercises.Stack;

class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
    	if (top==0)
    		return true;
    	else
    		return false; 
    	 
    } 

    Stack() 
    { 
        top=0;
    } 
  
    boolean push(int x) 
    {
    	//Check for stack Overflow
        //Write your code here
    	if (top > MAX) 
    		return true;
    	else {
    		a[top] = x;
    		top++;
    	}
		return false; 
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if (isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	else {
    		--top;
    	}
    		return peek();
    } 
  
    int peek() 
    { 
    	System.out.println("Peeking out value");
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
        System.out.println(s.pop() + " Popped 1 element from stack"); 
        System.out.println(s.pop() + " Popped 2 element from stack");
        System.out.println(s.pop() + " Popped 3 element from stack");
        System.out.println(s.pop() + " Popped 4 element from stack");
    } 
}
