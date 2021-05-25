

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
    	if(top==0) {
    		return true;
    	}
    	return false;
    
    } 

    Stack1() 
    { 
        //Initialize your constructor 
    	top=0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
    	
    	if(top>=MAX-1) {
    		System.out.println("Stack Overflow");
    		return false;
    		
    	}
    	this.a[top]=x;
    	
    	top++;
    	
    	return true;
    	
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if(top==0) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	top--;
    	int res=a[top];
    	return res;
    	
    } 
  
    int peek() 
    { 
    	
        //Write your code here
    	if(top==0) {
    		return -1;
    	}
    	//System.out.println(a[top]);
    	return a[top-1];
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
        System.out.println(s.peek());
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
