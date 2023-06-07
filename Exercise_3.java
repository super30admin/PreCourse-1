import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
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
    Node head; // head of list
    Node tail;
    int length;
    public Main(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node node = new Node(data);
        // If the Linked List is empty,
        if (list.head == null){
            list.head = node;
            list.tail = node;
            list.length++;
        }
        // then make the new node as head

        // Else traverse till the last node
        else{
            list.tail.next = node;
            list.tail = node;
            list.length++;
        }
        // and insert the new_node there

        // Insert the new_node at last node
        // Return the list by head
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Main list)
    {
        if (list.head==null){
            System.out.println("List is empty");
            return;
        }
        // Traverse through the LinkedList
        else{
            while(list.head!=null){
                System.out.println(list.head.data);
                list.head = list.head.next;
            }
        }
        // Print the data at current node

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