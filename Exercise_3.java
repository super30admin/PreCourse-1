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
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);
        //newNode.next = null;
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null){
            list.head = newNode;
        }
        // Else traverse till the last node
        // and insert the new_node there 
        else{
            Node temp = list.head;
            while(temp.next != null){
                temp = temp.next;
            }
            // Insert the new_node at last node 
            temp.next = newNode;
        }
        // Return the list by head
        return list;       
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node startNode = list.head;
        // Traverse through the LinkedList
        if(list.head == null){
            System.out.println("List is empty");
        }
        else{
            System.out.println("Linked List contains the data:");
            while(startNode != null){
                // Print the data at current node 
                System.out.println(startNode.data);
                // Go to next node 
                startNode = startNode.next;
            }
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