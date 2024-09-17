using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Exercise1
    {
        static int max = 1000;
        int top;
        int[] a = new int[max];

        public bool isempty()
        {
            
            if(a.Length<=0)
            {
                return true;
            }
            else
            {
                return false;
            }
                
        }
        public Exercise1()
        {
            top = -1;
        }
        public bool push(int x)
        {
            if(top<max)
            {
                a[++top] = x;
                return true;
            }
            else
            {
                Console.WriteLine("stack reached full capacity");
                return false;

            }
        }
        public int pop()
        {
            if(top>=0)
            {
                return a[top--];
            }
            else
            {
                return 0;
            }
        }
        public int peek()
        {
            if(top>=0)
            {
                return a[top];
            }
            else
            {
                Console.WriteLine("no elements in stack");
                return 0;
            }
                
        }
        static void Main(string[] args)
        {
            Exercise1 s = new Exercise1();
            s.push(10);
            s.push(20);
            s.push(30);
            Console.WriteLine("element popped from stack is {0}", s.pop());
        }
    }
}
