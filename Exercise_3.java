// Java program to implement
// a Singly Linked List 
class LinkedList_Custom {
    // Time Complexity : O(N)
    // Space Complexity : N*SizeOf(Node) + temp variables
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : While determining complexity; ERROR while compiling on Leetcode /* LinkedList is already defined in this compilation unit [in LinkedList.java]
    //import java.util.LinkedList;*/ - renamed LinkedList

    Node head; // head of list 

    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node {

        int data;
        Node next;

        // Constructor 
        Node(int d) {
            //Write your code here
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node 
    public static LinkedList_Custom insert(LinkedList_Custom list, int data) {

        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;
        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            System.out.println("New Node with value " + data + " created at First");
            list = new LinkedList_Custom();
            list.head = new_node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            System.out.println("Inserting Node with " + data + " to end of list");
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            // Insert the new_node at last node
            temp.next = new_node;
        }
        printList(list);
        // Return the list by head
        return list;
    }

    // Method to print the LinkedList. 
    public static void printList(LinkedList_Custom list) {
        System.out.print(" Printing  list : ");
        if (list.head != null) {
            Node temp = list.head;
            // Traverse through the LinkedList
            while (temp != null) {
                // Print the data at current node
                System.out.print(temp.data + "->");
                // Go to next node
                temp = temp.next;
            }
            System.out.println("END");
        }
    }

    // Driver code 
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList_Custom list = new LinkedList_Custom();

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