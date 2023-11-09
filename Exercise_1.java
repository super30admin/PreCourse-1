
// push timeComplexity - O(1)
// Pop timeComplexity - O(1)
// peek timeComplexity - O(1)
// isEmpty timeComplexity - O(1)
// Space complexity - O(n) // n is size of stack
// Any problem you faced while coding this : N/A

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        if(top == -1)
            return true;
        return false;
    }

    Stack()
    {
        top = -1;
    }

    boolean push(int x)
    {
        // Stack Overflow
        if(top == MAX-1){
            System.out.println("Stack Overflow");
            return false;
        }

        a[++top] = x;
        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        if(top == -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        int topElement = a[top--];
        return topElement;
    }

    int peek()
    {
        // If Stack is empty
        if(top == -1)
            return -1;
        else
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
