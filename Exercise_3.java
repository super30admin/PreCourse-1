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
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        if(list.head == null)
        {
            head = new Node(data);
            return head;
        }
        Node toadd = new Node(data);
        Node temp = list.head;
        while(temp.next! = null)
        {
            temp = temp.next;
        }
        temp.next = toadd;
        return temp;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
             Node n = list;
        while (n != null) {
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