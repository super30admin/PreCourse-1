import java.io.*; 
  
/* Implement Singly Linked List 
 * 
 * Time Complexity : O(n) for insert
 * Space Complexity : O(n) --> number of nodes
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
 * 
 * Example: Head --> FirstNode --> SecondNode -->  NULL
 * Algorithm:
 * Insert:
 * 1.If the Linked List is empty, 
        then make the new node as head
    Else traverse till the last node 
        and insert the new_node there 
        Insert the new_node at last node 
    Return the list by head 
 * 
*/
public class LinkedList { 
  
    static Node head; // head of list 
  
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
        Node newNode = new Node(data);

        if(list == null || list.head == null)
        {
            list.head = newNode;
        }
        else
        {
            Node currentNode = list.head;
            
            while(currentNode.next != null)
            {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
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
        System.out.println("******Singly Linked List******");
        while(currentNode != null)
        {
            System.out.print(currentNode.data +"-->");
            currentNode = currentNode.next;
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