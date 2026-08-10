import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class Exercise_3 { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next;
        
  
        // Constructor 
        Node(int data) 
        { 
            //Write your code here 
            this.data = data;
            this.next = null;
          
        } 
    } 
  
    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) 
    { 
        // Create a new node with given data 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        Node newNode = new Node(data);
        //LL is empty
        if(list.head == null){
            list.head = newNode;
            return list;
        }

        // LL is not empty so traverse till last and then insert the element
        Node temp = list.head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
        // Traverse through the LinkedList 
            // Print the data at current node 
            // Go to next node
            Node temp = list.head;
            while(temp != null){
                System.out.print(+temp.data +" -> ");
                temp = temp.next;
            } 
            System.out.println("null");
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        Exercise_3 list = new Exercise_3(); 
  
        // 
        // ******INSERTION****** 
        
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