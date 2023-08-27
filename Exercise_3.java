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
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node root = new Node(data);
        root.next = null;
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null){
            list.head = root;
        }
            // Else traverse till the last node 
            // and insert the new_node there 
        else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = root;
        }
            // Insert the new_node at last node 
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
            Node root = list.head;     
            System.out.print("LinkedList: ");
            while (root != null) {
                // Print the data at current node
                System.out.print(root.data + " ");
                // Go to next node
                root = root.next;
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