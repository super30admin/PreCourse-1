// Time Complexity : To perform insertion in linked list, we have to traverse through all the nodes until we reach node referencing to null and then add, O(n)
// Space Complexity : space increases as per number of elements added, it is O(n).
// Did this code successfully run on Leetcode : NA, this was not a leetcode question.
// Any problem you faced while coding this : While performing print list i was looping values where node.next is null instead of node is null leaving 1 value.

// Your code here along with comments explaining your approach

import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
      
    static Node head; // head of list 
  
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
  
    // Method to insert a new node : create a new node which will be added at end of list,
    // if the list is empty add new node to head else use while loop to traverse starting from head till we get next value as null
    // add new node to the next value of last node.
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node entry = new Node(data);
        
        // If the Linked List is empty, 
        // then make the new node as head 
        if(head==null) {
            head = entry;
        } else {
            // Else traverse till the last node 
            // and insert the new_node there 
            Node trav = head;
            while(trav.next!=null) {
                trav = trav.next;
            }
            // Insert the new_node at last node 
            trav.next = entry;
        }

        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node n = head;
        // Traverse through the LinkedList 
        while(n!=null) {
            // Print the data at current node 
            System.out.println(n.data);
            // Go to next node 
            n = n.next;
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