public class Stack {

    static final int MAX = 5;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return a.length == 0 ? true : false;
    }

    Stack() {
        //Initialize your constructor
        top = 0;
    }

    boolean push(int x) {
        //Check for stack Overflow
        System.out.println("Pusing: " +x+ ", Top at start: "+top);

        if (top == MAX) {
            System.out.println("Stack Overflow, Length MAX reached");
            return false;
        }

        a[top++] = x;
        System.out.println("Top at push end: " + top);
        return true;
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        System.out.println("Pop top at start: " + top);

        if (a.length == 0) {
            System.out.println("Stack Underflow");
            return 0;
        }

        top--;
        System.out.println("Pop top at end: " + top);
        return a[top];
    }

    int peek() {
        //Write your code here
        System.out.println("Top at start of peek: "+top);
        if (a.length == 0) {
            return 0;
        }
        System.out.println("Top at start of peek: "+top);
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
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println(s.peek() +  " Peek from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() +  " Peek from stack");
    }
}
