class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
    	//returns true  if top is -1.
        return top==-1;
    	
    } 
    
    boolean isFull() 
    { 
    	//returns true  if top is MAX.
        return top==MAX -1;
    	
    }
    
    int size() 
    { 
       // returns size of stack
    	
        return top+1;
    	
    }

    Stack() 
    { 
        //Initializing top to  -1.
    	top =-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
    	if(isFull()) {
    		System.out.println("Stack Overflow");
    		return false;
    	}
    	else {
    		System.out.println("pushing element x = "+x);
    		a[++top]=x;
    		return true;
    	}
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	if(isEmpty()) {
    		System.out.println("Stack underflow");
    		return 0;
    	}else {
    		return a[top--];
    	}
        
    } 
  
    int peek() 
    { 
        //returns top element of stack
    	if(isEmpty()) return -1;
    	else {
    		int topElement = a[top];
    		return topElement;
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
