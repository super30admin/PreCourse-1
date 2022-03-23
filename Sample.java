//// Time Complexity for Stack Exercise1: O(1)
//// Space Complexity Stack Exercise1: O(1)
//// Did this code successfully run on Leetcode : I ran from Intellij and it worked
//// Any problem you faced while coding this : I need to understand the stack first as I forgot that, and then it was not easy;
//
//
//// Your code here along with comments explaining your approach
//
////class Stack {
////    //Please read sample.java file before starting.
////    //Kindly include Time and Space complexity at top of each file
////    static final int MAX = 1000;
////    int top;
////    int a[] = new int[MAX]; // Maximum size of Stack
//////    boolean isEmpty()
////    {
////        return top == -1; // checking and returning true if stack is empty
////    }
////
////    Stack()
////    {
////        this.top = -1; //initiatizing the variable
////    }
////
////    boolean push(int x)
////    {
////        //Check for stack Overflow
////        //Write your code here
////
////        if(top == MAX - 1){   // Checking of the stack is full and returining false
////
////            return false;
////        }else
////            a[++top] = x;    // else adding the data to the stack and returning true
////        return true;
////    }
////
////    int pop()
////    {
////        //If empty return 0 and print " Stack Underflow"
////        //Write your code here
////        if (isEmpty()) {
////            System.out.println("Stack Underflow");    Checking of the stack is empty and printing
////
////        }
////
////        return a[top--];                              returning the top most data item from the stack and removes it
////    }
////
////    int peek()
////    {
////        //Write your code here
////        if (isEmpty()) {
////            System.out.println("Stack is empty");    checks if empty and print.
////        }
////        return a[top];             returns the element at the top of the Stack
////    }
////}
////
//// Time Complexity for Stack Exercise2: O(1)
//// Space Complexity Stack Exercise2: O(1)
//// Did this code successfully run on Leetcode : I ran from Intellij and it worked
//// Any problem you faced while coding this : I had to understand the linked list as data structure and then was able to do it
//
//
//// Your code here along with comments explaining your approach
////
////class StackAsLinkedList {
////
////    StackNode root;
////
////    static class StackNode {  //  class for linkedlist which holds a note data and reference ot next node.
////        int data;
////        StackNode next;
////
////        StackNode(int data)
////        {
////            //Constructor here           // initialized the data here in the inner class constructor
////            this.data = data;
////        }
////    }
////
////
////    public boolean isEmpty()  //In this method we are checking if the list is emplty by te checking the root node
//                                   // is null
////    {
////        //Write your code here for the condition if stack is empty.
////        if(root==null){
////            return true;
////        }
////        else
////            return false;
////    }
////
////    public void push(int data)
////    {
////        // code to push data to the stack.
////        StackNode newStackNode= new StackNode(data);
////        if(root==null) {                           //creating a new node instance with initalizing the data,
////                                                          checking if the stack is empty
////                                                      then assigning to the root else assigning  root to the next
//                                                           // instance and root to the newstacknode
////            root=newStackNode;                    //
////        }
////        newStackNode.next=root;
////        root=newStackNode;
////    }
////
////    public int pop()
////    {
////        //If Stack Empty Return 0 and print "Stack Underflow"
////        //Write code to pop the topmost element of stack.
////        //Also return the popped element
////        if(root==null){
////            System.out.println("Stack Underflow");        // checking if empty- if not assigning the variable to
////                                                          popped variable and de refrencing the root to the next variable
////            return 0;
////        }else {
////            int popped=root.data;
////            root= root.next;
////            return popped;
////        }
////    }
////
////    public int peek()
////    {
////        //Write code to just return the topmost element without removing it.
////        if(root==null) {
////
////            return 0;
////        }
////        return root.data;           // returning the data from the topmost node
////    }
//
//
//
//
//
//// Time Complexity for Stack Exercise3: O(n)
//// Space Complexity Stack Exercise3: O(n)
//// Did this code successfully run on Leetcode :I ran from Intellij and it worked
//// Any problem you faced while coding this : I had to understand the linked list as data structure and then was able to do it.
//// Faced issue in transversing over the linked list.
//
//
//// Your code here along with comments explaining your approach
//
//class LinkedList {
//
//    Node head; // head of list
//
//    // Linked list Node.
//    // This inner class is made static
//    // so that main() can access it
//    static class Node {                       //Creating a node class to create nodes as we do in linkedlist
//
//        int data;
//        Node next;
//
//        // Constructor
//        Node(int d)
//        {
//            //Write your code here
//            data = d;                        // inner class constructor to initialize data and node
//            next = null;
//        }
//    }
//
//    // This is a linkedList method to passing the LinkedList class object and data
//    public static LinkedList insert(LinkedList list, int data)
//    {
//        // Create a new node with given data
//        Node node = new Node(data);
//
//        node.next = null;
//
//        // If the Linked List is empty,
//        // then make the new node as head
//        if(list.head == null){
//            list.head = node ; // if the head is null then mde the assigned the new node to head
//        }
//        else {
//            // Else traverse till the last node
//            // and insert the new_node there
//            Node n = list.head;          // Transversing the list by checking the next node not equal to null.
//            while (n.next != null){
//                n = n.next;              // n is the temp object for referencing the current node
//            }
//            n.next = node;               // once out of the loop assigning the next node to the new node.
//        }
//
//        // Inserted the new_node at last node
//        // Returned the list
//        return list;
//
//    }
//
//    // Method to print the LinkedList.
//    public static void printList(LinkedList list)
//    {
//        Node node = list.head;
//        // Traverse through the LinkedList
//        while(node.next != null){
//            // Print the data at current node
//            System.out.println(node.data);
//            // Go to next node
//            node = node.next;
//        }
//        System.out.println(node.data);
//    }
//
