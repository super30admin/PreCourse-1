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
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data)
    { 
        // Create a new node with given data
        Node node = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null) {
            list.head = node;
        }
        else{
            // Else traverse till the last node 
            // and insert the new_node there 
            Node curr = list.head;
            while(curr.next != null) curr = curr.next;

            // Insert the new_node at last node
            curr.next = node;
        }
        // Return the list by head
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {
        // Traverse through the LinkedList 
        Node curr = list.head;
        while(curr != null){
            // Print the data at current node
            System.out.print(curr.data + "--->");
            // Go to next node
            curr = curr.next;
        }
        System.out.println("null");

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