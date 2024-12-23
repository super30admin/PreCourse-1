
//Time complexity : O(n) for insert
//space complexity : O(1) 

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
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node node = new Node(data);
        if (list.head == null) {
            list.head = node;
        } else {
            Node curr = list.head;
            while (curr != null && curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node curr = list.head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.print("null");
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
