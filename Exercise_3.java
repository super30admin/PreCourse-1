// Time Complexity : O(n) for insert and printlist operations.
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : It ran successfully in VSCode.
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

// For insert operation check if the head node is null, in case of null value assign head with the inserted
// node otherwise check the entire linked list starting from head for null value in the next. After finding a 
// node with null value in next assign the new node to be inserted in the next. For printlist operation start 
// from the begining of the linkedlist and traverse until a null node is found and in every iteration print
// the node value using data.

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
            //Write your code here
            data = d; 
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
             list.head = n;
        }
        // Else traverse till the last node 
        // and insert the new_node there 
        // Insert the new_node at last node 
        // Return the list by head 
        else{
            Node temp = new Node(list.head.data);
            temp = list.head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = n;
        }
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        // Print the data at current node 
        // Go to next node
        Node temp = new Node(list.head.data);
        temp = list.head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
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