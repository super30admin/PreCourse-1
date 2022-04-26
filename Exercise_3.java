/**
 * printList(list) - O(N) where N is the number of the elements in the linked list
 *
 * insert(list, data) - O(N) where N is the number of elements in the linked list
 *
 */

import java.io.*;
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
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
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node newNode = new Node(data);

        if(list.head == null ) {
            list.head = newNode;
        } else {

            Node runner = list.head;

            while(runner.next != null)
                runner = runner.next;

            runner.next = newNode;
        }

        return list.head;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node runner = list.head;
        while (runner != null ) {
            Sytsem.out.println(runner.val" --> ")
            runner = runner.next;
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
