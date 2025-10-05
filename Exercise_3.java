import java.io.*;
  
// Java program to implement a Singly Linked List
// Time Complexity : O(n) for insert and printList
// Space Complexity : O(n) where n is the number of elements in the linked list
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
    public static LinkedList insert(LinkedList list, int data)
    { 
        // Create a new node with given data
        Node node = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head
        if (list.head == null) {
            node.next = list.head;
            list.head = node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
        return list;

            // Insert the new_node at last node 
        // Return the list by head
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList
        Node last = list.head;
        while (last.next != null) {
            System.out.println(last.data);
            last = last.next;
        }
        System.out.println(last.data);
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 

        //Start with the empty list.
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
