class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int[] a = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        return a.length == 0;
        //Write your code here
    }

    Stack()
    {
        //Initialize your constructor
        top = -1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if(top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            top++;
            a[top] = x;
            return true;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top < 0 || top > MAX - 1){
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top--];
        }
    }

    int peek()
    {
        //Write your code here
        if(top < 0 || top > MAX - 1){
            return Integer.MIN_VALUE;
        }
        return a[top];
    }
}
  
// Driver code 
class Main { 
    public static void main(String[] args)
    { 
        Stack s = new Stack();
        System.out.println(s.push(10));
        System.out.println(s.peek());
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.isEmpty() + " is stack empty");
    } 
}
