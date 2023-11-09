import java.io.*;
import java.net.http.HttpHeaders; 

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : N/A - worked with different test cases, but only after proceeding failed build - what could be the problem here?
// Any problem you faced while coding this : line 55 - question: return type is LinkedList, how would we return by head?
    // also: should it print with elements of linkedlist beside each other ?
    // had to rename file from Exercise_3.java to LinkedList.java for program to run...
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head = null; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null)
            list.head = new_node;
        
            // Else traverse till the last node 
            // and insert the new_node there 
        else
            {
                Node ptr = list.head;
                while (ptr.next != null)
                {
                    ptr = ptr.next;
                }
                ptr.next = new_node; // Insert the new_node at last node 
            }

        // Return the list by head 
        return list; 
        
    }
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node tmp = list.head;
        while (tmp != null)
        {
            // Print the data at current node
            System.out.print(tmp.data);

            // Go to next node 
            tmp = tmp.next;
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
        list = insert(list, 4); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}