import java.io.*; 
import java.math.*;

//Hello, This is Pre-course 1 assignment
// Time Complexity :
/*
Insert() operation : O(1)
PrintList() operation : O(n)
*/


// Space Complexity :
/*
Insert() operation : O(1)
PrintList() operation : O(1)
*/

// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

/*
Initialised the constructor of Node class
For insert() : If head = null // Make new node as head, otherwise traverse through a  the nodes towards the end of list and insert new node
For printList() : Traverse from head node to end of the list and print data of each node
*/



// Java program to implement 
// a Singly Linked List 
 class LinkedList { 
  
    Node head; // head of list 
    
    LinkedList(){
        head = null;
    }
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
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        
        Node node = new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
        
        if(list.head == null){
            list.head = node;
        }
        else{   // Else traverse till the last node 
                // and insert the new_node there 
            Node temp = list.head;

            while(temp.next != null){
                temp = temp.next;
            }
        
            // Insert the new_node at last node 
            // Return the list by head 
            
            temp.next = node;
        }
        
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        if(list.head == null){
            return;
        }

        Node temp = list.head;
        // Traverse through the LinkedList 
        while(temp != null){
            System.out.println(temp.data);
            // Print the data at current node 
            temp = temp.next;
            // Go to next node 
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


