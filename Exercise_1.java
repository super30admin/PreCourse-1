//Time Complexity
// Push Operation : O(1)
//Pop Operation : O(1)
//Peek Operation : O(1)

//Space Complexity : O(n)


class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
       if(top == -1)
       {
    	   return true;
       }
       
       return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
    	this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if(top == MAX-1)
    	{
    		System.out.println("Stack Overflow");
    		return false;
    		
    	}else
    	{
    		top++;
    		a[top] = x;
    		return true;
    	}
    	
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	
    	if(top == -1)
    	{
    		System.out.println("Stack Underflow");
    		return 0;
    	}else
    	{
    		int val = a[top];
    		top--;
    		return val;
    	}
    } 
  
    int peek() 
    { 
        //Write your code here
    	if(top == -1)
    	{
    		System.out.println("Stack is empty");
    		return 0;
    	}else
    	{
    		return a[top];
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
        s.push(40);
        s.push(50);
     
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek() + " peek from stack"); 
    } 
}

