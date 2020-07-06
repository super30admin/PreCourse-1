// Java program to implement
// a Singly Linked List
/* Removed public to remove compilation error, of class and file name mismatch*/
class LinkedList {

    Node head; // head of list 

    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
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
        Node temp = list.head;

        // Create a new node with given data 

        // If the Linked List is empty, 
        // then make the new node as head
        if (temp == null) {
            list.head = new Node(data);
            return list;
        }

        // Else traverse till the last node
        // and insert the new_node there
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        // Insert the new_node at last node
        // Return the list by head 
        return list;
    }

    // Method to print the LinkedList. 
    public static void printList(LinkedList list) {
        Node temp = list.head;

        if (temp == null) {
            System.out.println("[ ]");
            return;
        }
        // Traverse through the LinkedList
        // Print the data at current node
        // Go to next node
        System.out.print("[");
        while (temp.next != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.print("]");
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