import java.io.*; 
//Time Complexity: O(n) for Insert, Print
//Space Complexity: O(n)
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
        Node(int d) 
        { 
            //Write your code here 
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) 
    { 
        // Create a new node with given data 
        Node new_Node = new Node(data);
        new_Node.next=null;
   
        // If the Linked List is empty, 
        if(list.head == null){
            // then make the new node as head 
            list.head = new_Node;
        }
        
            // Else traverse till the last node 
        else{
            Node last_node = list.head;
            while(last_node.next!=null){
                last_node = last_node.next;
            }
            // and insert the new_node there
            last_node.next = new_Node;
        }
             

            // Insert the new_node at last node 
        // Return the list by head
        return list; 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
        // Traverse through the LinkedList 
        Node currentNode = list.head;
        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;
        }
   
            // Print the data at current node 
       
            // Go to next node 
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        Exercise_3 list = new Exercise_3(); 
  
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