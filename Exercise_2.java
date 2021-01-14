import java.io.*;
public class StackAsLinkedList {
    StackNode root;
    static class StackNode {
        int data;
        StackNode next;
        StackNode(int data)
        {
            //Constructor here
            this.data = data;
            this.next = null;
        }
    }
    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        if(root == null) {
            System.out.println("Node is empty");
            return true;
        } else {
            System.out.println("Node is not empty");
            return false;
        }
    }
    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);
        if (! isEmpty()) {
            StackNode nextNode = root;
            while (nextNode.next != null) {
                nextNode = nextNode.next;
            }
            nextNode.next = node;
        } else {
            System.out.println("Stack is empty, adding at the beginning");
            root = node;
        }
    }
    public int pop()
    {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            StackNode nextNode = root;
            while (nextNode.next != null) {
                nextNode = nextNode.next;
            }
            int value = nextNode.data;
            nextNode = null;
            return value;
        }
    }
    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            StackNode nextNode = root;
            while (nextNode.next != null) {
                nextNode = nextNode.next;
            }
            return nextNode.data;
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