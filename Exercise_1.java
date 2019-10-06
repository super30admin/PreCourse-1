/*
Author: Akhilesh Borgaonkar
Problem: Implement stack using Array
Approach: Used arrays to reproduce the basic functionality of stack.
Time complexity: push(), pop(), peek() - O(n) where n is number of elements currently in the stack.
Space complexity: O(MAX) for array.
Verified functionality on local machine.
*/

public class Exercise_1 {

    static class Stack {
        static final int MAX = 1000;
        int top;
        int a[] = new int[MAX]; // Maximum size of Stack
        Stack() { }

        boolean isEmpty()
        {
            //returns whether the stack is empty or has elements
            if(a[0]==0)
                return true;
            return false;
        }

        boolean push(int x)
        {

            //Pushing the integer in stack
            int currLen = 0;
            while (a[currLen] != 0) {
                currLen++;
            }

            if(a[currLen]==0 || currLen+1 < MAX) {
                a[currLen] = x;
                return true;
            }

            //If pushing beyond the size of array then stack Overflow
            System.out.println("Stack Overflow");
            return false;
        }

        int pop()
        {
            //returning the last element pushed in the stack

            if(a[0]==0) {
                //If empty return 0 and print " Stack Underflow"
                System.out.println("Stack Underflow");
                return 0;
            }

            int currLen = 0;
            while (a[currLen] != 0) {
                currLen++;
            }
            return a[--currLen];
        }

        int peek()
        {
            //shows the last element pushed in the stack
            if(a.length>0){
                top = pop();
                push(top);
                return top;
            }
            return 0;
        }
    }

    // Driver code
    static class Main {
        public static void main(String args[])
        {
            Stack s = new Stack();
            s.push(10);
            s.push(20);
            s.push(30);
            System.out.println(s.pop() + " Popped from stack");
        }
    }

}
