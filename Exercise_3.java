import java.io.*; 
 

// Time Complexity : insert() -> O(N); printList() -> O(N)
// Space Complexity : O(N), where N represents the maximum length of the LL;

// Your code here along with comments explaining your approach:
// 1. The head variable inside the LinkedList is central data store for the linkedlist items.
// 2. This head LL is being appended with newItem at the end when we call insert() with an item. This variable can be accessed from the LL arg passed to this method. This is done by iterating to the last item of the LL which takes O(N).
// 3. If the LL is empty, I skipped this iteration while inserting an item. Instead, I made the newNode the head.

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
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head==null){
            list.head = newNode;
        } else {
            // Else traverse till the last node 
            // and insert the new_node there 
            Node temp = list.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            // Insert the new_node at last node
            temp.next = newNode;
        }
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node temp = list.head;
        if (temp==null) {
            System.out.println("LinkedList is empty");
        }
        while(temp!=null){
            // Print the data at current node 
            System.out.print(temp.data + " ");
            // Go to next node 
            temp=temp.next;
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
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}