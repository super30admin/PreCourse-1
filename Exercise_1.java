
//Exercise_1 : Implement Stack using Array.

/* Time Complexity : O(1)
 Space Complexity : O(n)

 Approach - maintaing length and toop variables to check for the empty stack and get the latest index info for the array
 to get the push, pop and peek operations.
 */

class Stack {

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack
    int len;

    boolean isEmpty()
    {
        //Write your code here
        return len == 0|| a == null ;
    }

    Stack()
    {
        //Initialize your constructor
        len = 0;
        top =-1;
    }

    boolean push(int x)
    {
        if(len <MAX)
        {
            a[len] = x;
            top = len;
            len++;
            return true;
        }
        else
        {
            System.out.println("Stack Overflow");
            return false;
        }

    }

    int pop() {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int temp = a[top];
            a[top--] = 0;
            len--;
            return temp;
        }
    }
    int peek()
    {
        if(!isEmpty())
            return a[top];
        return  0;
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
