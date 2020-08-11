/*class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
    	if(top==-1) {
    		return true;
    	}
    	return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	top=-1;
    	
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
    	if(a.length-1==top) {
    		System.out.println("Stack overflow");
    		return false;
    	}
        //Write your code here
    	
    	a[++top]=x;
     	
    	return true;
    	
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	if(top==-1) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
        //Write your code here
        System.out.println("top"+top);
    	
    	return a[top--];
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
        s.push(10); 
        s.push(20); 
        s.push(30); 
        s.push(40);
       
        
    } 
    
}*/
