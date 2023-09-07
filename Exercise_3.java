import java.io.*; 
  
// Java program to implement 
// a Singly Linked List
// Time complexity is O(1)
// Space complexity is O(1)
class LinkedList {
  
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
            next = null;

        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data
        Node  newnode = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head
        if(list.head == null){
            list.head = newnode;
        }
        else {
            Node last = list.head;
            while(last.next!=null) {
                last = last.next;
            }
            last.next=  newnode;
        }
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {
        Node currentNode= list.head;
        while(currentNode !=null) {
            System.out.print(currentNode.data+" ");
            // Go to next node
            currentNode= currentNode.next;
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