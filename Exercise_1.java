class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top < 0 ){
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        top = 0;
    } 
  
    boolean push(int x) 
    {
        if(top < MAX)
        {
        	top ++;
			a[top] = x;
			System.out.println("Stack not full, value pushed: "+x);
			return true;	    
        }
	
		System.out.println("Stack overflow!");
		return false;
    } 
  
    int pop() 
    { 
        if(isEmpty())
        {
            System.out.println("Stack underflow!");
            return -1;
        }

        int val = a[top];
		top --;
        return val;

    } 
  
    int peek() 
    { 
        if(top>=0 && top<MAX)
        	return a[top];
		else
        {
			System.out.println("Index out of bounds!");
			return -1;
        }
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
        System.out.print(s.peek() + "At top of stack");
    } 
}
