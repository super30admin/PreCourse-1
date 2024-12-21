using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PreCourse_1
{
    class StackNode
    {
        public int Data;
        public StackNode Next;

        public StackNode(int data)
        {
            Data = data;
        }
    }
    internal class StackAsLinkedList
    {
        //Please read sample.java file before starting.
        //Kindly include Time and Space complexity at top of each file
        //Time Complexity: O(1)
        //Space Complexity: O(n) where n is total number of elements
        StackNode root;
        int top, length;

        public bool IsEmpty()
        {
            return length == 0;
        }

        public StackAsLinkedList()
        {
            top = 0;
        }

        public bool Push(int x)
        {
            top = x;
            if (root == null)
            {
                root = new StackNode(x);
                length = 1;
                return true;
            }

            var newNode = new StackNode(x);
            newNode.Next = root;
            length++;
            root = newNode;
            return true;
        }

        public int Pop()
        {
            if (root == null || length == 0)
            {
                throw new Exception("Stack Underflow");
            }
            length--;
            var number = root.Data;

            root = root.Next;
            top = root == null ? -1 : root.Data;
            return number;
        }

        public int Peek()
        {
            if (root == null)
            {
                throw new Exception("Stack underflow");
            }
            return root.Data;
        }
    }

    static void Main(string[] args)
        {
            StackAsLinkedList s = new StackAsLinkedList();
            s.Push(10);
            s.Push(20);
            s.Push(30);
            Console.WriteLine(s.Pop() + " Popped from stack");
            Console.ReadKey();
        }
    }
