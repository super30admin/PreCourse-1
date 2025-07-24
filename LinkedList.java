    // Space Complexity : O(n)
    // Did this code successfully run on Leetcode : This is not a Leetcode problem
    // Any problem you faced while coding this : No
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
  
    // Instance variable of the class LinkedList to create a head node 
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    // Node class to create a new node with data and next pointer

    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            //Write your code here 
            data=d;
            next=null;
        } 
    } 
  
    // Method to insert a new node 
    // Method to insert a new node at the end of the Linked List instead of the beginning
    // This method takes the LinkedList object and the data to be inserted as parameters
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
         Node new_node = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) {
                list.head = new_node;
            } 
        
            // keep traversing through all the nodes until the last node that has no pointer to next node is reached
            // update the current node to the next node until the end of the list is reached
            // Then update the last node's pointer to the new node inserting it at the end of the list
            else {
               
                Node current = list.head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new_node;
            }
        // Return the list by head
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    /* traverse through the LinkedList starting from the head node to print the data in the order
       in which the nodes were inserted */
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node current = list.head;
            while (current != null) {
            // Print the data at current node 
            System.out.print(current.data + " ");
            // Go to next node 
            current = current.next;
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
        System.out.println(); // For better readability in output 
    } 
}