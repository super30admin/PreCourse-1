import java.io.*;

import javax.lang.model.element.Element; 

// Time Complexity : O(1)
// Space Complexity :  O(n), n-> no of elements in LL
// Any problem you faced while coding this : finding how to access head, checking LL empty,


// Java program to implement 
// a Singly Linked List 
class LinkedList { 
  
    
    Node head ;// head of list 

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
            data=d;
        } 
    } 

    static Node current;// to keep track of current last node

    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node n= new Node(data);
        
        // If the Linked List is empty, 
        if(list.head==null)
        {
            list.head = n;// then make the new node as head 
            current= n;
        }
        else{
            current.next = n;
            current = n; // Else traverse till the last node 
            // and insert the new_node at current, which is the last node 
        }
        
        return list;
        // Return the list by head 
        
    } 
      // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        
        Node dummy = list.head;

        // Traverse through the LinkedList 
        while(list.head!=null)
        {

            System.out.println(list.head.data);// Print the data at current node 
            list.head=list.head.next;// Go to next node

        }
        list.head= dummy;// re-assigning head, if want to print again later
             
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
        
        // Print the LinkedList 
        printList(list); 

        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}