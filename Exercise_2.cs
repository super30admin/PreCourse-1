using System;


/*
OUTPUT: 30 popped from stack
        Top element is 20

Method      Time complexity     
isEmpty         O(1)      
push            O(1)               
pop             O(1)                
peek            O(1)

Space complexity: O(n)
*/

namespace Precourse1
{

    public class StackAsLinkedList
    {

        StackNode root;

        public class StackNode
        {
            public int data;
            public StackNode next;

            public StackNode(int data)
            {
                //Constructor here
                this.data = data;

            }
        }


        public bool isEmpty()
        {
            //Write your code here for the condition if stack is empty.
            return root==null;
        }

        public void push(int data)
        {
            //Write code to push data to the stack.
            StackNode node = new StackNode(data);
            node.next = root;
            root = node;

        }

        public int pop()
        {
            //If Stack Empty Return 0 and print "Stack Underflow"
            //Write code to pop the topmost element of stack.
            //Also return the popped element
            if(isEmpty())
            {
                Console.WriteLine("Stack Underflow");
                return 0;
            }
            else
            {
                int value = root.data;
                root = root.next;
                return value;
            }
        }

        public int peek()
        {
            //Write code to just return the topmost element without removing it.
            if(isEmpty())
            {
                Console.WriteLine("Stack is empty");
                return -1;
            }
            else
            {
                return root.data;
            }
        }

        //Driver code
        public static void Main(String[] args)
        {

            StackAsLinkedList sll = new StackAsLinkedList();

            sll.push(10);
            sll.push(20);
            sll.push(30);

            Console.WriteLine(sll.pop() + " popped from stack");
            Console.WriteLine("Top element is " + sll.peek());
        }
    }
}