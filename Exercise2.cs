using System;
using System.Security.Cryptography;

namespace Exercise2
{
    class StackLL
    {
        Node top;
        public StackLL()
        {
            this.top = null;
        }
        public void push(int x)
        {
            Node temp = new Node();
            if (temp!=null)
            {
                temp.data = x;
                temp.linknode = top;
                top = temp;
            }
        }
        public bool isempty()
        {
            if(top==null)
            { return true; }
            else return false;
        }

        public int peek()
        {
            if (!isempty())
            {
                return top.data;
            }
            else
                return -1;
        }

        public int pop()
        {
            if(top==null)
            {
                return 0;
            }
            else
            {
                int i = top.data;
                top =top.linknode;
                return i;
                
            }
        }
        static void Main(string[] args)
        {
            StackLL sl = new StackLL();
            sl.push(10);
            sl.push(20);
            sl.push(30);
            Console.WriteLine("following element popped from stack {0}", sl.pop());
            Console.WriteLine("top element is {0}", sl.peek());
        }
    }
    class Node
    {
        public int data;
        public Node linknode;
    }
}
