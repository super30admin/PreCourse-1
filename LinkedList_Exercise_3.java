// Time Complexity : O(1) as we insert a new element at the head. It will be O(n) if we consider inserting elements at the end/tail.
// Space Complexity : O(1).

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
            this.data = d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node newNode = new Node(data);

        Node head = list.head;
        if (head == null) {
            list.head = newNode;
        } else {
            newNode.next = head;
            list.head = newNode;
        }
        
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node current = list.head;
   
        // Print the data at current node 
        while (current != null) {
            System.out.print(current.data + " -> ");

            // Go to next node 
            current = current.next;
        }

        System.out.print(" null ");
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