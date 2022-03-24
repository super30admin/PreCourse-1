import java.util.EmptyStackException;

class Stack { 
    //Please read sample.java file before starting.
  //push is generally 0(1) but if the stack is full, then it's 0(n)
    //pop is 0(1)
    //peek is 0(1)
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        return top == 0;
    }

    Stack()
    {
        this.a = a;
    }

    boolean push(int x)
    {
        if(top == a.length){
            int[] b = new int[2 * a.length];
            System.arraycopy(a,0,b,0,a.length);
            a = b;
        }
        a[top++] = x;
        return true;
    }

    int pop()
    {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int b= a[--top];
//        a[top] = null;
        return b;
    }

    int peek()
    {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return a[top -1];
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
