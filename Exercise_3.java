// Time Complexity : For each operation, O(n)
// Space Complexity : Constant space complexity O(1) although space is wasted because of the fixed size of array
/* Did this code successfully run on Leetcode : Ran on sample test cases using boilerplate code

*/
// Any problem you faced while coding this : None


import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
    public LinkedList() {
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
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        Node newNode = new Node(data);
        if(list.head==null) {
        
            list.head = newNode;
            list.head.next = null;
        }
        else {
            Node temp = new Node(0);
            temp = list.head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newNode;
            temp = temp.next;
            temp.next =null;
        }
        return list;

        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
           
        // Print the data at current node 
   
        // Go to next node 
        Node temp = list.head;
        while(temp!=null) {
            System.out.println(temp.data);
            temp =temp.next;
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