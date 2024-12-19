// Time Complexity : O(n) as there is traversal to find the last node.
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes (ran it on my local IntelliJ)
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
//Exercise_1 : Implement Stack using Array
// Java program to implement 
// a Singly Linked List

class LinkedList {

    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node n = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = n;
        }
        // Else traverse till the last node
        // and insert the new_node there
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            // Insert the new_node at last node
            // Return the list by head
            last.next = n;
        }
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList
        Node c = list.head;
        while (c != null) {
            // Print the data at current node
            System.out.println(c.data + " ");
            // Go to next node
            c = c.next;
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

