class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        //Write your code here
        return this.top == 0;
    }

    Stack() {
        //Initialize your constructor
        this.top = 0;
    }

    boolean push(int x) {
        //Check for stack Overflow
        //Write your code here
        if(top >= MAX) {
            return false;
        }
        this.a[top] = x;  //push x into stack
        top++;  // and increment top
        return true;
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(this.isEmpty()) {
            System.out.println(" Stack Underflow");
            return 0;
        }
        top--;
        return this.a[top];
    }

    int peek() {
        //Write your code here
        if(this.isEmpty()) {    //return 0 if stack is empty
            return 0;
        }
        return this.a[top-1];   //else return top of the stack
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
