using System;
using System.Xml;

namespace Exercise3
{
    public class LinkedlIst
    {
        public Node head;   
       public class Node
        {
           public int data;
            public Node next;
            public Node(int d)
            {
                data = d;
                next = null;
            }
        }

        public static LinkedlIst Insert(LinkedlIst lst,int data)
        {
            Node _node = new Node(data);
            _node.next = lst.head;
            lst.head = _node;
            return lst;
        }

        public static void Print(LinkedlIst lst)
        {
            Node prev = null;
            Node curr = lst.head;
            Node temp = null;
            while(curr!=null)
            {
                Console.WriteLine(curr.data);
                temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
        }
        static void Main(string[] args)
        {
            LinkedlIst lst = new LinkedlIst();
            lst = Insert(lst, 1);
            lst = Insert(lst, 2);
            lst = Insert(lst, 3);
            lst = Insert(lst, 4);
            lst = Insert(lst, 5);

            Print(lst);
        }
    }
}
