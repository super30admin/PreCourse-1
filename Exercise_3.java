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
            //Write your code here 
            this.data = data;    
            this.next = null;   
        } 
    } 

    //Initialize head and tail of the node   
    public Node head = null;    
    public Node tail = null;    
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);    
   
        // If the Linked List is empty, 
        // then make the new node as head 

        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;   
        }   
        
            // Else traver  se till the last node 
            // and insert the new_node there 
         else {    
                 
                tail.next = newNode;     
                tail = newNode;    
            }     

            // Insert the new_node at last node 
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
            Node current = head;    
            
            if(head == null) {    
                System.out.println("List is empty");    
                return;    
            }    
            System.out.println("Nodes of singly linked list: ");    
            while(current != null) {    
                  
                System.out.print(current.data + " ");    
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