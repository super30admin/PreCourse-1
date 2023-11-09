class Stack {
    //Please read sample.java file before starting.
  //Time complexity for push operation: Constant time, Pop Operation: Constant time, Peek Opertion:Constant time
  //Space Complexity:  Constant time  as we are using an array of 1000 capacity to maintain our stack.
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //check of top is -1, if top is -1, it is empty else stack has elements on it.
        if(top == -1)
            return true;
        else
            return false
    }

    Stack()
    {
        //intialise top to -1.
        top = -1;
    }

    boolean push(int x)
    {
        //chek of top is max, if top is eqaul to max then it is full with capacity otherwise increment top and store the data in stack
        if(top == MAX){
            System.out.print("Stack Overflow");
            return false;
        }
        else {
            top++; //increment top
            a[top] = x; // store the integer element at top of the stack
            return true;
        }

    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //check if top is -1, if it is -1 then stack is empty else return the top element and decrement top
        if(isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        }
        else {
            int x = a[top];
            a[top] = -1; //set the data to -1 as we are removing it from stack
            top //decrement top
            return x;
        }
    }

    int peek()
    {
        //Write your code here
        // check if stack is empty
        if(isEmpty){
            System.out.println(" Stack is empty");
            return -1;
        }
        return a[top]; //if not empty return the top most element
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
