
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Problem not on Leetcode but working on eclipse
// Any problem you faced while coding this : None. Instructions were clear and previous exercise helped
// Your code here along with comments explaining your approach

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
            this.data = d; // intialized data field to passed d value
            this.next = null; // initialized next to null
        } 
    } 
  
     LinkedList() // custom constructor
    {
        this.head = null; // intialized head pointer to null

    }

    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node temp = new Node(data); 
 
   
       

       // Else traverse till the last node 
            // and insert the new_node there 
      
             // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head==null) // when head points to nothing
            list.head = temp; // pointing list.head to new node temp
            else
            {
                Node curr = list.head; // pointing curr to head element
                while(curr.next != null) // looping till we reach the element where next points to null
                    curr = curr.next; // traversing till we reach the last element of list
                // Insert the new_node at last node 
                    curr.next = temp; // pointing the last node next pointer to newly created temp
            }
            

        // Return the list by head 
        return list;
        // Time Complexity : O(n)
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {   Node curr = list.head; // pointing curr to head element 
        // Traverse through the LinkedList 
            while(curr!=null) // looping till all elements are traversed by checking curr 
            {
            // Print the data at current node 
                System.out.println("Element is" + curr.data);
            // Go to next node 
            curr = curr.next;
            }
              // Time Complexity : O(n)
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