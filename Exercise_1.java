class Stack {
    static final int MAX = 1000;
    int top = -1; //index
    int[] arr = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return top == -1;
    }

    int length() {
        // gets number of elements in the stack
        return top + 1;
    }

    boolean push(int x) {
        if (top < MAX - 1) {
            top++;
            arr[top] = x;
            return true;
        }
        return false;
    }

    int pop() {
        //If empty return 0 and print "Stack Underflow"
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return arr[top--];
    }

    int peek() {
        //returns the top element
        return top < 0 ? -1 : arr[top];
    }
}

// Driver code
class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Array length : " + s.length());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Peek from stack");
        System.out.println("Is Stack empty : " + s.isEmpty());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Is Stack empty : " + s.isEmpty());
        System.out.println("Array length : " + s.length());
    }
}

// Time complexity: O(1) for all operations, since none of the operations require iteration over n elements.
// Space complexity: O(1)

/**
 * To implement a stack using a fixed-size array,
 * we maintain an index variable called top, which keeps track of the position of the last inserted element.
 * This approach eliminates the need to iterate through the array to determine the stack’s size or top element,
 * ensuring constant time operations for push(), pop(), and peek().
 */