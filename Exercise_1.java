
  
// Time Complexity : O(1) for push, pop, peek, isEmpty, isFull
// Space Complexity : O(1) as the size of the stack is fixed

class Stack {
        //Please read sample.java file before starting.
        //Kindly include Time and Space complexity at top of each file
        static final int MAX = 5;
        int top = 0;
        int stackArray[] = new int[MAX]; // Maximum size of Stack

    // method to check if stack is empty
        boolean isEmpty() {
            //Write your code here
            if (top == 0) {
                return true;
            }
            return false;
        }

        // method to check if stack is full
        boolean isFull() {
            if (top == stackArray.length) {
                return true;
            }
            return false;
        }

        // method to add an item to stack. It increases top by 1
        boolean push(int value) {
            //Check for stack Overflow
            if (isFull()) {
                System.out.println("Stack overflow for value " + value);
                return false;
            }

            //Write your code here
            stackArray[top] = value;
            top = top + 1;
            return true;
        }

        // method to remove an item from stack. It decreases top by 1
        int pop() {
            //If empty return 0 and print " Stack Underflow"
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return 0;
            }
            //Write your code here
            top = top - 1;
            int peekValue = stackArray[top];
            stackArray[top] = 0;
            return peekValue;
        }

        // method to return top element in stack
        int peek() {
            //Write your code here
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return 0;
            }
            return stackArray[top - 1];
        }
    }


 class Main {
    public static void main(String args[])
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30);
        s.push(40);

        for (int i: s.stackArray) {
            System.out.println(i);
        }
        System.out.println(s.peek() + " Peeked from stack");
        System.out.println(s.pop() + " Popped from stack");
    }
}

