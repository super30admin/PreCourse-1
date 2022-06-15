// class for stack
// time complexity 0(1)
// space complexity 0(n)
// getting difficulty in calculating space complexity
class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
// to check if the stack is empty or it has some elements
    boolean isEmpty()
    {
        // if top is -1 means no element in the stack so it is empty
        if(top==-1) {
            return true;
        }
        // else stack has some elements
        else
        {
            return false;
        }
    }
// to check if the stack is full
    boolean isFull()
    {
        // if max-1 is equal to top means stack is full
        if(MAX-1==top)
        {
            return true;

        }
        // else stack is not full
        else
        {
            return false;
        }

    }
// constructor to initialize the top
    Stack()
    {
        this.top=-1;
    }
// function to push element in  the stack
    boolean push(int x)
    {
        // to check the stack is not full
        if(!isFull())
        {
            top++;
            a[top]=x;
            System.out.println("Pushed element");
            return true;
        }
        // if it is full we can't insert the element
        else
        {
            System.out.println("Stack is Full");
            return false;
        }
    }

    int pop()
    {
        // to check if the stack is empty if not pop the element
        if(!isEmpty())
        {
            int popped_element=a[top];
            top--;
            System.out.println("Popped element");
            return popped_element;

        }
        // if the stack is empty we can't remove the element
        else{
            System.out.println("Stack is Empty");
            return -1;
        }
    }
// to get the element on the top if the stack is not empty
    int peek()
    {
        if(!isEmpty())
            return a[top];
        else
        {
            System.out.println("Stack is Empty ");
            return -1;
        }
    }
}

// Driver code
// to test the code
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