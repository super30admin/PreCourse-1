//Time Complexity : O(1)
//Space Complexity: O(1), since stack size is already pre-defined.

class Stack { 	
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    int stackSize = MAX;
  
    boolean isEmpty() 
    { 
		if(a.length == 0)
			return true;
		else
			return false;
    } 

    Stack() 
    { 
    	top = -1;
    } 
  
    boolean push(int x) 
    { 
    	if(stackSize - 1 == top)
			return false;
		
		top++;
		a[top] = x;
		return true;
    } 
  
    int pop() 
    { 
		if(isEmpty()) 
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		
		int p = a[top];
		a[top--] = 0;
		return p;
    } 
  
    int peek() 
    { 
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
