//Implementing Stack using array
/*
Time Complexity --> 
pop() --> O(1)
push() --> O(1)
isEmpty() --> O(1)
peek() --> O(1)
 */
class Stack {

    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty() {
        //Write your code here

        return top == 0;

    }

    Stack() {
        //Initialize your constructor 
        top = 0;
    }

    boolean push(int x) {
        //Check for stack Overflow
        if (top == 100) {
            System.out.print("Stack Overflow");
            return false;
        } //Write your code here
        else {
            a[top] = x;
            top++;
            return true;
        }

    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } //Write your code here
        else {
            int val = a[top];
            top--;
            return val;

        }
    }

    int peek() {
        //Write your code here
        if (isEmpty()) {
            return 0;
        }
        return a[top];

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
