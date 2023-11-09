// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : n 
// Any problem you faced while coding this : Changed name of class as was facing errors


// Your code here along with comments explaining your approach
import java.io.*; 
import java.util.LinkedList;
// Java program to implement 
// a Singly Linked List 
public class LinkedListl { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node {   
         
  
        // Constructor 
        Node(int d) 
        { 
           int data; 
           Node next;//Write your code here 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedListl insert(LinkedListl list, int data) 
    { 
        // Create a new node with given data 
        Node n = new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null){
            list.head = n;}
            // Else traverse till the last node 
            // and insert the new_node there 
        else{
            Node.last = list.head;
            while(list.next!=null){
                last=last.next;
            }
            last.next = n;  // Insert the new_node at last node 
        }
            
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedListl list) 
    {  
        // Traverse through the LinkedList 
          Node current = list.head;
        System.out.prinln("Linked List : ");
        // Traverse through the LinkedList
        while (current != null) {
            // Print the data at current node 
       System.out.println(current.data + " ");
            // Go to next node
            current = current.next;
        } 
            // Go to next node 
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedListl list = new LinkedListl(); 
  
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
