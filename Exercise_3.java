//time complexity : insert,print -> O(n)
//space complexity : O(n), n is max size of linkedList
 //Approach : If the Linked List is empty, then new node is head.Else will traverse till the last node and insert the new node after it .
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
        if(list.head == null){
            list.head = new Node(data);
            return list.head;
        }

        Node node = new Node(data);
        Node temp = list.head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = node;
        return list.head;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
            Node temp = list.head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
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