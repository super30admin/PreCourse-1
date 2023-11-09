// Time Complexity : O(n) for insertion at the end of the list, the complexity would be O(n)
// Space Complexity : O(n) for storing all the inserted elements in the list
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : No I didn't face any issues while coding this probelm, other than figuring out what LinkedList list was. 


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
        Node(int data) 
        { 
            //Write your code here 
            this.data = data;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node Newnode = new Node(data);
   
        // If the Linked List is empty, 
        if(list.head == null){
            list.head = Newnode; 
            
        }
        // then make the new node as head 
        
            // Else traverse till the last node 
              // and insert the new_node there 
            // Insert the new_node at last node 
        else{
            Node current = list.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = Newnode;

        }
          return list;
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        if(list.head == null){
            System.out.println(list.head);
        }
        Node current = list.head; 
        String print = " ";
        // Traverse through the LinkedList 
        
        while(current != null){
            System.out.print(current.data + "=>" );
            current = current.next;

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