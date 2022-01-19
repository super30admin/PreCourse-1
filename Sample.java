// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//Push, Pop, Peek
// Time Complexity : O(1)
// Space Complexity : O(1)

class Stack {
    // Please read sample.java file before starting.
    // Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        if (top == -1)
            return true;
        else
            return false;

    }

    Stack() {
        top = -1; // Assuming stack to be empty initially
    }

    boolean push(int x) {
        // Check for stack Overflow
        // Write your code here
        if (top > a.length - 1) { // Checking if stack is full
            System.out.println("Stack Overflow");
            return false;
        } else {
            top++;
            a[top] = x;
            return true;
        }
    }

    int pop() {
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        int x = 0;
        if (top == -1) { // Checking if stack is empty
            System.out.println("Stack Underflow");
        } else {
            x = a[top];
            top--;
        }
        return x;
    }

    int peek() {

        return a[top]; // returns top of the stack element
    }

    void display() { // Pushed a display functions to view stack elements
        for (int i : a) {
            System.out.println(i);
        }
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        s.display();
    }
}

// Push, Pop, Peek
// Time Complexity : O(1)
// Space Complexity : O(1)
public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            // Constructor here
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        // Write your code here for the condition if stack is empty.
        if (root == null)
            return true;
        else
            return false;
    }

    public void push(int data) {
        // Write code to push data to the stack.
        StackNode tempNode = new StackNode(data);
        tempNode.next = root;
        root = tempNode;
    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int data = root.data;
            root = root.next;
            return data;
        }
    }

    public int peek() {
        // Write code to just return the topmost element without removing it.
        if (isEmpty())
            return 0;
        else
            return root.data;
    }

    public void display() {
        StackNode current = root;

        while (current != null) {
            System.out.println(current.data + "");

            current = current.next;
        }
    }

    // Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
        sll.display();
    }
}

// Time Complexity,Space Complexity:O(n)

import java.io.*;

// Java program to implement
// a Singly Linked List
public class LinkedList {

    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            // Write your code here
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node tempNode = new Node(data);

        // If the Linked List is empty,
        if (list.head == null)
            // then make the new node as head
            list.head = tempNode;

        // Else traverse till the last node
        else {
            // and insert the new_node there
            Node current = list.head;
            while (current.next != null) {
                current = current.next;
                // Insert the new_node at last node
            }
            current.next = tempNode;
        }
        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList
        Node current = list.head;
        while (current != null) {
            // Print the data at current node
            System.out.println(current.data);
            // Go to next node
            current = current.next;
        }
    }

    // Driver code
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        // Print the LinkedList
        printList(list);
    }
}