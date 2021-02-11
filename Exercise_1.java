package precourse1;

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
    	return top<0 ? true : false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
    	if(a.length>MAX) {
    		System.out.println("Stack overflow");
    		return false;
    	}
    	top++;
    	a[top] = x;
    	System.out.println(a[top]+" "+top);
        //Write your code here
    	return true;

    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	if(top<0) {
    		System.out.println("Stack underflow");
    		return 0;
    	}
    	//Write your code here
    	int val = a[top];
    	top--;
    	return val;

    } 
  
    int peek() 
    { 
        //Write your code here
    	if(top<0) {
    		return 0;
    	}
    	return a[top];

    } 
} 
  
// Driver code 
class ImpStackUsingArray { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        System.out.println(s.isEmpty());
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.isEmpty());
        System.out.println("Peeked element: "+s.peek());
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Peeked element: "+s.peek());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Peeked element: "+s.peek());
    } 
}