import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
// Time Complexity : O(N)
// Space Complexity : O(1)
// Problem faced : 1.Had to rename LinkedList to Exercise_2 
// because file name and class name should be same
// 2. Needed to delete import java.io.* because did not use it in the program
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
            data=d;
            next=null;
        } 
    } 
  
    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data);
        new_node.next=null;
        // If the Linked List is empty, 
        if(list.head==null){
        //Then assign the new node to head 
        list.head=new_node;
        }
        else{
            // Else traverse till the last node 
            Node last = list.head;
            while(last.next != null){
                last=last.next;
            }
            // And insert the new_node there
            // Insert the new_node at last node  
            last.next = new_node;
        }
        // Return the list by head 
        return list;
        
 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
       // Traverse through the LinkedList 
       Node node = list.head;
       // Print the data at current node 
       while(node != null){
       // Go to next node 
       System.out.println(node.data);
       node = node.next;
       }
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