// Time Complexity :
//      insert() - O(n), n - no. of nodes in the linked list
//      print() - O(n), n - no. of nodes in the linked list
// Space Complexity :
//      O(n), n - no. of nodes in the linked list
// Did this code successfully run on Leetcode : NA
// Any problem you faced while coding this : no


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

        // If the Linked List is empty,
        // then make the new node as head

        // Else traverse till the last node
        // and insert the new_node there

        // Insert the new_node at last node
        // Return the list by head

        Node node = new Node(data);
        node.next = null;
        if(list == null) {
            list = new LinkedList();
        }
        if(list.head == null) {
            list.head = node;
        }
        else {
            Node tmp = list.head;
            while(tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = node;
        }
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList

        // Print the data at current node

        // Go to next node
        System.out.println("Printing linked list... ");
        Node tmp = list.head;
        while(tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
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