class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
    	//check top is 0 or above so that stack has values 
    	return top < 0;
         
    } 

    Stack() 
    { 
    	// initialize the stack top to -1
    	top = -1;
        
    } 
  
    boolean push(int x) 
    { 
    	//Check for stack Overflow
    	if (top > MAX - 1) return false;
        
    	//insert 
    	a[++top] = x;
    	return true;
      
    } 
  
    int pop() 
    { 
    	//If empty return 0 and print " Stack Underflow"
    	if (top < 0 )  {
    		System.out.println("Stack Underflow");
    		return 0;
    	
    	}
        
    	
    	//return the top element and remove the top element
    	return a[top--];
  
    } 
  
    int peek() 
    { 
    	// Corner Case: Stack has no elements
    	if (top < 0 )  {
    		System.out.println("Stack Underflow");
    		return 0;
    	
    	}
    	//return the top element from the array
    	return  a[top];
       
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
