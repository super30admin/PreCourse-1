// Time Complexity : For Ex1 and for Ex2 is O(1) and for Ex3 - O(n)
// Space Complexity : same
// Did this code successfully run on Leetcode : ran onn local on intellij
// Any problem you faced while coding this : I had to go through the algorithms first.


// Your code here along with comments explaining your approach - I have mentioned all the steps in the comments
// hence copying and pasting the same here.

//==============

//class Stack {
//    // The stack follow LIFO principal
//    //Please read sample.java file before starting.
//    //Kindly include Time and Space complexity at top of each file >> O(1) for both
//    static final int MAX = 1000;
//    int top;
//    int a[] = new int[MAX]; // Maximum size of Stack
//
//    boolean isEmpty()
//    {
//        return top == -1; // This method checks if the stack is empty and return true. The top variable at -1 tell the same
//    }
//
//    Stack()
//    {
//        this.top = -1; // initializing the top to -1 (means empty stack) variable whe creating the class object
//    }
//
//    boolean push(int x)
//    {
//// This is the push method which checks the stack is not at MAX capacity and then if not inserts the data at the top of the stack
//// and return true
//
//        if(top == MAX - 1){
//
//            return false;
//        }else
//            a[++top] = x;
//        return true;
//    }
//
//    int pop()
//    {
//        //This is the pop method which check if the stack is empty and if not returns the topmost item and removes it.
//        //Write your code here
//        if (isEmpty()) {
//            System.out.println("Stack Underflow");
//
//        }
//
//        return a[top--];
//    }
//
//    int peek()
//    {
//        //This is the peek method and this returns the last element from the stack.
//        if (isEmpty()) {
//            System.out.println("Stack is empty");
//        }
//        return a[top];
//    }
//}
//
//// Driver code
//class Main {
//    public static void main(String args[])
//    {
//        Stack s = new Stack();
//        s.push(10);
//        s.push(20);
//        s.push(30);
//        System.out.println(s.pop() + " Popped from stack");
//    }
//}
//=====================================
//
//
//class StackAsLinkedList {
//// imlementing stack using linkedlist.
//
//    StackNode root; // The top refrencing variable
//
//    static class StackNode {  // the class we created to implement the linked-list it has data and node referencing the next node.
//        int data;
//        StackNode next;
//
//        StackNode(int data)
//        {
//            //Constructor here
//            this.data = data;   //initializing the data here which is passed form the main method
//        }
//    }
//
//
//    public boolean isEmpty()
//    {
//        //This method checks if the list is empty or not
//        if(root==null){
//            return true;
//        }
//        else
//            return false;
//    }
//
//    public void push(int data)
//    {
//        //This method check create the new reference and passes the data for the node. Then it checks if the list is not empty
//        //By checking root is null and passes the current root to the new node and references the root to new node
//        StackNode newStackNode= new StackNode(data);
//        if(root==null) {
//            root=newStackNode;
//        }
//        newStackNode.next=root;
//        root=newStackNode;
//    }
//
//    public int pop()
//    {
//        //If Stack Empty Return 0 and print "Stack Underflow"
//        //Takes the Integer variable as pooped and passes the top most data. make the last reference and return the pooped data.
//        //Also return the popped element
//        if(root==null){
//            System.out.println("Stack Underflow");
//            return 0;
//        }else {
//            int popped=root.data;
//            root= root.next;
//            return popped;
//        }
//    }
//
//    public int peek()
//    {
//        //Just returns the top most data.
//        if(root==null) {
//
//            return 0;
//        }
//        return root.data;
//    }
//
//    //Driver code
//    public static void main(String[] args)
//    {
//
//        StackAsLinkedList sll = new StackAsLinkedList();
//
//        sll.push(10);
//        sll.push(20);
//        sll.push(30);
//
//        System.out.println(sll.pop() + " popped from stack");
//
//        System.out.println("Top element is " + sll.peek());
//    }
//}
//================================

//import java.io.*;
//
//
//class LinkedList {
//
//    Node head; // Starting node
//
//    // class the has the node data and reference of the next node
//    static class Node {
//
//        int data;
//        Node next;
//
//        // Initialising the data and reference.
//        Node(int d)
//        {
//            //Write your code here
//            data = d;
//            next = null;
//        }
//    }
//
//
//    public static LinkedList insert(LinkedList list, int data)
//    {
//        // Create a new node and initialize with the data passed
//        Node node = new Node(data);
//
//        node.next = null;
//
//        // checking of the list is empty
//        // then make the new node as head
//        if(list.head == null){
//            list.head = node ;
//        }
//        else {
//            // Else traverse till the last node by using while next == null
//            // and insert the new_node there
//            Node n = list.head;
//            while (n.next != null){
//                n = n.next;
//            }
//            n.next = node;
//        }
//
//        // Insert the new_node at last node and returns the list.
//
//        return list;
//
//    }
//
//    // Method to print the LinkedList.
//    public static void printList(LinkedList list)
//    {
//        Node node = list.head;
//        // Traverse through the LinkedList like before
//        while(node.next != null){
//            // Prining the current node data
//            System.out.println(node.data);
//            // jumping to next node
//            node = node.next;
//        }
//        System.out.println(node.data);
//
//
//
//
//    }
//
//    // Driver code
//    public static void main(String[] args)
//    {
//        /* Start with the empty list. */
//        LinkedList list = new LinkedList();
//
//        //
//        // ******INSERTION******
//        //
//
//        // Insert the values
//        list = insert(list, 1);
//        list = insert(list, 2);
//        list = insert(list, 3);
//        list = insert(list, 4);
//        list = insert(list, 5);
//
//        // Print the LinkedList
//        printList(list);
//    }
//}