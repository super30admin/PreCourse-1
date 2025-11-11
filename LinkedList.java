// Time Complexity :O(1) for insert and O(n) for iterate
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
    int size;

    LinkedList()
    {
        this.head = null;
        this.size = 0;
    }
  
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
   
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 

        if(list.size == 0)
        {
            list.head = newNode;
            list.size++;
            return list;
        }
        Node curr = list.head;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = newNode;
        list.size++;
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node
        if(list.size == 0)
        {
            System.out.println("List is empty");
            return;
        } 
        Node curr = list.head;
        while(curr != null)
        {
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
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}