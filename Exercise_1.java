
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[];
    public Stack() 
    { 
        //Initialize your constructor 
    	top=-1;
    	a = new int[MAX]; // Maximum size of Stack 
    } 
    boolean isEmpty() 
    { 
        //Write your code here 
    	return top==-1;
    } 
    boolean isFull() 
    { 
        //Write your code here 
    	return top==MAX-1;
    } 
    boolean push(int x) 
    { 
        //Check for stack Overflow
    	if(isFull())
    		return false;
        //Write your code here
    	else {
    		a[++top]= x;
    		return true;
    	}
    } 
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	if(isEmpty()) {
    		System.out.println("Stack Underflow: can not pop");
    		return 0;
    	}
        //Write your code here
    	else 
    		return a[top--];
    	
    } 
    int peek() 
    { 
        //Write your code here
    	if(isEmpty()) {
    		System.out.println("Stack is empty");
    		return 0;
    	}
        //Write your code here
    	else 
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
