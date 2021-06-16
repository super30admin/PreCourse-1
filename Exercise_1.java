class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
		return top==-1;
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	this.top=-1;
    } 
  
    boolean push(int x) 
    {
		 
        //Check for stack Overflow
        //Write your code here
    	
    	if(this.a.length==this.top)
    	{
    		System.out.println("Stack OverFlow");
    		return false;
    	}
    	top=top+1;
    	a[top]=x;
    	return true;
    } 
  
    int pop() 
    {
	
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(this.isEmpty())
    		return 0;
    	int removeValue=this.a[top];
    	top=top-1;
    	return removeValue;
    } 
  
    int peek() 
    {
        //Write your code here
    	return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        System.out.println(s.push(10)); 
        System.out.println(s.push(20)); 
        System.out.println(s.push(30)); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek());
    } 
}
