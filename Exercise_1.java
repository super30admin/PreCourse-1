//Time complexity : O(1) for all the push, pop, peek, isEmpty operations
//Space Complxity : O(1) all the time, we initaialize a predefined Array of provided Max size

class Stack { 
    
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Top holds value to the stack's last element's index, if stack is empty it's value will be = -1
        return top == -1;
    } 

    Stack() 
    { 
        //Initializing top to -1, creating an empty stack
        this.top = -1;   
    } 
  
    boolean push(int x) 
    { 
        //check if stack is used at its maximum capacity
        if (top == MAX - 1){
            System.out.println("Stack Overflow");
            return false;       
        } else {
            //increment top's value and  insert value to be pushed at top's index
            a[++top] = x;
            return true;   
        }        
    } 
  
    int pop() 
    { 
        //check if stack is empty
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        } else { 
            //return value at the top and decrement top
            return a[top--];   
        }
    } 
  
    int peek() 
    { 
        //check if stack is empty
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        } else {   
            //return value at the to
            return a[top];   
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
        System.out.println("Stack is empty : " + s.isEmpty()); 
        System.out.println(s.peek() + " Peek value of the stack");
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.peek() + " Peek value of the stack");
        System.out.println("Stack is empty : " + s.isEmpty()); 
    } 
}
