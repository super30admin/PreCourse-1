/* Exercise_3 : Implement Singly Linked List.
*/

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// In Java, LinkedList can be represented as a class and a Node 
// as a separate class. The LinkedList class contains a reference of Node class type.
// insertion in the list is done at the end, that is the new node 
// is added after the last node of the given Linked List
// Since a Linked List is typically represented by the head pointer of it, 
// it is required to traverse the list till the last node and then change the next of last node to new node.

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
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);

        // If the Linked List is empty, 
        // then make the new node as head
        if(list.head == null){
            list.head = newNode;
        } 
        
            // Else traverse till the last node 
            // and insert the new_node there 
            Node lastNode = list.head;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }

            // Insert the new_node at last node 
            lastNode.next = newNode;
        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {   
        Node currentNode = list.head;
        // Traverse through the LinkedList 
        while(currentNode != null){
            // Print the data at current node 
            System.out.println(currentNode.data + " ");
            // Go to next node 
            currentNode = currentNode.next;
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