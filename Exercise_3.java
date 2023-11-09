// Time Complexity : O(n) as there is a while loop used while insertion and printing of list
// Space Complexity : O(n) as there can be n elements in a linked list and no fixed number of elements is given
// Did this code successfully run on Leetcode : Don't know where to check this on leetcode instead I ran this locally
// Any problem you faced while coding this : Had to check how to write linked list logic mainly when we need to keep the head of the list intact
// Approach: To build a singly link list keeping the head intact we make use of temp variable which is a copy of head and then use this temp to traverse the list


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
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head==null){
            list.head = new Node(data);
        }else{
            Node temp = list.head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = new Node(data); 
            
        }
        return list;
        
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList
            Node temp = list.head; 
            while(temp.next!=null){
                System.out.println(temp.data);
               temp = temp.next;
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
        // System.out.println(list.head.data); 
        // Print the LinkedList 
        printList(list);
        // System.out.println(list.head.data); 
    } 
}