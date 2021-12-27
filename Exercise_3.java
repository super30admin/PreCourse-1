import java.io.*; 
  
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
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(Exercise_3 list, int data) 
    { 
        // Create a new node with given data 

        Node newnode = new Node(data);
        newnode.next = null;

        // If the Linked List is empty, 
        // then make the new node as head 

        if(list.head == null){
            list.head = newnode;
        }else{
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head;
            while(last.next != null){
                last = last.head;
            }
             // Insert the new_node at last node 
        // Return the list by head 
            last.next = newnode;
            return list;

        }

    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
        // Traverse through the LinkedList 

        Node current = list.head;
        while(current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
   
            // Print the data at current node 
       
            // Go to next node 
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        Exercise_3 list = new Exercise_3(); 
  
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