
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
		return top == -1; 
    } 

    Stack() 
    {
    	//Initialize your constructor 
    	top = -1;
    } 
  
    boolean push(int x) 
    {
        //Check for stack Overflow
    	
    	if(++top == MAX-1) {
    		System.out.println("Stack Overflow");
    		return false;
    	}
    	a[top] = x;
		return true; 
		
    } 
  
    int pop() 
    {
        //If empty return 0 and print " Stack Underflow"
    	
    	if(isEmpty()) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	int n = a[top];
    	a[top--] = 0;
		return n; 

    } 
  
    int peek() 
    {
    	if(isEmpty()) {
    		return 0;
    	}
		return a[top]; 
    } 
} 
  
// Driver code 
public class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek() + " Popped from stack"); 
    } 
}
