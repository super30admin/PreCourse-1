// Time Complexity : All the operations (isEmpty(), push(), pop() and peek()) take O(1) time as there is no loop
// Space Complexity : O(1) as the array size is fixed
// Any problem you faced while coding this : No

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    Stack()
    {
        // Top initialization (without having any element in stack)
        top = -1;
    }

    boolean isEmpty()
    {
        //Checks and returns true or false depending on top value
        return (top < 0);
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        // If top is pointing to last element in array or beyond it then Stack Overflow for Push otherwise Push element
        if(top >= (MAX -1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println("Element "+ x + " pushed into Stack");
            return true;
        }
    }

    int pop()
    {
        //If empty return 0 and print "Stack Underflow" otherwise pop element
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek()
    {
        // If empty then Stack underflow otherwise return top element without removing it
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
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
        System.out.println(s.peek() + " Peeked from stack");
        // To show that the peeked element is not removed from stack
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Is stack empty? :" + s.isEmpty());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Is stack empty? :" + s.isEmpty());
    }
}
