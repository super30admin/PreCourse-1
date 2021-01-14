import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
      
    Node head = null; // head of list 
  
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
        Node newNode = new Node(data);
        
        if(list.head == null) {
            list.head = newNode;
            return list;
        }
        Node temp = list.head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        if(null == list.head) {
            System.out.println("LinkedList is empty!! \n------------------------------");
            return;
        }
        System.out.println("Linkedlist elements \n------------------------------");
        Node temp = list.head;
        while(temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println("\n------------------------------");
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
        printList(list);
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        printList(list);
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}