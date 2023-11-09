package Precourse1;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Tested successfully on local code editor.
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//I have initialized head as a Node with data 0 and a temp node which points to head.
// temp node points to current node at any point of time.
//to insert a node in the list, I have created a node first, then pointed temp to the new node.
//temp then refer to the new node using temp.next
//to print the list, i have assigned head.next to printNode and while printNode != null, printed the node data.


// Java program to implement
// a Singly Linked List
public class Exercise_3 {

    public static Node head = new Node(0); // head of list
    public static Node temp = head;

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            this.data = d;
            next = null;
            //Write your code here
        }
    }

    // Method to insert a new node
    public static Exercise_3 insert(Exercise_3 list, int data)
    {
        // Create a new node with given data
        Node n = new Node(data);
        // If the Linked List is empty,
        // then make the new node as head
        temp.next = n;
        temp = temp.next;
        return list;
        // Else traverse till the last node
        // and insert the new_node there

        // Insert the new_node at last node
        // Return the list by head

    }

    // Method to print the Precourse1.LinkedList.
    public static void printList(Exercise_3 list)
    {
        // Traverse through the Precourse1.LinkedList
        Node printNode  = head.next;
        while(printNode != null) {
            System.out.println(printNode.data);
            printNode = printNode.next;
        }
        // Print the data at current node

        // Go to next node
    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        Exercise_3 list = new Exercise_3();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        // Print the Precourse1.LinkedList
        printList(list);
    }
}