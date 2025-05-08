import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 

public class LinkedList { 
    // Time Complexity: O(n) -> insert (function since inserting at end), printList (iterating till the end of the list)
    // Space Complexity: O(n)  -> (looks similar to array but linkedlist takes extra space per node for reference of next objects)
    //Did this code successfully run on Leetcode : Yes (works on Compilers)
    // Any problem you faced while coding this : Not as such
  
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
            //assinging the data to the node
            this.data = d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node node = new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null)
            list.head = node;
            // Else traverse till the last node 
            // and insert the new_node there 
        else
        {
            Node ref = list.head;
            //checking till the node is null i.e. the last element
            while(ref.next != null){
                ref = ref.next;
            }
            // Insert the new_node at last node 
            ref.next = node;
        }
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        //creating a node to iterate and pointing it to root
        Node node = list.head;
        //checking till the node is null i.e. the last element
        while(node!=null){
            // Print the data at current node 
            System.out.print(node.data);
            // Go to next node 
            node = node.next;
            // adjusting the comma for better visibility
            if(node != null) System.out.print(", ");
        }
         System.out.println("");
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
