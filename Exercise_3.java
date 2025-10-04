/*
Time Complexity:
   insert: O(n) {Con be reduced to O(1) if we had tail node}
   print: O(n)

Space Complexity:
   insert: O(1)
   print: O(1)
 */
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
        Node newNode = new Node(data);
   
        // If the Linked List is empty,
        // then make the new node as head
        if(list.head == null){
            list.head = newNode;
        }
        
            // Else traverse till the last node 
            // and insert the new_node there
        else{
            Node currentNode = list.head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            // Insert the new_node at last node
            currentNode.next = newNode;
        }
        // Return the list by head
            return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList
        if(list.head == null){
            System.out.println("List is Empty");
        }
        // Print the data at current node

        // Go to next node
        else {
            Node currentNode = list.head;
            while (currentNode != null) {
                System.out.println(currentNode.data);
                currentNode = currentNode.next;
            }
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