class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
 
    boolean isEmpty()
    {
        return a.length == 0;
    }
 
    Stack()
    {
        this.top = 0;
    }
 
    boolean push(int x)
    {
        //Check for stack Overflow
        if(top == MAX){
            System.out.println("Stack Overflow");
            return false; 
        }
        a[++top] = x;
        return true;
    }
 
    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write your code here
        int popped = a[top--];
        System.out.println("Popped value is " + popped);
        return popped;
    }
 
    int peek()
    {
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
    }
 }
 