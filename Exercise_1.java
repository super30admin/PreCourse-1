// Time Complexity : O(1) for push, pop and peek operations as we are just accessing the element of array where top pointer is currently at
// Space Complexity : 0(n) i.e size of static array
// Any problem you faced while coding this : No

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        return top == -1;
    }

    Stack()
    {
        top = -1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        if(top > MAX -1){
            System.out.println("Stack if full, cannot add more elements");
            return false;
        }else{
            a[++top] = x;
            System.out.println(x + " is pushed onto the stack");
            return true;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        if(top == -1){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            System.out.println(a[top] + " is popped from the stack");
            return a[top--];
        }
    }

    int peek()
    {
        if(top == -1){
            System.out.println("Stack is Empty");
            return 0;
        }else{
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
        System.out.println(s.pop() + " Popped from stack");
    }
}
