import java.io.*; 
  
// Java program to implement 
// a Singly Linked List

// Time Complexity :
// Insert - O(1)
// Space Complexity :
// O(1)
// Did this code successfully run on Leetcode :
// Didn't find exact problem on leetcode
// Any problem you faced while coding this :
// No
class LinkedList {

    Node head; // head of list 
    Node tail;
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
        Node pointer = list.head;
        Node newNode = new Node(data);
        // If the Linked List is empty,
        // then make the new node as head
        if(pointer == null){
            list.head = newNode;
            list.tail = newNode;
            return list;
        }
        // Else insert the new node at the tail end of linked list
        pointer = list.tail;
        pointer.next = newNode;
        list.tail = newNode;
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {   // Traverse through the LinkedList
        // Print the data at current node
        // Go to next node
        Node pointer = list.head;
        while(pointer != null){
            System.out.print(pointer.data+"\t");
            pointer = pointer.next;
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