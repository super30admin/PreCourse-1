class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
    	if(top == -1 || a.length == 0)
    	{
    		return true;
    	}
    	return false;
    } 

    Stack() 
    { 
         top = -1;
    } 
  
    boolean push(int x) 
    { 
    	//checks for stack overflow
    	if(top > a.length)
    	{
    		return false;
    	}
    	a[++top] = x;
    	return true;
    } 
  
    int pop() 
    { 
    	if(top == -1 || a.length == 0)
    	{
    		System.out.println("stack underflow");
    		return -1;
    	}
    	return a[top--];
    	//just returning the stack top and decrementing stack top, not exactly deleting the item
    } 
  
    int peek() 
    { 
    	if(top == -1 || a.length == 0)
    	{
    		System.out.println("stack underflow");
    		return -1;
    	}
    	return a[top];
    } 
    
    //stack resize in case of overflow
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
