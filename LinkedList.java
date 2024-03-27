import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
    // Time Complexity : insert - O(N) - as we are inserting new element at the end , printList - O(N) - Traversing throught the length of linked list
    // Space Complexity : O(1) as we are inserting constant number of elements to the linked list
  
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
        Node curr = list.head;
        // Create a new node with given data 
        Node newNode = new Node(data);

        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null) {
            list.head = newNode;
            return list;
        }
        
            // Else traverse till the last node 
            // and insert the new_node there 
        else {
            while(curr.next != null) {
                curr = curr.next;
            }
        // Insert the new_node at last node 
        curr.next = newNode;
        }
        // Return the list by head
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node curr = list.head;
        // Traverse through the LinkedList 
        while(curr != null) {
            // Print the data at current node 
            System.out.println(curr.data);
            // Go to next node 
            curr = curr.next;
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