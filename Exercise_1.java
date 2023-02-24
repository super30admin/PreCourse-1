//Time Complexity for each method is O(1)
//Space complexity for each is O(n)
import java.util.Arrays;
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        if (top ==-1)
        return true;
        else
        return false;
    }

    Stack()
    {
        //Initialize your constructor
        int top =-1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        if (top == a.length -1){
        System.out.println("Stack Overflow");
		return false;
        }
        else
        //Write your code here
        a[++top] = x;
		return true;

    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty()){
        System.out.println("Stack Underflow");
        return 0;
        }
        //Write your code here
        else
       return a[top--];
    }

    int peek()
    {
        //Write your code here
        if (isEmpty())
        return -1;
        return a[top];
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
        s.push(30);
        s.push(50);
        s.push(80);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek());
        System.out.println(s.isEmpty());

    }
}
