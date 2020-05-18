//Time Complexity:O(1)
//Space Complexity:O(1)

import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
 class   LinkedList {
  
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
            data=d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node x= new Node(data);
        Node temp=list.head;
        // If the Linked List is empty,
        // then make the new node as head
        if(list.head==null)
        {
            list.head=x;
        }
            // Else traverse till the last node 
            // and insert the new_node there 
            else
        {
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=x;
        }

        // Return the list by head
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {
        Node temp=list.head;
        // Traverse through the LinkedList 
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
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