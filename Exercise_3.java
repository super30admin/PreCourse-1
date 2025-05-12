import java.io.*; 

/*
**************************************************
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
          this.data = d;
          this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
      Node node = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
      if(list.head == null){
        list.head = node;
      }
       
            // Else traverse till the last node 
      else{
        Node last = list.head;
        while(last.next!=null)
          last = last.next;
      }
            // and insert the new_node there 
      last.next = node;

            // Insert the new_node at last node 
        // Return the list by head 
      return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
      Node currNode = list.head;
      
        // Traverse through the LinkedList 
      System.out.println("LinkedList: ");
      while(currNode != null){
        // Print the data at current node
        System.out.print(currNode.data + " ");
        // Go to next node 
        currNode = currNode.next;
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
*************************************************************
*/

// Custom singly linked list implementation
public class MyLinkedList {

    Node head; // head of the list

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Insert a new node at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        // If list is empty, make new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Else, traverse to the end and insert
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode; // <--- This line works correctly now
    }

    // Print the linked list
    public void printList() {
        Node currNode = head;

        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.printList();
    }
}
