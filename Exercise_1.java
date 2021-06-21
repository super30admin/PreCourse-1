//Implement Stack using Array
class Stack {
    static final int MAX = 10;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        return top == -1;
    }

    Stack()
    {
        top = -1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here

        if(top >= (MAX - 1)){
            System.out.println("Stack Overflow ");
            return false;

        }else {
            System.out.println("Inserting element into stack: "+x);
            a[++ top ] = x;
            return true;

        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        }
        return a[top--];
    }

    //Returning the top element
    int peek()
    {
        //Write your code here
        if(top <0){
            System.out.println("No elements in stack");
            return 0;
        }else {
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
        System.out.println("The top element is " +s.peek());
        System.out.println(s.pop() + " Popped/removed from stack");
    }
}