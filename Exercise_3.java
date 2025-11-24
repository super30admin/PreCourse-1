// Time Complexity : O(1)- append, others - O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :yes


// Your code here along with comments explaining your approach
// The code creates a singly linked list where each node stores a value and a pointer to the next node.
// Insertion takes O(n) because it traverses to the last node before appending, and printing also takes O(n) as it visits all nodes.
// Space complexity is O(n) since each inserted element allocates a new node in memory.
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
            //Write your code here
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data);
        new_node.next = null;
  
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) {
            list.head = new_node;
        } 
        else {
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
  
            // Insert the new_node at last node 
            last.next = new_node;
        }
  
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node currNode = list.head;
  
        System.out.print("LinkedList: ");
  
        // Print the data at current node 
        // then move to next node
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
  
        System.out.println();
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // ******INSERTION****** 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}
