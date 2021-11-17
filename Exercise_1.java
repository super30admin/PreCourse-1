class Stack { 
	
	//push - Time complexity O(1) and Space Complexity O(1)
	//pop - Time complexity O(1) and Space Complexity O(1)
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
    	
    	if(top==-1)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
        //Write your code here 
    } 

    Stack() 
    { 
    	//initialized top to -1
    	top=-1;
        //Initialize your constructor 
    } 
    boolean push(int x) 
    {
    	//Check for stack Overflow
        //Write your code here
    	//if array is not full  then only element will be pushed 
    	if(top!=MAX)
    	{
    		top++;
    		a[top]=x;
    		
    		return true;
    	}
    	
    	//if there is no space to push in array
    	else 
    	{
    		System.out.println("Stack Overflow");
    		return false;
    	}
    	
        
    } 
  
    int pop() 
    { 
    	//If empty return 0 and print " Stack Underflow"
        //Write your code here
    	
    	//if there is no element in array
    	if(top==-1)
    	{
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	
    	//return top element from array
    	else
    	{
    		top--;
    		return a[top+1];
    	}
    	
        
    } 
  
    int peek() 
    { 
    	//Write your code here
    	if(top==-1)
    	{
    		System.out.println("Stack is empty");
    	}
    	//returns top element from array if its not empty
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
        s.push(40); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
