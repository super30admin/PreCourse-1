import java.io.*;
import java.net.http.HttpHeaders; 
  
// Java program to implement 
// a Singly Linked List 
//Time Complexity: O(n) 
//Space Complexity: O(n) 
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
            this.data   = d; 
            this.next   = null; 
        } 
    } 
  
    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) 
    { 
        // Create a new node with given data 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 

        Node new_node = new Node(data); 
        
        if(list.head == null) {
            list.head   = new_node;
            return list; 
        }

        Node current = list.head; 
        while(current.next!= null) { 
            current = current.next; 
        }

        current.next = new_node; 
        return  list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
        if(list.head == null) { 
            System.out.println("List is empty"); 
        }
        else
        {
        Node current = list.head; 
        while(current.next!= null && current!=null) { 
            System.out.print(" -> " + current.data); 
            current = current.next; 
        }}
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