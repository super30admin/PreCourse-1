// Time Complexity :  O(1)
// Space Complexity : O(1)

// Code 

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        if (top == -1) {
            System.out.println("Stack is empty"); // if top is -1 then there is no element in stack
            return true;
        } else {
            return false;
        }

    }

    Stack() {
        top = -1; // Initializing top as -1 because initially stack is empty
    }

    boolean push(int x) {
        if (top == a.length - 1) {
            System.out.println("Stack Overflow"); // if top reaches till the last index of array then there is no space
                                                  // left to add more elements
            return true;
        } else
            top++;
        a[top] = x; // if there is space left in array then first increment the index of top and
                    // then add the element at that index
        return false;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow"); // if top is -1 then there is no element left in stack to delete
            return 0;
        } else {
            int val = a[top];
            top--;
            return val; // if there are elements present in stack then store the element at top index in
                        // a variable and then decreement the top index and return the value
        }
    }

    int peek() {
        // Write your code here
        if (top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top]; // return the element present at top of stack
        }
    }
}

// Driver code
class Exercise_1 {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack"); // output -> 30 Popped from stack
    }
}
