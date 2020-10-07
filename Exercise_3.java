//Time Complexity : O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yet to try
//Any problem you faced while coding this : None

import java.io.*; 

//Java program to implement 
//a Singly Linked List 
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
         // Initilizing fields
         data = d;
         next = null;
     } 
 } 

 // Method to insert a new node 
 public static LinkedList insert(LinkedList list, int data) 
 { 
     // Create a new node with given data 
     
     Node newNode = new Node(data); // Creating a new node with given data 
     newNode.next = null;           // Pointing new node to null 

     
     if(list.head == null)
         list.head = newNode; // Setting new node as head if the linked list is empty
     
     else
     {
         Node tempNode = list.head;     // Using temperory node to traverse the linked list
         while(tempNode.next != null)   // Traversing the linked list till the last node
         {
             tempNode = tempNode.next;  // Going to next node
         }
         tempNode.next = newNode;       // Inserting a new node at the last position of the linked list
     }

     return list;  // Returning the linked list
     
 } 

 // Method to print the LinkedList. 
 public static void printList(LinkedList list) 
 { 
     Node tmpNode = list.head;      // Using temperory node to traverse the linked list
     while(tmpNode != null)         // Traversing the linked list till the last node
     {
         System.out.println(tmpNode.data);  // Printing the data at each node
         tmpNode = tmpNode.next;            // Going to next node
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