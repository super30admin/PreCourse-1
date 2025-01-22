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
          data = d;
            next = null;  //Write your code here 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
       Node newNode = new Node(data); // Create a new node with given data 

        if (list.head == null) { // If the Linked List is empty, 
            list.head = newNode;  // then make the new node as head 
        } else { // Else traverse till the last node
            Node last = list.head; // and insert the new_node there 
            while (last.next != null) { // Insert the new_node at last node 
                last = last.next;// Return the list by head 
            }
            last.next = newNode;
        }
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
       Node currentNode = list.head;
        while (currentNode != null) { // Traverse through the LinkedList 
           System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next; {   // Print the data at current node 
           }
        System.out.println("null"); // Go to next node 
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
        printList(list); clear
        