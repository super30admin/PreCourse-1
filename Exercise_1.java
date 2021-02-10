class Stack1 {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        if (top == -1){
            return true;
                      }
        else {
            return false ;
             }
        }

    Stack1()
    {
        //Initialize your constructor
        top = 0;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        if(top == MAX){
        System.out.println("Stack is full. Cannot insert more elements");
        return false;
        }

        //Write your code here
        a[top++]=x;
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
        int tmp = a[top-1];
        top--;
        return tmp;
    }

    int peek()
    {
        //Write your code here
        if(!isEmpty()){
            return a[top-1];
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
        
    }
}

// Driver code
class Main {
    public static void main(String args[])
    {
        Stack1 s = new Stack1();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}

