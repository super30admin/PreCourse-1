import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    static class Node {
    	int data;
        Node next;
       
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node new_node = new Node(data);
        new_node.next = null;
        
        if (list.head == null) {  // If the Linked List is empty,then make the new node as head
            list.head = new_node;
        }
        else { // Else traverse till the last node and insert the new_node there
        	Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node n = list.head;
        System.out.print("LinkedList: ");
        while (n!= null) {
            System.out.print(n.data + " ");
            n = n.next;
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
