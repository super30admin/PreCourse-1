// Time Complexity - Push, Pop, Peek - O(1)
// Space Complexity - O(1)

class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    private int top;
    private int a[]; // Maximum size of Stack
    private int size;

    boolean isEmpty() {
        //Write your code here
        return size == 0;
    }

    Stack() {
        //Initialize your constructor
        a = new int[MAX];
        top = 0;
        size = 0;
    }

    boolean push(int x) {
        //Check for stack Overflow
        //Write your code here
        if (a.length == top) return false;

        a[top++] = x;

        size++;

        return true;
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int data = a[--top];

        a[top] = 0;

        size--;

        return data;
    }

    int peek() {
        //Write your code here
        return a[top - 1];
    }
}

// Driver code 
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
