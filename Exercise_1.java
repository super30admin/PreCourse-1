class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top==-1)
		{
			return true;
		}		
		return false;
		
    } 

    Stack() 
    { 
        top=-1;
    } 
  
    boolean push(int x) 
    { 
        if(top<a.length-1)
        {
        	top=top+1;
        	a[top]=x;
        	System.out.println(a[top] + "is pushed in to stack");
        }
        else{
        	System.out.println("Stack is full");
        	return false;
        }
        return true;
    } 
  
    int pop() 
    { 
         if(top==-1)
         {
         	System.out.print("Stack is empty");
         	return 0;
         }
         else{
         	int popItem= a[top];
         	top=top-1;
         	return popItem;
         }
    } 
  
    int peek() 
    { 
    	if(top!=-1)
    	{
        	return a[top];
    	}
    	return 0;
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
