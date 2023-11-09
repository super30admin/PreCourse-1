 /*
 Time Complexity:
    printList(), insert() - O(n)
 Space Complexity: O(n) to store all n elements in n Nodes.
*/

/*
 PrintList() - Start from head node, print each node value and traverse to the next node until we have no more nodes to traverse.
 insert() - Create a new Node. If head is null, then the newnode is assigned as head. If not, traverse until the last
 node.Imp to have a track of the last node in order to link the new node after it. Now the new node is the last node.
 */
import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
class LinkedList { 
  
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
        Node newNode = new Node(data);
        Node current = list != null ? list.head : null;
        if(current == null){
            list.head = newNode;
            return list;
        }
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
            Node current = list != null ? list.head : null;
            while(current != null){
                System.out.println(current.data);
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
    } 
}