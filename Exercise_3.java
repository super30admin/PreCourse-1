//TC - inserting at head is O(N)
//SC - O(N)
import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
class LinkedList { 
  
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
    public static LinkedList insert(LinkedList list, int data)
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);
        // If the Linked List is empty, 
        if(list.head == null){
            // then make the new node as head
            list.head = newNode;
        }
        else{
             // Else traverse till the last node
            Node lastNode = list.head; 
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            // and insert the new_node there 
            lastNode.next = newNode;
        }

        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node currentNode = list.head;
        System.out.println("List head: " + list.head.data);
        // Traverse through the LinkedList 
        while(currentNode != null){
            // Print the data at current node 
            System.out.println("Current node " + currentNode.data);
            currentNode = currentNode.next;
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