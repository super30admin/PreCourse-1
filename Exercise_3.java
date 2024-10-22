import java.io.*; 
  
// Java program to implement 
// a Singly Linked List

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
            //Write your code here
            this.data = d;
            this.next = null;
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
        Node newNode = new Node(data);
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node curr = list.head;
            while (curr.next != null) {
                curr = curr.next;

            }
            curr.next = newNode;
        }
        return list;

    }

    // Method to print the LinkedList. 
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList 

        // Print the data at current node

        // Go to next node
        Node curr = list.head;
        System.out.print("LinkedaList:");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
class Exercise_3 {
    // Driver code 
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        // 
        // ******INSERTION****** 
        // 

        // Insert the values 
        list = LinkedList.insert(list, 1);
        list = LinkedList.insert(list, 2);
        list = LinkedList.insert(list, 3);
        list = LinkedList.insert(list, 4);
        list = LinkedList.insert(list, 5);

        // Print the LinkedList 
        LinkedList.printList(list);
        //Completed Precourse 1
    }
}