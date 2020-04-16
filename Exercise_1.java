
class Stack{ 
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
    	if(top > (MAX-1))
    	{
    		System.out.print("Stack is full\n");
    		return false;
    	}
    	else {
    		a[++top] = x;
    		System.out.print(x +" pushed to stack\n");
    		return true;
    	}
    } 
  
    int pop() 
    { 
        
    	if(a.length==0) {
    		System.out.print("Stack Underflow\n");
    		return 0;
    	}
    	else {
    		int x = a[top--];
    		return x;
    	}
    	//If empty return 0 and print " Stack Underflow"
        //Write your code here
    } 
  
    int peek() 
    { 
        if(top < 0)
        {
        	System.out.print("Stack Underflow\n");
        	return 0;
        }
        else {
        	int x = a[top];
        	return x;
        }
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        StackArray s = new StackArray(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
