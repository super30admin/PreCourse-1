class Stack {

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return top < 0;
    }

    Stack() {
        //Initialize your constructor
        top = -1;

    }

    boolean push(int x) {
        if (top > MAX - 1) {
            //Check for stack Overflow
            System.out.println("Stack OverFlow");
            return false;

        } else {
            //Write your code here
            a[++top] = x;
            return true;

        }


    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        if (top < 0) {
            System.out.println("Stack UnderFlow");
            return 0;

        } else {
            int x = a[top--];
            return x;
        }
        //Write your code here
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack UnderFlow");
            return 0;

        } else {
            int x = a[top];
            return x;
        }
        //Write your code here
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
