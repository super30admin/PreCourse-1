class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty() {
        return this.top == -1;
        //Write your code here 
    }

    Stack() {
        //Initialize your constructor 
    }

    boolean push(int x) {

        top++;
        a[top] = x;


        return true;
        //Check for stack Overflow
        //Write your code here
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        } else{
            int val = a[top];
            top--;
            return val;
        }

        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    }

    int peek() {
        return a[top];
        //Write your code here
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
//        System.out.println(s.pop() + " Popped from stack");

    }
}
