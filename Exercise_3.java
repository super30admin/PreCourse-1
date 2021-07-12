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
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    // TC: O(N), where N = size of the list
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node n = new Node(data);

        // If the Linked List is empty, 
        // then make the new node as head 
        if(null == list.head)
        {
            list.head = n;
        }
        
            // Else traverse till the last node 
            // and insert the new_node there 
        else
        {
            Node h = list.head;
            while(h.next != null)
            {
                h = h.next;
            }

            h.next = n;

        }

            // Insert the new_node at last node 
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    // TC: O(N), where N = size of the list
    public static void printList(LinkedList list) 
    {  
        Node h = list.head;
        // Traverse through the LinkedList 
        while(h != null)
        {
            System.out.print(h.data+" -> ");
            h = h.next;
        }
        System.out.println("NULL ");
            
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