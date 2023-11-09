//Time Complexity : insert operation O(1), print operation (O(n))
//Space Complexity : O(n), where n = number of elements in LinkedList

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
        
        Node temp = new Node(data);

        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null){
            list.head = temp;
        }
            // Else traverse till the last node 
            // and insert the new_node there 
        else {
            Node temp1 = list.head;
            while(temp1.next != null){
                temp1 = temp1.next;
            }
            // Insert the new_node at last node 
            temp1.next = temp;
        }
        
        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        
        if(list.head != null){
                Node temp = list.head;
            while(temp != null){
                // Print the data at current node 
                System.out.print(" -> " + temp.data);
                // Go to next node
                temp = temp.next;
            }
        }
        else {
            //LinkedList is empty
            System.out.println("LinkedList is empty");
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
