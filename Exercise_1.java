
/* Time Complexity :  As push, pop, peek and isEmpty is checking just one time and
 we are not using any loop so it's time complexity is Big O(1).

 Space Complexity : As we are using one Array to store the element and length of 
 the array is as we delecare 1000 and if we take  1000 as n so space complexity is Big O(n).

  */

class Stack {

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {

        if (top <= -1) { // checking if top is <= -1 then we know out stack is empty.
            return true;
        }

        return false;

    }

    Stack() {

        top = -1; // Initializing the top value as -1. Use top to refer the current index.

    }

    boolean push(int x) {
        // Check for stack Overflow

        if (top >= MAX - 1) {

            System.out.println("Stack is Overflow");
            return false;

        } else {

            a[++top] = x; // adding element to the stack ++top will increment the index and then store the
                          // x value in array
            System.out.println(x + "Pushed into the Stack");
            return true;

        }

    }

    int pop() {

        int pop = 0;
        // isEmpty() methods check whether stack is empty or not
        if (isEmpty()) {

            System.out.println("Stack Underflow");
            return pop;

        }

        else {

            pop = a[top];
            top--;
        }

        return pop;

    }

    int peek() {

        if (top <= -1) {

            System.out.println("Stack is Underflow");
            return 0;
        } else {

            return a[top];

        }

    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top Element of Stack" + s.peek());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Stack is isEmpty or not" + s.isEmpty());
        s.push(40);
    }
}
