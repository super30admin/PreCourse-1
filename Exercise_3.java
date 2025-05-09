// Time Complexity : Best Case: O(1) -> inserting into empty list and worst case -> O(n) adding element at the end of the list
// Space Complexity : O(n), n is total number of elements added in list
// Did this code successfully run on Leetcode : No, couldn't find leetcode problem
// Any problem you faced while coding this : Not as such

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
        Node newNode = new Node(data);
        newNode.next = null;
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null) {
            list.head = newNode
        }
        else {
            // Else traverse till the last node 
            // and insert the new_node there 
            Node lastNode = list.head;
            while(lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
            // Insert the new_node at last node 
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
         Node currNode = list.head;
         System.out.println(" Linkedlist elements are: ");
        // Traverse through the LinkedList 

        while(currNode != null) {
             // Print the data at current node 
             System.out.print(currNode.data +" ");

             // Go to next node 
             currNode = currNode.next;
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