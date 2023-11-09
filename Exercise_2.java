

import java.util.Stack;
// Time Complexity : O(1)
// Space Complexity : O(1)

class StackAsLinkedList {
    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
            this.next = next;
        }
    }


    public boolean isEmpty()
    {
        return false;

    }


    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);
        if(isEmpty()){
            root = node;
        }else {
            StackNode temp = root;
            root = node;
            temp.next = root;
        }
        System.out.println(data + "Inserted");
    }

    public int pop()
    {   if(isEmpty()){
        System.out.println("Stack UnderFlow");
        return 0;
    }else
    {
        int x = root.data;
        root = root.next;
        return x;
    }
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
    }

    public int peek()

    {if(!isEmpty()){
        return root.data;

        //Write code to just return the topmost element without removing it.
    }
    else {
        return -1;
    }

        //Write your code here
    }



    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is " + s.peek());
    }
}
