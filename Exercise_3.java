import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
 class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    // public LinkedList(){
    //     this.head = null;
        
    // }
    
    
    
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
        Node n = new Node(data);
        // n.data = data;
        // If the Linked List is empty, 
        if (list.head == null){
            list.head = n;
        }
        // then make the new node as head 
        else {
            Node last = list.head;
            while (last.next != null){
                last = last.next;
            }

            last.next = n;
            
            // n.next = list.head;
            // list.head = n;
            // Else traverse till the last node 
            // and insert the new_node there 
        }

        return list;
            // Insert the new_node at last node 
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node n;
        n = list.head;
        
        while (n != null){
            System.out.println(n.data + "\n");
            n = n.next;        
        }
            // Print the data at current node 
       
            // Go to next node 
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