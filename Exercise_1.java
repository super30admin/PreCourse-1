// Time Complexity : O(1) for push/pop/peek
// Space Complexity : O(1) for push/pop/peek
//Exercise_1 : Implement Stack using Array.
class StackCustom {
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty()
    {
        //Write your code here
        if(top ==-1)
            System.out.println(" Stack is empty");
        else
            System.out.println(" Stack is not empty");
        return top ==-1;
    }

    StackCustom()
    {
        //Initialize your constructor 
        top =-1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here

        if(top == MAX-1){
            System.out.println("Stack is already full");
            return false;
        }else{
            a[++top] = x;
            return true;
        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top == -1){
            System.out.println("stack underflow");
            return 0;
        }
        int result = a[top];
        a[top--]=0;
        return result;
    }

    int peek()
    {
        //Write your code here
        if(isEmpty())
            return 0;
        return a[top];
    }
}

// Driver code 
class Main {
    public static void main(String args[])
    {
        StackCustom s = new StackCustom();
        s.isEmpty();
        s.push(10);

        System.out.println("after push 10");
        for(int i=0;i<=s.top;i++)
            System.out.println(s.a[i]);

        s.isEmpty();
        s.push(20);

        System.out.println("after push 20");
        for(int i=0;i<=s.top;i++)
            System.out.println(s.a[i]);

        s.isEmpty();
        s.push(30);

        System.out.println("after push 30");
        for(int i=0;i<= s.top;i++)
            System.out.println(s.a[i]);

        s.isEmpty();
        System.out.println(s.pop() + " Popped from stack");

        System.out.println("after pop");
        for(int i=0;i<= s.top;i++)
            System.out.println(s.a[i]);

        System.out.println(s.peek() + " Peek from stack");

        System.out.println("after peek");
        for(int i=0;i<= s.top;i++)
            System.out.println(s.a[i]);


    }
}