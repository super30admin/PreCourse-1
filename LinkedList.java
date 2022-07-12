// Java program to implement
// a Singly Linked List 
public class LinkedList {
    static Node head; // head of list
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
    public static LinkedList insert(LinkedList list, int data) {

        Node newNode = new Node(data);
        newNode.next = null;

        if (list.head == null) {
            head = newNode;
        } else {
            // Else traverse till the last node
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        return list;
    }

    // Method to print the LinkedList. 
    public static void printList(LinkedList list) {
        if (list == null) {
            return;
        }

        Node currentNode = list.head;

        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
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