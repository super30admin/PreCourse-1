// Time Complexity : O(n)
// Space Complexity : O(n)

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
            data = d; // assigning the value to the class variable
            next = null; // assigning null to the next pointer
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data); // creating the new node
        newNode.next = null; // assigning the new node's next pointer with null
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null){
            list.head = newNode; // assigning the new node as the head as the list is empty
        }
        
            // Else traverse till the last node 
            // and insert the new_node there 
        else {
            Node lastNode = list.head; 

            while(lastNode.next!= null){
                lastNode = lastNode.next;
            }

            lastNode.next = newNode; // assigning the last node's next pointer with the new node
        }

            // Insert the new_node at last node 
        // Return the list by head 
        
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList
        Node currentNode = list.head;   // starting to traverse the linked list from the head
        while(currentNode.next!=null){ 
            
            if(currentNode!= list.head){
                System.out.print(" ---> ");
            }
            // Print the data at current node 
            System.out.print(currentNode.data);  // printing each node's value
       
            // Go to next node 
            currentNode = currentNode.next;  // traversing to the next node in the list
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