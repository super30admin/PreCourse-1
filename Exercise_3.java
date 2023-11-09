//Java program to implement 
//a Singly Linked List 
public class LinkedList {

    Node head; 

    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data

        // If the Linked List is empty,
        // then make the new node as head

        // Else traverse till the last node
        // and insert the new_node there

        // Insert the new_node at last node
        // Return the list by head
        Node node = new Node(data);
        if(list.head == null) {
            list.head = node;
        } else {
            Node prev = list.head;
            while(prev.next != null) {
                prev = prev.next;
            }
            prev.next = node;
            
        }
        return list;
        

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList

        // Print the data at current node

        // Go to next node
        if(null == list || null == list.head) {
            System.out.println("List is empty");
            return;
        }
        Node curr = list.head;
        System.out.println("List elements:");
        while(curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
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