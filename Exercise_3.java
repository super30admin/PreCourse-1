//brute force
// Time Complexity :insert->O(n),print->O(n) as we have to traverse.
//
// Space Complexity :O(n),where n is no of elements present if we consider linked list.if we don't consider the same, space complexity will be constant
// Did this code successfully run on Leetcode :couldn't find it on leetcode
// Any problem you faced while coding this :tried to make pop operation O(1)
// Java program to implement 
// a Singly Linked List 
public class LinkedList {
    // made node head static so that static class can access it
    public static Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            // Write your code here
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        Node newNode = new Node(data);
        // Create a new node with given data
        if (head == null) {
            head = newNode;
            return list;
        }
        // If the Linked List is empty,
        // then make the new node as head
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        // Else traverse till the last node
        // and insert the new_node there
        // Insert the new_node at last node
        return list;
        // Return the list by head

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        Node temp = head;
        // Traverse through the LinkedList
        while (temp != null) {
            System.out.println("data at current node is" + temp.data);
            temp = temp.next;
        }

        // Print the data at current node

        // Go to next node
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
// ----------------------------------------------
// Time Complexity :insert->O(1),print->O(n) as we have to traverse.
//
// Space Complexity :O(n),where n is no of elements present if we consider
// linked list.if we don't consider the same, space complexity will be constant

// efficient insert method
// Java program to implement
// a Singly Linked List
public class LinkedList {
    // made node head static so that static class can access it
    public static Node head; // head of list
    public static Node lastNode;// we can use pointer for last node of //linked list for better performance of
                                // insert method.
    // Linked list Node.
    // This inner class is made static
    // so that main() can access it

    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            // Write your code here
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        Node newNode = new Node(data);
        // Create a new node with given data
        if (head == null) {
            head = newNode;
            lastNode = head;
            return list;
        }
        // If the Linked List is empty,
        // then make the new node as head

        lastNode.next = newNode;
        newNode.next = null;
        // Else traverse till the last node
        // and insert the new_node there
        // Insert the new_node at last node
        lastNode = newNode;
        return list;
        // Return the list by head

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        Node temp = head;
        // Traverse through the LinkedList
        while (temp != null) {
            System.out.println("data at current node is" + temp.data);
            temp = temp.next;
        }

        // Print the data at current node

        // Go to next node
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