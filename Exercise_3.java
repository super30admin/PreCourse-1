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
            this.data=d;
            this.next=null;
            //Write your code here 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node nNode=new Node(data);
        nNode.next=null;
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head==null) list.head=nNode;
         // Else traverse till the last node 
            // and insert the new_node there 
        else{
            Node last=list.head;
            while(last.next!=null) {
                last=last.next;
            }
            last.next=nNode; // Insert the new_node at last node 
        }
        return list;      // Return the list by head     
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node last=list.head;
            while(last!=null) {
                
                System.out.println(last.data);  // Print the data at current node 
                last=last.next;        // Go to next node 
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