// Time Complexity : o(n)
// Space Complexity : o(n)
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
        Node(int d) 
        { 
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node node1 = new Node(data);
        node1.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if( list.head ==  null){
            list.head = node1;
            return list;
        }

        Node lastNode = list.head;

        while( lastNode.next != null){
            lastNode = lastNode.next;
        }

        lastNode.next = node1;
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {
        Node print = list.head;

        while( print != null){
            System.out.println( " Elements in the list: " + print.data + " ");
            print = print.next;
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