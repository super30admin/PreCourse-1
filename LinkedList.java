
// Java program to implement 
// a Singly Linked List 
// Time complexity o(n) 
//space complexity o(n) 
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
            this.data = d;
            this.next = null;
        } 
    } 

    public LinkedList(){
        this.head = null;
        
    }
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        
        Node newNode = new Node(data); // Create a new node with given data 
        if(list.head == null){  // If the Linked List is empty, // then make the new node as head 
            list.head = newNode;
        }
        else{
            Node current = list.head;
            while (current.next != null) { // Else traverse till the last node  // and insert the new_node there 
                current = current.next;
            }
            current.next = newNode; // Insert the new_node at last node 
        }
        return list; // Return the list by head 
         
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node current = list.head;
        while (current != null) { // Traverse through the LinkedList 
            System.out.println(current.data); // Print the data at current node 
            current = current.next; // Go to next node 
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