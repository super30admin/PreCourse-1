import java.io.*;
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data
        Node n = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if(list.head == null) {
            list.head = n;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            // Insert the new_node at last node
            Node node = list.head;
            while(node.next != null) {
                node = node.next;
            }
            node.next = n;
        }

        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {
        Node node = list.head;
        // Traverse through the LinkedList 
        while(node != null) {
            // Print the data at current node
            System.out.println(node.data);
            // Go to next node
            node = node.next;
        }
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
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

class Node {

    int data;
    Node next;

    // Constructor
    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
