// Time Complexity :
//  isEmpty(): O(1)
//  Push(): O(1)
//  Pop(): O(1)
//  Peek(): O(1)

// Space Complexity :
//      Push(): O(1)
//      Pop(): O(1)
//      Peek(): O(1)

// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No

// Your code here along with comments explaining your approach
//Approach
//Created two classes
// StackAsLinkedList: This the main class representing the stack.
//StackNode: This class represent node of the stack with data and next pointer.
// This code is Implement Stack using Linked List with following operations.
//isEmpty(): check if Stack is Empty, In linked list, stack is empty if root is null.
//push(): push an element into the top of the Stack by creating a new node and pointing into the current root.
//pop(): pop the top element from Stack and returns its value. If stack is empty it prints underflow message and return 0;
//peek(): return top element without removing from Stack. If the stack is empty, it returns -1.


class StackAsLinkedList { 
  
    //This root node is top of the Stack
    StackNode root;

    //This class is representing node of the stack
    static class StackNode {
        int data;
        StackNode next;

        //Constructor to initilize the node with data
        StackNode(int data)
        {
            //Constructor here
            this.data = data;
            this.next = null;
        }
    }

    //Method to check if Stack is Empty
    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        if(root == null) {
            return true;
        }
        return false;

    }

    //Method to push an element into the Stack
    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;

    }

    //Method to pop the top element from Stack
    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        int poppedData = root.data;
        root = root.next;
        //Also return the popped element
        return poppedData;
    }

    //Method to return top element without removing from Stack
    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(isEmpty()) {
            return -1;
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
