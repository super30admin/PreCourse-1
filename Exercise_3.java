// Time Complexity : Insert - O(n) printList - O(n) where n is size of list
// Space Complexity :
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : No

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
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node tmpNode = list.head;
        // If the Linked List is empty, 
        // then make the new node as head 
        if(tmpNode == null){
            list.head = new Node(data); 
        }
        // Else traverse till the last node 
        // and insert the new_node there 

        // Insert the new_node at last node 
        else{
            while(tmpNode.next!=null){
                tmpNode = tmpNode.next;
            }
            tmpNode.next = new Node(data);
        }
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node tmpNode = list.head;
        while(tmpNode != null){
            // Print the data at current node             
            System.out.println(tmpNode.data);
            // Go to next node             
            tmpNode = tmpNode.next;
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