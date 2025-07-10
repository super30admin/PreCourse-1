import java.io.*;

// Time Complexity :
// insert: o(n)
// printList: o(n)
// Space Complexity :
// insert: o(1)
// printList: o(1)
// Did this code successfully run on Leetcode : Cant find it on leetcode
// Any problem you faced while coding this : None
class LinkedList {

    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            //Write your code here
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node node = new Node(data);

        // If the Linked List is empty,
        if(list.head == null) {
            // then make the new node as head
            list.head = node;
            return list;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            return list;
        }
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList
        Node temp = list.head;
        if(temp==null) return;
            // Print the data at current node
        while(temp!=null) {
            System.out.println(temp.data);
            // Go to next node
            temp=temp.next;
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
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        // Print the LinkedList
        printList(list);
    }
}
