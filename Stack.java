package com.company;

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        return true;
    }

    Stack()
    {
        //Initialize your constructor
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        return 0;
    }

    int peek()
    {
        //Write your code here
        return 0;
    }
}

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
