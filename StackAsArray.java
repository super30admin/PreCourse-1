class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX];
  
    boolean isEmpty() 
    {
    	//If top is -1 then it will return true since the stack is empty else return false
    	if(top == -1) {
    		System.out.println("Stack Empty");
    		return true;
    	}
    	System.out.println("Stack is not empty");
    	return false;
    } 

    Stack() 
    { 
    	//Intializing the top as -1 which indicates the stack is empty
        top = -1;
    } 
  
    boolean push(int x) 
    { 
    	//We only push if the stack is empty and it's not full
    	if(top+1 >= 0 && top+1 < MAX) {
    		top++;
	        a[top] = x;
	        return true;
    	}
    	System.out.println("Stack Overflow");
    	return false;
    } 
  
    int pop() 
    { 
    	//If the stack is empty we return 0 else we pop the elements
    	if(isEmpty()) {
    		return 0;
    	}
    	int temp = a[top];
    	top--;
    	return temp;
    } 
  
    int peek() 
    { 
    	//We return the topmost element
    	if(isEmpty()) {
    		return Integer.MIN_VALUE;
    	}
		return a[top];
    } 
} 
  
// Driver code 
class StackAsArray { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
    } 
}
