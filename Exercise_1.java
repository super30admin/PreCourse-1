class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
    	
    	if(top==-1)
		return true;
    	return false;
        //Write your code here 
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	top=-1;
    } 
  
    boolean push(int x) 
    {
    	if(top==MAX) {
    		System.out.println("Stack overflow");
    		return false;
    		
    	}
    		
    	else {
    		top++;
    		a[top]=x;
    		return true;
    	}
        //Check for stack Overflow
        //Write your code here
    } 
  
    int pop() 
    {
    	if(top==-1) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}else {
    		return a[top--];
    	}
    		
		
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    {
    	if(top==-1) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}else {
    		return a[top];
    	}
        //Write your code here
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
