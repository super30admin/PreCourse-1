import java.io.*; 

/*Time complexity
insert() - O(n), where n is the no of nodes as we have to traverse from head to end node to add a new node
printList() - O(n), as we have to go through all nodes in the list
*/

/*Space complexity
O(n) as the size of the linkedlist depends on the number of elements inserted.
*/

// Did this code successfully run on Leetcode : Could not find exact question on leetcode but worked successfully with varying edge cases on local compiler.

// Any problem you faced while coding this : None as Exercise 2 helped me recollect the concepts regarding implmenting linked lists.
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
            this.data=d;
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

        Node node = new Node(data);
        if (list.head == null) {
            list.head = node;
        } else {
            Node insertLocation = list.head;
            while (insertLocation.next != null) {
                insertLocation = insertLocation.next;
            }
            insertLocation.next = node;
        }

        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 

            Node currentNode = list.head;
        while (currentNode.next != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data);

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