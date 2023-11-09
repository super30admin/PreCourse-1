// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Stack {
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        return (top < 0);
    }

    Stack()
    {
        //Initialize your constructor
        top = -1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        if(top >= (MAX - 1)){ //checking if stack has already reached it's MAX value, if so then stack -> overflow
            System.out.println("Stack overflow");
            return false;
        }
        //Write your code here
        else{
            a[++top] = x; //else pushing element of the top of the stack
            System.out.println("Item pushed in the stack: " + x);
            return true;
        }
    }
    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        if(top < 0){ //checking if there is any element to pop, if not then stack -> underflow
            System.out.println("Stack underflow");
            return 0;
        }
        //Write your code here
        else{
            int x = a[top--];
            return x;
        }
    }

    int peek() { //return top element of the stack
        //Write your code here
        //checking underflow condition
        if (top < 0) {
            System.out.println("Stack underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }
    void print(){
        for(int i = top;i > -1;i--){
            System.out.println(" " + a[i]);
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
        System.out.println("Popped from stack: " + s.pop());
        System.out.println("Top element: " + s.peek());
        System.out.println("Elements present in stack: ");
        s.print();
    }
}

