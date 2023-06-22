/*
Exercise_3 : Implement Singly Linked List.
// Time Complexity: O(n) for insertion and display.
// Space Complexity: O(n)
 */
class LinkedList {
    Node head; // head of list 

    // Linked list Node.
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
        Node newNode = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = newNode;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            // Insert the new_node at last node
            last.next = newNode;
        }

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList
        Node currentNode = list.head;

        // Print the data at current node
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        // Go to next node
    }


    // Driver code 
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        // Insert the values
        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);

        // Print the LinkedList 
        printList(list);
    }
}