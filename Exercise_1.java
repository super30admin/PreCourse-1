class Stack {
    static final int MAX = 10;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty()
    {
        //Write your code here
        if(top == -1)
            return true;
        else
            return false;
    }

    Stack()
    {
       top = -1;
    }

    boolean push(int x) throws Exception {
        //Check for stack Overflow
        //Write your code here
        top++;
        if(top  == MAX - 1)
            throw new Exception ("Stack Overflow");
        else {
            a[top] = x;
        }
        return true;
    }


    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == -1){
            System.out.println("Stack underflow");
            return 0;
        }else{
            top--;
            return a[top+1];
        }
    }

    int peek()
    {
        //Write your code here
        if(top == -1){
            System.out.println("Stack is empty");
            return 0;
        }else
            return a[top];
    }
}

// Driver code 
class Main {
    public static void main(String args[]) throws Exception {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}