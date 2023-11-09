// Since we are not running any loops on the functions [isEmpty(), push(), pop(), peek()] the time complexity is O(1)
// Since we are not running any loops on the functions [isEmpty(), push(), pop(), peek()] the space complexity is O(1)
// Problems while writing this code: Some problem while wrting the code for peek()
class Stack {

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        if (top < 0) return true;

        return false;
    }

    Stack()
    {
        top = -1;
    }

    boolean push(int x)
    {
        if (top >= MAX - 1) {
            System.out.println ("Stack Overflow");
            return false;
        } else {
            a[top++] = x;
            System.out.println (x + "Element has been pushed in the Stack");
            return true;
        }
    }

    int pop()
    {
        if (top < 0) {
            System.out.println ("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            top--;
            return x;
        }
    }

    int peek()
    {
        if (top < 0) {
            System.out.println ("Stack Underflow");
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
    }
}
