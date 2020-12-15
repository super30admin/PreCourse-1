class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
    	
    	if(top==-1)
    		return true;
    	else
    		return false;//Write your code here 
    } 
    Stack() 
    { 
    	//Initialize your constructor
    	top=-1;
         
    } 
  
    boolean push(int x) 
    { 
    	if(top==MAX-1)
    		return false;
    	else {
    		top=top+1;
    		a[top]=x;
    		System.out.print("element insert in stack"+a[top]);
    		return true;
    	}    				
    		
    		
        //Check for stack Overflow
        //Write your code here
    } 
    int pop() 
    { 
    	if(!isEmpty())
    	{
    		
    		int x=a[top];
    		top=top-1;
    		System.out.print("element pop"+x);
    		return x;
    	}
    	else
    	{
    		return 0;
    	}
    }
  
    int peek() 
    { 
    	//Write your code here
    	if(top==-1) {
    		System.out.print("stack empty");
    		return 0;
    	}
    	else
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

