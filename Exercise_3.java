/**
 * Java program to implement a Singly Linked List
 * Time complexity: O(n)
 * Space complexity: O(n) where n is the size of the list
  */

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
            next = null;
        } 
    }

    // Method to check if list is empty
    public static boolean isEmpty (LinkedList list) {
        return list.head == null;
    }
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data
        Node newNode = new Node(data);

        // If the Linked List is empty, 
        // then make the new node as head
        if (isEmpty(list)) {
            list.head = newNode;
            return list;
        }
        
        // Else traverse till the last node
        // and insert the new_node there
        Node current = list.head;
        while (current.next != null) {
            current = current.next;
        }
        // Insert the new_node at last node
        // Return the list by head
        current.next = newNode;
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList
        if (isEmpty(list)) {
            System.out.println("Nothing to print. List is empty.");
        }
            // Print the data at current node
            // Go to next node
        Node current = list.head;

        while (current != null) {
        System.out.println(current.data);
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