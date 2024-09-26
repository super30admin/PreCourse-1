public class StackAsArray{ 
    static final int MAX = 5; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
    	 return (top == -1);
    } 

    StackAsArray() 
    { 
        top=-1; 
    } 
  
    public boolean push(int x) 
    { 
        //Check for stack Overflow
    	if (top== MAX-1) {
    		System.out.println("Stack Overflow");
    		return false ;
    	}
        //Write your code here
    	top ++ ;
    	a[top]=x;
    	System.out.println("Pushed element:" + x ) ;
    	return true;
    } 
  
   public int pop() 
    { 
       
	   //Write your code here
	   if(!this.isEmpty())
	   {
		   int returnedTop= top ;
	    	top -- ;
	    	System.out.println("Popped element :" + a[returnedTop]);
	    	return a[returnedTop] ;
	   }
	   else {
		   //If empty return 0 and print " Stack Underflow"
    		System.out.println("Stack Underflow");
    		return 0;
    	}
       
   
    } 
  
    int peek() 
    { 
        //Write your code here
    	if(!this.isEmpty())
    		return a[top];
    	else
    		System.out.println("Stack is empty");
    		return -1;
    } 
      public static void main(String args[]) 
    { 
    	  StackAsArray s = new StackAsArray(); 
         s.push(10); 
        s.push(20); 
        s.push(30);
        
        System.out.println(s.pop() + " Popped from stack"); 
    } 
} 