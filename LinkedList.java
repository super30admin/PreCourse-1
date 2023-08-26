// Java program to implement
// a Singly Linked List
// Time complexity for insert - O(n)
// TC for printing the list  - O(n) where n is the size of the list
// SC -O(1)
public class LinkedList { 
  
    static Node head; // head of list
  
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
    public static Node insert( int data)
    { 
        // Create a new node with given data
        Node newNode = new Node(data);
   
        // If the Linked List is empty,
        if(head == null){
            // then make the new node as head
            head = newNode;
        }

        // Else traverse till the last node
        // and insert the new_node there
        else{
            Node temp = head;
            //Node prev =
            while(temp.next != null){
                temp = temp.next;
            }
            // Insert the new_node at last node
            temp.next = newNode;

        }
        // Return the list by head
        return head;



        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Node list)
    {  
        // Traverse through the LinkedList
        Node temp = head;
        while(temp != null){
            // Print the data at current node
            System.out.println(temp.data);
            // Go to next node
            temp = temp.next;
        }





    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        //Node list = new Node();
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
       insert( 1);
        insert( 2);
        insert( 3);
        insert( 4);
        insert( 5);

        // Print the LinkedList 
        printList(head);
    } 
}