import java.io.*;
import java.util.HexFormat; 
  
// Java program to implement 
// a Singly Linked List 

// Time Complexity :  O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes. The class name has to be changed though.
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

public class Exercise_3 { 
  
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
    public static Exercise_3 insert(Exercise_3 list, int data) 
    { 
        // Create a new node with given data 
        Node node = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
    
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 

        if(list.head == null){
            list.head = node;
        }else{
          
            Node n = list.head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;        
            
        }
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
        // Traverse through the LinkedList 
        Node n = list.head;
        while(n.next != null){
            System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.print(n.data);
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        Exercise_3 list = new Exercise_3(); 
  
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