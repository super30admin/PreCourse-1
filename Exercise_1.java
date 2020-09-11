class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
    	 return (top < 0); 
    } 

    Stack() 
    { 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
    	 if(top == MAX-1)  
         {  
             System.out.println("Stack Overflow");  
             return false;  
         }  
    	//Write your code here
         else   
         {  
             top++;  
             a[top]=x;   
             return true;  
         }  
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	 if (top == -1)  
         {  
             System.out.println("Stack Underflow !!");  
             return 0;  
         }  
    	//Write your code here
         else   
         {  
             top--;   
             System.out.println("Item popped");  
             return a[top+1];  
         } 
    } 
  
    int peek() 
    { 
    	 if (top == -1)   
    	    {  
    		 System.out.println("Stack Underflow !!");
    	        return 0;   
    	    }  
    	    else  
    	    {  
    	        return a [top];  
    	    }  
    } 
  
// Driver code 
    public static void main(String args[]) 
    { 
        Stack s = new Stack();     
        s.push(10); 
        s.push(20); 
        s.push(0); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}