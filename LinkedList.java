//Time Complexity -> O(n) for insert() and printList()
//Space Complexity -> O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
// - In insert(): we create a newNode and checked if inital list is empty. If so, we made the newNode to become head.
// - Else we tranverse to the last node and link the newNode at the end
// - printList(): we simply created a curNode and traverse till the end and print each curnode's data




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
        
        // If the Linked List is empty, 
        // then make the new node as head 
       
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 

        Node newNode = new Node(data);

        if(list.head==null){
            list.head=newNode;
        }
        else{
            Node temp = list.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        return list;


    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 

            Node cur = list.head;
            System.out.println("Linked list is: ");
            while(cur!=null){
                System.out.println(cur.data + " ");
                cur=cur.next;
            }
            System.out.println();


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