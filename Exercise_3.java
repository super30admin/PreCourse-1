// Time complexity
// Insertion - O(n)
// Print - O(n)

// Space complexity
// O(n)
import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list

    class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            this.data = d; 
        } 
    } 
  
    // Method to insert a new node 
    public void insert(int data) 
    {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    } 
  
    // Method to print the LinkedList. 
    public void printList() 
    {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
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
        list.insert(1); 
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
  
        // Print the LinkedList 
        list.printList(); 
    } 
}