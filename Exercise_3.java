import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
 class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    // Class Node used to create a Node whenever new element is added.
    // Node consists of data and address of next element of the Linked List
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor for Node class
        Node(int d) 
        { 
            //Write your code here 
            this.data = d;
        } 
    } 
  
    // Method to insert a new node 
    // Time Complexity: O(n) where n is number of elements in the list
    // Here lastNode is not helful because in every method list is being passed from the driver code.
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 

        Node newNode = new Node(data);
        if (list.head==null)
        {
            list.head = newNode;
            return list;
        }
        Node temp = list.head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        return list;
    } 
  
    // Time Complexity: O(n) where n is number of elements in the Linked List
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
            if (list.head == null)
            {
                System.out.println("List is emplty");
                return;
            }
            Node temp = list.head;
            int i =0;
            while(temp!=null)
            {
                System.out.println(i + " element of the list is: " + temp.data);
                temp = temp.next;
                i++;
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