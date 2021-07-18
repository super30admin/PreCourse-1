import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
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
        Node n1 = new Node(data);
        n1.next = null;
   
        // If the Linked List is empty, 
        // then make the new node as head
        if (list.head == null)
        {
            list.head = n1;
        }
            // Else traverse till the last node 
            // and insert the new_node there 
        else
        {
            //take a pointer and traverse the list
            Node ptr = list.head;
            while (ptr.next != null)
            {
                ptr = ptr.next;
            }
            //when ptr is pointing to null
            // Insert the new_node at last node
            ptr.next = n1;
        }
        // Return the list by head
        return list;     
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node trvs = list.head;
        while (trvs != null)
        {
            // Print the data at current node 
            System.out.println(trvs.data);
            // Go to next node
            trvs = trvs.next;
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

