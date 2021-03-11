class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty() {
        //Write your code here
        if (top <= -1) {
            return true;
        } else {
            return false;
        }
    }

    public Stack() {
        //Initialize your constructor
        top = -1;
    }

    boolean push(int x) {
        //Check for stack Overflow
        if (top >= a.length - 1) {
            System.out.println("Stack is full");
            return false;
        }

        //Write your code here
        else {
            top++;
            a[top] = x;
            return true;
        }
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        if (top <= -1) {
            System.out.print("Satck underflow");
            return 0;
        }
        //Write your code here
        else {
            int pop_item = a[top];
            top--;
            return pop_item;
        }
    }

    int peek() {
        //Write your code here
        if (top <= -1) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return a[top];
        }
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
