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
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // since we are traversing the linked list to insert the new node, which is a linear time operation
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node newNode = new Node(data);
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return list;

     
        
    } 
  
    // Method to print the LinkedList. 
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // since we are traversing the linked list to print the elements, which is a linear time operation
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node temp = list.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // Insert the values 
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