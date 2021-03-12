/* Time Complexity : The overall time complexity is O(n). 
The insert operation takes O(n) time as every time insert() is called, the new item is added to the tail of the linked list after the entire list is 
being traversed. Similarly, the print() also takes O(n) time beacause each node in the list is visted inorder to be printed. Thus, O(n)+O(n) = 2O(n) ~ O(n).
Space Complexity : As there is no extra space (any other data structure), the space complexity is O(1).
 */
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : I felt difficult in understanding how to use the head pointer in the insert function.


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
        Node(int d) 
        { 
            //Write your code here 
            this.data  = d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data);

        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null){
            list.head = new_node;
            return list;
        }
        
            // Else traverse till the last node 
            // and insert the new_node there 
        else{
            Node cur = list.head;
            while(cur.next!=null){
                cur = cur.next;
            }
            cur.next = new_node;
        }
        // Insert the new_node at last node 
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node ptr = head;
        // Traverse through the LinkedList 
        // Print the data at current node
        // Go to next node 
        while(ptr!=null){
            System.out.println(ptr.data);
            ptr = ptr.next;
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