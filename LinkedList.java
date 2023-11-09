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
            this.data =d;
            //Write your code here 
        } 
    } 
  
    // Method to insert a new node 
    // Time complexity: O(n)  
    // Space complexity: O(n)
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head==null)
            list.head = newNode;

        else
        {
            Node curr = list.head;
            while(curr.next != null){
                curr=curr.next;
            }
        curr.next = newNode; //inserting new node at last
        }
    return list;
}
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 

        
    
  
    // Method to print the LinkedList. 
    
    // Time complexity: O(n)  
    // Space complexity: O(n)
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 

            Node curr = list.head; 
        System.out.print("HEAD -> ");
        while(curr!=null && curr.next!= null){
            // Print the data at current node 

            // Go to next node 
            System.out.print(curr.data);
            System.out.print(" -> ");
            curr = curr.next; // Go to next node 
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

