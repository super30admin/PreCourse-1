using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PreCourse_1
{
    internal class Stack
    {
        //Time Complexity: O(n^2)
        //Space Complexity: O(n^2) where n is total number of elements
        static int MAX = 1000;
        int top, length;
        int[] a = new int[MAX]; // Maximum size of Stack 

        public bool IsEmpty()
        {
            return length == 0;
        }

        public Stack()
        {
            top = int.MinValue;
        }

        public bool Push(int x)
        {
            if (length == MAX)
            {
                throw new Exception("Stack Overflow");
            }

            if (a.Length == MAX && length == 0)
            {
                a[0] = x;
                length++;
                top = x;
                return true;
            }


            var newStack = new int[length + 1];
            for (int i = 0; i < length; i++)
            {
                newStack[i] = a[i];
            }
            a = newStack;
            a[length] = x;

            length++;
            top = x;
            return true;
        }

        public int Pop()
        {
            if (length == 0)
            {
                throw new Exception("Stack Underflow");
            }
            length--;
            top = a[length];
            var newStack = new int[length];
            for (int i = 0; i < newStack.Length; i++)
            {
                newStack[i] = a[i];
            }
            a = newStack;
            return top;
        }

        public int Peek()
        {
            return top;
        }
    }

    static void Main(string[] args)
        {
            Stack s = new Stack();
            s.Push(10);
            s.Push(20);
            s.Push(30);
            Console.WriteLine(s.Pop() + " Popped from stack");
            Console.ReadKey();
        }
    }
