class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    //O(1) for all operations
    static final int MAX = 1000;
    int top;
    int test;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        if(top==-1){
            return true;
        }
        return false;
    }

    Stack()
    {
        top=-1;
    }

    boolean push(int x) {
        if (top + 1 == MAX) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            top++;
            a[top] = x;
            return true;
        }
    }


    int pop()
    {
        if( isEmpty()){
            System.out.println("Stack Underflow");
            return top;
        }
        else{
            //System.out.println(a[top]);

            top--;
            return a[top+1];

        }
    }

    int peek()
    {
        //System.out.println(a[top]);
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
        System.out.println(s.peek());
    }
}
