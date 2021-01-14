class Stack {
    static final int MAX = 1000;
    int top;
    int a[]; // Maximum size of Stack


    boolean isEmpty() {
        //Write your code here
        if (top==-1)
        {
            System.out.println("Stack is empty");
            return true;
        }
        else{
            System.out.println("Stack is NOT empty");
            return false;
        }
    }

    Stack() {
        //Initialize your constructor
        top = -1;
        a = new int[MAX];
    }


    boolean push(int x) {
        //Your code here
        //Check Stack overflow as well
        if (top == MAX - 1) {
            System.out.println("Overflow");
            return false;
        } else {

            top++;
            a[top] = x;
            System.out.println(x);
            return true;
        }
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top == -1) {
            System.out.println("Underflow");
            return 0;
        } else {
            int x = a[top];
            top--;
            return x;
        }
    }

    int peek() {
        //Write your code here
        if (top == -1) {
            System.out.println("Stack is empty!!!");
            return 0;
        } else {
            return a[top];
        }
    }


    // Driver code
    private static class Main {
        public static void main(String args[]){
        Stack s = new Stack();
        Integer i = new Integer(5);
            s.push(10);
            s.push(20);
            s.push(30);
            System.out.println(s.pop() + " Popped from stack");
        }
    }
}
