class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    

    Stack() 
    { 
        //Initialize your constructor 
		top = 0;
    } 
	
	boolean isEmpty() 
    { 
        //Write your code here 
		boolean res;
    	if(top==0) {
    		res =  true;
    	}else {
    		res = false;
    	}
    	return res;
		
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
		if(a.length == top) {
    		throw new ArrayIndexOutOfBoundsException("Stack is full");
    	}    	
        
    	a[top] = x;
    	top = top + 1;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
		if(top == 0) {
    		return 0;
    	}
    	
    	top = top - 1;
    	return a[top];
    } 
  
    int peek() 
    { 
        //Write your code here
		if(top == 0) {
    		return 0;
    	}
    	
    	return a[top-1];  
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
