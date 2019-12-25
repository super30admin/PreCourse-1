import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
class LinkedList {
  
    static Node head =  null; // head of list
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            this.data = d;//Write your code here
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data
        Node newnode = new Node(data);
        newnode.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if(head == null){
            head = newnode;
        }
        // Else traverse till the last node
        // and insert the new_node there
        else{
            Node currentNode = head;
            Node prev = null;
            while(currentNode!=null){

                prev = currentNode;
                currentNode = currentNode.next;

            }
            prev.next = newnode;

        }
        // Return the list by head
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList
        Node currentNode = head;
        while(currentNode!=null){
            System.out.println(currentNode.data);
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