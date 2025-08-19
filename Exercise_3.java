import java.io.*; 
// Time Complexity: O(n) for insertion and printing
// Space Complexity: O(n) where n is the number of nodes in the linked list
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
            data = d;
            next = null;
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

        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node; // If list is empty, set head to new node
        } else {
            Node last = list.head; // Start from head
            while (last.next != null) { // Traverse to the last node
                last = last.next;
            }
            last.next = new_node; // Insert new node at the end
        }
        return list; // Return the updated list
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node
        Node currNode = list.head; // Start from head
        while (currNode != null) { // Traverse until the end of the list
            System.out.print(currNode.data + " "); // Print current node's data
            currNode = currNode.next; // Move to the next node
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