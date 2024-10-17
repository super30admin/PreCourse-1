import java.io.*; 
// Time Complexity : o(n)
// Space Complexity : o(n)
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
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty, 
        if(list.head == null){
            // then make the new node as head
            list.head = new_node; 
        } else{
            // Else traverse till the last node 
            // and insert the new_node there
            Node last = list.head;
            while(last.next !=null){
                last = last.next;
            }
            last.next = new_node; // Insert the new_node at last node 
        }
        return list; // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node n = list.head;
        while (n!=null){// Traverse through the LinkedList 
            system.out.println(n.data + " "); // Print the data at current node 
            n=n.next; // Go to next node 
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