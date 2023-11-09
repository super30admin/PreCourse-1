class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    // Time Complexity O(1)
    // Space Complexity O(MAX)
    static final int MAX = 1000;
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if(top<=0){  // If top value is less than or equal to zero then stack should return true
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = 0; // initializing default value
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top==MAX){  // If top value reaches the MAX limit then stack cannot accept to push any element
            System.out.println("Stack Overflow");
            return false;
        }
        a[top] = x;
        System.out.println(a[top]+" value pushed into the stack");
        top++;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){  // Stack cannot pop the element if stack is empty
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[--top];
    } 
  
    int peek() 
    { 
        //Write your code here
        if(!this.isEmpty()){  // Stack returns the last inserted element only if stack is not empty
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
        System.out.println(s.pop() + " Popped from stack");
    } 
}
