import java.io.*; 
  
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
            this.data  = d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        //System.out.println("insert");
        Node curr = list.head;

        // Create a new node with given data 
        Node newNode = new Node(data);

        // If the Linked List is empty, 
        // then make the new node as head 
        if(curr == null){
            list.head = newNode;
        }
        else{
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }

        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        //System.out.println("print");
        Node curr = list.head;
        // Traverse through the LinkedList 
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
            // Print the data at current node 
            //System.out.println(curr.data);
            // Go to next node 
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