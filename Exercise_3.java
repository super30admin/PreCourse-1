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
            this.data = d;
            this.next = null;
            //Write your code here 
        } 
    } 
  
    // Method to insert a new node 
    public void insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 

        Node node = new Node(data);
        node.data = data;
        node.next = null;

        if(head == null)
        {
            head = node ;
        }
        else{
            Node n = head;
            while(n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
   
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public  void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 

            Node n = head;
            while (n.next != null)
            {
                System.out.println(n.data);
                n= n.next;
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
        list.insert(list, 1); 
        list.insert(list, 2); 
        list.insert(list, 3); 
        list.insert(list, 4); 
        list.insert(list, 5); 
  
        // Print the LinkedList 
        list.printList(list); 
    } 
}