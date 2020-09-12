 
// Java program to implement 
// a Singly Linked List 
public class LinkedList { //O(1)
  
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
    public static LinkedList insert(LinkedList list, int data) // time O(n) where n is no. of elements 
                                        //time to push n elements O(n) space O(1) space O(typesize * n)
    { 
        // Create a new node with given data 
        Node newnode = new Node(data); 
        newnode.next = null; 
  
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = newnode; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { // time O(n-1) sapce constant 
                last = last.next; 
            } 
  
            // Insert the new_node at last node 
            last.next = newnode; 
        }
        // Return the list by head 
            return list; 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) //time O(n) and space O(n)
    { 
        Node currentNode = list.head; 
   
        System.out.print("Vals in Linked List: "); 
   
        // Traverse through the LinkedList 
        while (currentNode != null) { 
            // Print the data at current node 
            System.out.print(currentNode.data + " "); 
   
            // Go to next node 
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