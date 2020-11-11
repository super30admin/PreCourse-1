import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class Exercise_3 {

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
    public static Exercise_3 insert(Exercise_3 list, int data) {
        // Create a new node with given data
        //make the next reference as null
        Node newNode = new Node(data);
        newNode.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = newNode;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node lastNode = list.head;
            while (lastNode.next != null) {//traversing till end
                //Got the last node 
                lastNode = lastNode.next;
            }

            // Insert the newNode at last node
            lastNode.next = newNode;
        }
        // Return the list by head
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(Exercise_3 list) {
        // Traverse through the LinkedList
        while (list.head != null) {
            //Print the data of all the heads in the list
            System.out.print(list.head.data + " ");
            //taking the head of the next node in the list
            list.head = list.head.next;
        }
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