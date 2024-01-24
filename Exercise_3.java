import java.io.*; 

public class LinkedList { 
  
    Node head;
  
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
        if (list.head == null) {
            list.head = new Node(data);
            return list;
        }
        
        Node tempNode = list.head;
        
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = new Node(data);
        
        return list; 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        String str = "";
        Node tempNode = list.head;
        
        while (tempNode != null) {
            str += tempNode.data;
            if(tempNode.next != null) {
                str += " -> ";
            }
            tempNode = tempNode.next;
        }
        
        System.out.println(str); 
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