// Time Complexity: O(N)
// Space Complexity: O(N)

import com.sun.net.httpserver.Headers;
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
            this.data = data;
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
        Node curr = list.head;
        if(list.head == null){
            list.head = newNode;
        }
            // Else traverse till the last node 
            // and insert the new_node there    
        else
        {
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
        
        }
            // Insert the new_node at last node 
        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node curr = list.head;
        if(list.head==null){
            System.out.println("list empty");
        }
        else{
        
        while(curr.next != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
        System.out.println(curr.data);
        }
            // Print the data at current node 
       
            // Go to next node 
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