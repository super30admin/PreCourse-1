using System;
namespace Algorithms
{
    /// <summary>
    /// Implement stack using Array
    /// </summary>
    public class ArrayStack
    {

        static int MAX = 1000;
        int top;
        int[] a = new int[MAX]; // Maximum size of Stack 

        public ArrayStack()
        {
            top = -1;
        }

        public bool isEmpty()
        {
            if (top == -1)
            {
                return true;
            }
            return false;
        }

        public bool push(int x)
        {
            if (top == MAX - 1)
            {
                Console.WriteLine("Stack overflow");
                return false;
            }
            else
            {
                a[++top] = x;
                return true;
            }
        }
        public int pop()
        {
            if (top == -1)
            {
                Console.WriteLine("Stack undeflow");
                return 0;
            }
            else
            {
                return a[top--];
            }
        }
        public int peek()
        {
            if (top == -1)
            {
                Console.WriteLine("Stack is empty");
                return 0;
            }
            else
            {
                return a[top];
            }
        }
    }
}

