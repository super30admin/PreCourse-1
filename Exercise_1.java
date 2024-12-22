// Time Complexity :
//  isEmpty(): O(1)
//  Push(): O(1)
//  Pop(): O(1)
//  Peek(): O(1)

// Space Complexity :
//      Push(): O(1)
//      Pop(): O(1)
//      Peek(): O(1)

// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No

// Your code here along with comments explaining your approach
//Approach
//The stack is implimented using array of fix size MAX with the top pointer indicating with following operations.
// isEmpty(): Checks if the stack is empty. This is true if top == -1
// push(): Adds an element x to the top of the stack, but first checks if there is space available 
// If the stack is full it prints "Stack Overflow" and returns false.
// pop(): Removes the top element from the stack and returns it. If the stack is empty,
// it prints "Stack Underflow" and returns -1.
// peek(): Returns the value of the top element without removing it. If the stack is empty, it returns -1.
//the position of top element in the stack.
//The array a[] holds the elements of the stack



class Stack { 

    // Maximum size of Stack
    static final int MAX = 1000;

    //Top pointer of the Stack
    int top;

    //Array to represent the stack
    int a[] = new int[MAX]; 


    //Constructor to initialize the Stack
    Stack()
    {
        //Initialize your constructor
        top = -1;
    }

    //Method to check if Stack is Empty
    boolean isEmpty()
    {
        //Write your code here
        return top == -1;
    }

    //Method to push an element into the Stack
    boolean push(int x)
    {
        //Check for stack Overflow
        if(top == a.length-1) {
            System.out.println("Stack is overflow");
            return false;
        }
        //Write your code here
        top++;
        a[top] = x;
        return  true;

    }

    //Method to pop the top element from Stack
    int pop() {
        //If empty return 0 and print " Stack Underflow"
        if(isEmpty()) {
            System.out.println("Stack is underflow");
            return -1;
        }
        //Write your code here
        int poppedElement = a[top];
        top--;
        return poppedElement;
    }

    //Method to return top element without removing from Stack
    int peek()
    {
        //Write your code here
        if(isEmpty()){
            return  -1;
        }
        return a[top];
    }
}
