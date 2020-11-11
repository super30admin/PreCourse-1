class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    boolean isEmpty() 
    { 
        //Write your code here
    	if(top==-1) {
    		return true;
    	}	
    	return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	a = new int[MAX];
    	top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
    	if(top++>a.length) {
    		System.out.println("stack Overflow");
    		return false;
    	}
        //Write your code here   	
    	a[top] = x;
    	System.out.println(a[top] + " Added to index " + top);
    	return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	if(isEmpty()) {
    		System.out.println("stack Underflow");
    	}
        //Write your code here   	
    	return a[top--];
    	
    } 
  
    int peek() 
    { 
        //Write your code here
    	if(!isEmpty()) {
    		System.out.println(a[top]);
    		return a[top];
    	}
        //Write your code here
    	return 0;
    } 
 
  
// Driver code 
    public static void main(String[] args) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        s.peek();
        System.out.println(s.pop() + " Popped from stack");  
        System.out.println(s.pop() + " Popped from stack"); 
        s.peek();
	}
}
