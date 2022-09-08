import java.io.*;
// Time Complexity :
//Insertion is O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : No but did run on IntelliJ
// Any problem you faced while coding this : Only that it didn't run on leetcode

// Java program to implement
// a Singly Linked List

class LinkedList {

    static Node head; // head of list
    static int size;

    LinkedList(){
        head = new Node(0);
        size = 0;
    }

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        int val;
        Node next;

        // Constructor
        Node(int d)
        {
            //Write your code here
            val = d;
        }
    }

    // Method to insert a new node
    public static Node insert(int data)
    {
        Node currnode = new Node(data);
        if(head.next == null){
            head.next = currnode;
            currnode.next = null;
            size++;
        }
        else{
            Node temp = head;
            for(int i = 0; i <= size; i++){
                if(temp.next == null){
                    temp.next = currnode;
                    currnode.next = null;
                }
                else{
                    temp = temp.next;
                }
            }
            size++;

        }
        return head.next;

        // Create a new node with given data

        // If the Linked List is empty,
        // then make the new node as head

        // Else traverse till the last node
        // and insert the new_node there

        // Insert the new_node at last node
        // Return the list by head

    }

    // Method to print the LinkedList.
    public static void printList()
    {
        // Traverse through the LinkedList

        // Print the data at current node

        // Go to next node
        Node temp = head;
        for(int i = 0; i < size; i++){
            System.out.print(temp.next.val + " ");
            temp = temp.next;
        }

    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        // Print the LinkedList
        list.printList();
    }
}