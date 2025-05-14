// Time Complexity: insert - O(n), printList - O(n)
// Space Complexity: O(n) for storing n nodes

public class LinkedList {

    Node head; // head of list

    // Linked list Node.
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        Node newNode = new Node(data);

        // If the Linked List is empty, make the new node as head
        if (list.head == null) {
            list.head = newNode;
        } else {
            // Else traverse till the last node and insert the new_node there
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        return list;
    }

    // Method to print the LinkedList
    public static void printList(LinkedList list) {
        Node currNode = list.head;

        // Traverse through the LinkedList
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }

        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        // Print the LinkedList
        printList(list);
    }
}
