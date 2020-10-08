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
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    {

        Node newNode = new Node(data);
        if( list.head == null){
            list.head = newNode;
        }
        else{
            Node current = list.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            newNode.next = null;
            return list;
        }
        
    } 

    public static void printList(LinkedList list) 
    {
        Node current = list.head;
        System.out.println("Linked list: ");
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