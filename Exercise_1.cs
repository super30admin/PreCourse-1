using System;

/*
OUTPUT: 30 Popped from stack

Method      Time complexity     Space complexity
isEmpty         O(1)                O(1)
push            O(1)                O(1)
pop             O(1)                O(1)
peek            O(1)                O(1)
*/

namespace Precourse1
{
    public class Stack
    {
        //Please read sample.java file before starting.
        //Kindly include Time and Space complexity at top of each file
        static readonly int MAX = 1000;
        int top;
        int[] a = new int[MAX]; // Maximum size of Stack 

        public Stack()
        {
            top = -1;
        }
        public bool isEmpty()
        {
            return top == -1;
        }

        public bool push(int x)
        {
            //Check for stack Overflow
            //Write your code here
            if (top < MAX-1)
            {
                a[++top] = x;
                return true;
            }
            else
            {
                return false;
            }
        }

        public int pop()
        {
            //If empty return 0 and print " Stack Underflow"
            //Write your code here
            if (top == -1)
            {
                Console.WriteLine("Stack Underflow");
                return 0;
            }
            else
            {
                return a[top--];
            }
        }

        public int peek()
        {
            //Write your code here
            if (top == -1)
            {
                Console.WriteLine("Stack is empty");
                return top;
            }
            else
            {
                return a[top];
            }
        }
    }

    // Driver code 
    class Runner
    {
        public static void Main(String[] args)
        {
            Stack s = new Stack();
            s.push(10);
            s.push(20);
            s.push(30);
            Console.WriteLine(s.pop() + " Popped from stack");
        }
    }
}