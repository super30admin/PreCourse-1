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
            data = d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node tempNode = new Node(data);
        if(list ==null) {
            list = new LinkedList();
        }
        if(list.head == null) {
            list.head = tempNode;
        } else {
            Node lastElement = list.head;
            while(lastElement.next!=null) {
                lastElement = lastElement.next;
            }
            lastElement.next = tempNode;
        }
        return list;    
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node currentNode = list.head;
        while(currentNode.next!=null) {
            System.out.println("Value"+ currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println("Value"+ currentNode.data);
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