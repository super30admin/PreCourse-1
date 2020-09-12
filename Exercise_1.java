class Stack { 
    static final int MAX = 1000; //const. time space O(1)
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() //const. time space O(1)
    { 
    	 return (top < 0); 
    } 

    Stack() //const. time space O(1)
    { 
        top = -1;
    } 
  
    boolean push(int x) //time to push n elements O(n) space O(1)
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
  
    int pop() //O(1)
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
  
    int peek() //O(1)
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