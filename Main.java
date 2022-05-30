class Stack {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    //time Complexity:O(1)
//Space Complexity:O(n)
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        if(a.length==0) return true;
        else return false;
    }

    Stack()
    {
        top=-1;//Initialize your constructor
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if(a.length>MAX){
            return false;
        }
        else{
            top++;
            a[top]=x;


            return true;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(a.length<=0) return 0;
        else{

            int temp=a[top];
            top--;
            return temp;
        }
    }

    int peek()
    {

        //Write your code here
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
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
        System.out.println(s.pop() + " Popped from stack");
        s.push(100);
        System.out.println(s.peek());
    }
}
