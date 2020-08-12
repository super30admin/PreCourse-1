
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
       top = -1;
    } 
  
    boolean push(int x) 
    {
        //Check for stack Overflow
        //Write your code here
    	if(top < MAX)
    	{
    		a[++top] = x;
    		
    		return true;
    	}
    	System.out.println("Stack Overflow");
    	return false;
    } 
  
    int pop() 
    {
		
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(top >= 0)
    	{
    		int x= a[top];
    		a[top--] = 0;
    		return x;
    	}
    	System.out.println("Stack Underflow");
    	return 0;
    } 
  
    int peek() 
    {
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