//Time Complexity: O(1)
//Space Complexity : O(N)
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
    	return (top<0);			//will return true if empty, else false
    } 

    Stack() 
    { 
    	top = -1;
        //Initialize your constructor 
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
    	if(top >=1000) {			//Stack size is set to 1000, checking the last element
    		System.out.println("Stack is full");
    	}
        //Write your code here
    	else {
    		a[top++] = x;		//adding the element into the stack.
    		System.out.println(x+ "inserted into the stack");
    	
    	}
    	return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	if(top<0) {
    		System.out.println("Stack is empty");
    		return 0;
    	}
        //Write your code here
    	else {
			int x = a[top--];
			return x;
		}
    } 
  
    int peek() 
    { 
        
    	//Write your code here
    	if(top<0) {
    		System.out.println("Stack is empty");
    		return 0;
    	}
    	else {
    	 int x = a[top];
    	 return x;
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

