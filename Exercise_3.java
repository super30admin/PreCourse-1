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
            this.data = data;
            this.next = null; 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);
   
       if(head == null)
       {
        new_node.next = head;
         head = newNode;                
       }
       else
       {
           Node last = head;
           while(last.head !=null)
           {
            last = last.next;
           }
           last.next = newNode;
       }        
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
         Node currNode = head;
        while (currNode != null) {
            Console.Writeline(currNode.data);
            currNode = currNode.next;
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