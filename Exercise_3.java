

// Java program to implement
// a Singly Linked List
public class Exercise_3 {
//    Insertion:
//        TC:
//            Best Case: O(1)
//            Worst Case: O(n)
//        SC: O(n)
//
//    Traversal:
//        TC:
//            Best Case: O(1)
//            Worst Case: O(n)
//        SC: O(n)

    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
           this.data = d;
        }
    }

    // Method to insert a new node
    public static Exercise_3 insert(Exercise_3 list, int data) {
        // Create a new node with given data

        // If the Linked List is empty,
        // then make the new node as head
        Node node = new Node(data);
        node.next = null;
        Node curr = list.head != null?list.head:null;

        if(curr == null) {
            list.head = node;
            return list;
        }

        // Else traverse till the last node
        // and insert the new_node there
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;

        // Insert the new_node at last node
        // Return the list by head
      return list;

    }

    // Method to print the LinkedList.
    public static void printList(Exercise_3 list) {
        // Traverse through the LinkedList

        Node curr = list.head;
        while(curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");

        // Print the data at current node

        // Go to next node
    }

    // Driver code
    public static void main(String[] args) {
        /* Start with the empty list. */
        Exercise_3 list = new Exercise_3();

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