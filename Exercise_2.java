package com.mybank.context;

public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }


    public boolean isEmpty()
    {
        return root == null; // if root is null, then the stack is empty
    }

    public void push(int data)
    {
        StackNode newNode = new StackNode(data);
        if (root == null) {
            root = newNode;
        } else {
            newNode.next = root;
            root = newNode;
        }
        System.out.println(data + "push onto the stack");
    }

    public int pop()
    {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int pop = root.data;
            root = root.next;
            return pop;
        }
    }

    public int peek()
    {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return root.data;
        }
    }

    //Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
