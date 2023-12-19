import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class Linke


        dList {
  
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
           data=d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    {
        Node newNode = new Node(data);
        if(list.head ==null){
            list.head=newNode;
        }
        else{
            Node last = list.head;
            while(last.next!=null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {
        Node current = list.head;
        while(current!=null){
            System.out.println("Current node data is: "+ current.data);
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