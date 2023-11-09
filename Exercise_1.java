//Space Complexity O(MAX)
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return top < 0? true: false;
    } 

    Stack() 
    {
        //Initialize your constructor
        top = -1;
    }

    //Time complexity: O(1)
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top == MAX - 1) {
            return false;
        }
        top = top + 1;
        a[top] = x;

        return true;
    }

    //Time complexity: O(1)
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top == -1) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
    }

    //Time complexity: O(1)
    int peek() 
    { 
        if(isEmpty()) {
            return -1;
        }
        return a[top];
    } 
}

class Main {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " peep into stack");
    }
}
