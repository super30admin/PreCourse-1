 // Time Complexity : Insert Operation requires us to traverse the linked list atleast one  - while inserting the last element, hence O(N).
// Space Complexity : Depends on the list of elements, if N elements are stored, O(N).
// Did this code successfully run on Leetcode : Not Applicable
// Any problem you faced while coding this : When inserting into a linked-list there are two cases to be considered:
// 1. If the list is empty, simply set the newly created node as head 
// 2. If the list is not empty, iterate to the last element and set it's next to point to the newly created node  
// I forgot to use the "else" in the if-else for 1 and 2   (if 1 else 2), was simply checking for the first condition 
//and not the second, and hence was entering into an infinite loop.
  
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
            this.data =d;
            this.next = null;
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
        {
            list.head = node;
        }
        else
        {
            // Else traverse till the last node 
            // and insert the new_node there
            Node curr = list.head;
            
            while(curr.next!= null)
            {
            //System.out.println("This is curr: " + curr.data + " This is next: " + curr.next.data);
            curr = curr.next;
            }
            // Insert the new_node at last node 
            curr.next = node;

        }
        // Return the list by head 

        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node curr = list.head;
        while(curr!= null)
        {
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