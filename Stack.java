class Stack { 
    // Time Complexity : isEmpty - O(1), push - O(1), pop - O(1), peek - O(1)
    // Space Complexity : O(1) as we are using an array of constant length
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    //returns true if the stack is empty
    boolean isEmpty() 
    { 
        return top == -1;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        this.top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top == MAX-1) {
            System.out.println("Stack Overflow, cannot push elements onto the stack");
            return false;
        }

        a[++top] = x;
        return true;
    } 

    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()) {
            System.out.println("Stack Underflow, No elements in the stack to pop out");
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
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}

