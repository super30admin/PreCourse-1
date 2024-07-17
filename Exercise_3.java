import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList {
    // Time Complexity: O(n) for all operations
    // Space Complexity: O(n) where n is the size of the list 
  
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
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node newNode = new Node(data);
        newNode.next = null;
        
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) {
            list.head = newNode;
        }else{
            Node tail = list.head;

            while(tail.next != null){
                tail = tail.next;
            }

            tail.next = newNode;
        }

        return list;
        
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node curNode = list.head;
        // Traverse through the LinkedList 

        while (curNode != null) {
            
            System.out.println(curNode.data);
            curNode = curNode.next;
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