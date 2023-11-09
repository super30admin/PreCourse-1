/*******
 * Exercise_2 : Implement Singly Linked List.
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 * Did this code successfully run on Leetcode : N/A (Could not find question
 * number)
 * Any problem you faced while coding this : No
 *******/

public class LinkedList {

    static Node head; // head of list

    // Linked list Node.
    // This inner class is made static so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            // initilise data and next pointer
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {

        // Create a new node with given data
        Node newNode = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (head == null) {
            head = newNode;
        }
        // Else traverse till the last node and insert the new_node there
        else {
            Node curreNode = head;
            while (curreNode.next != null) {
                curreNode = curreNode.next;
            }
            // Insert the new_node at last node
            curreNode.next = newNode;
        }

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        Node curreNode = head;
        // Traverse through the LinkedList
        while (curreNode != null) {
            // Print the data at current node
            System.out.println(curreNode.data);
            // Go to next node
            curreNode = curreNode.next;
        }
    }

    // Driver code
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

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