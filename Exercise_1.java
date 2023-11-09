class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
  //Time Complexity All Operatons O(1)
  //Space Complexity Array O(1)
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    boolean isEmpty() 
    { 
        if(top==-1) {
        	return true;
        }
        return false;
    } 

    Stack() 
    { 
        top =-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top>a.length) {
        	return true;
        }
        else {
        	
        	a[++top]=x;
        	return false;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()) {
        	System.out.println("Stack Underflow");
        	return 0;
        }
        else {
        	return a[top--];
        }
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
