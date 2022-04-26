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
  
        Node(int d) 
        { 
            this.data = d;
        } 
    } 
  
    /**
     * Method to insert a new node
     * Time complexity: O(n)  
     * Space complexity: O(n)
     */
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null) list.head = newNode; 
            // Else traverse till the last node 
            // and insert the new_node there 
        else {
            Node current = list.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode; // Insert the new_node at last node 
        }
        return list;    // Return the list by head 
        
    } 
  
    /**
     * Method to print the LinkedList.
     * Time complexity: O(n)  
     * Space complexity: O(n)
     */
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList
        Node current = list.head; 
        System.out.print("HEAD -> ");
        while(current!=null && current.next!= null){
            // Print the data at current node 
            System.out.print(current.data);
            System.out.print(" -> ");
            current = current.next; // Go to next node 
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