import java.io.*; 
  
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
            //Write your code here 
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node n = new Node(data);

   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null){
            list.head == n; //making the new node as the head.
        }
        // Else traverse till the last node
        // and insert the new_node there
        else{
            Node node = list.head;
            while(node.next!=null){
                node = node.next;
            }
            node.next =n;//inserting the new node at the end of linked list.
        }

            // Insert the new_node at last node 
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
	 Node n = list.head; //Entry point the head

	 while(n.next!=null) {
		 System.out.print(n.data);
		 n = n.next;  // Go to next node
	 }
	 System.out.print(n.data);//final node have next as null so it willl print in the loop , wee need to print it manually.

         // Print the data at current node
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
