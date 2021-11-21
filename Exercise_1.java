class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file

/*Time Complexity :
  All the functions will take constant amount of time O(1).
  Space complexity will be size of the stack 0(N);

*/

    static final int MAX = 3; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
    	if(top == MAX) {
    		return true;
    	}
    	return false;
    } 

    Stack()
    { 
      top=0;  
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
    	if(!isEmpty()) {
    		a[top]=x;
    		top++;
    		return true;
    	}
    	System.out.println("stack is full");
    	return false;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	if(top == 0) {
            System.out.println("Stack Underflow");
    		return 0;
    	}
    	else {
    		int i = a[top-1];
    		top--;
    		return i; 		
    	}
    } 
  
    int peek() 
    { 
    	if(top==0) {
    		System.out.println("Stack is Empty");
    		return 0;
    	}
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
        s.push(40);
        System.out.println(s.peek() + " Peek from stack");
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peekd from stack");
        
    } 
}
