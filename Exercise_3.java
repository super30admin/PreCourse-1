/* Time complexity for Insertion: O(1) and space complexity is O(n) */

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
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node newNode = new Node(data);
        newNode.next = null;
  
       
        if (list.head == null) 
            list.head = newNode;
        
        else {
          
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
  
         
            last.next = newNode;
        }
         
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node currentNode = list.head;
  
        System.out.println("LinkedList: ");
  
        while (currentNode != null) {
            
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println("\n"); 
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