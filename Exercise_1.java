//had to google some things but was able to figure out
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top < 1);
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	top = 0;
    } 
  
    boolean push(int x) 
    { 
        if (top >= (MAX)) {
        	System.out.println("Size of stack is greater than max");
        	return false;
        }
        else {       	
        	a[top] = x;
        	top += 1;
        	System.out.println("integer " + x + " added to stack");
        	return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if (top < 1) {
        	System.out.println("Stack Underflow");
        	return 0;
        }
        else {       	
        	top -= 1;
        	int popped = a[top];
        	return popped;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
    	if (top < 1) {
        	System.out.println("Stack Underflow");
        	return 0;
        }
        else {       	
        	int peek = a[top-1];
        	return peek;
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
        s.push(40);
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek());
    } 
}