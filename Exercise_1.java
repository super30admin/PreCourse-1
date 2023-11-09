// Time Complexity :O(1)
// Space Complexity :O(n), where n is the maximum size of the stack.
// Did this code successfully run on Leetcode :wasn't able to find it on leetcode
// Any problem you faced while coding this :No.

class Stack { 
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        return top==-1;
    }

    Stack()
    {
        top=-1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        if(top==a.length-1){
            System.out.println("Stack Overflow!");
            return false;
        }
        else {
            top++;
            a[top]=x;
            return true;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            return 0;
        }
        else{
            int item=a[top];
            top--;
            return item;
        }
    }

    int peek()
    {
        if(a[top]!=-1){
            return a[top];
        }
        else{
            throw new ArrayIndexOutOfBoundsException("Stack Underflow");
        }
    }

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
