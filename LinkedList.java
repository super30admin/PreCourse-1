// Time Complexity : 
//                    Insert: O(1)
//                    Print:  O(n)
//                    Creation:O(1)
// Space Complexity : 
//                    Insert: O(1)
//                    Print:  O(1)
//                    Creation:O(1)
// Did this code successfully run on Leetcode : Not applicable
// Any problem you faced while coding this : Using tail while inserting

// Approach : Iterate through the linked list using while loop printing each element. 
// while storing initally the head and tail pointers are null, if we have only 1 element they points towards the same node.
// If we have more than 1 element then I am changing the tail.next to store address of the newly created node and making the newly created node as tail.

// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
    Node tail; // tail of list
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            data=d;
            next=null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node n = new Node(data);
        if(list.head == null){
            list.head= n;
            list.tail= n;
        }
        else {
            list.tail.next= n;
            list.tail = n;
        }
        // If the Linked List is empty, 
        // then make the new node as head 
       
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
        Node temp = list.head;
        if(list.head == null){
            System.out.println("Empty Single Linked List");
        }else {
            while(temp.next != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print(temp.data);
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