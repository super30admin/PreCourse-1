// Time Complexity : o(1)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int arr[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return ( top == -1);
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        // condition to check overflowing of the stack.
        if(top == MAX-1){
            System.out.println("Stack Overflow");
            return false;
        }
        top++;
        arr[top]=x;
        System.out.println( x + " added to the stack.");
        return true;
    }

    int pop() {
        // to check under flowing of the stack.
        if(top==-1){
            System.out.println("Stack Underflow, the stack is empty.");
            return 0;
        }
        int val=arr[top];
        top--;
        return val;
    }

    int peek() {
        if(top==-1){
            System.out.println("Stack is empty.");
            return 0;
        }
        return arr[top];
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
