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
            this.data = d;
        } 
    } 
  
    // Method to insert a new node 
    public LinkedList insert(LinkedList list, int data)
    { 
        // Create a new node with given data
        Node newNode = new Node(data);
   
        // If the Linked List is empty,
        if(list.head==null){
            // then make the new node as head
            list.head = newNode;
        }
        else{
            Node temp = list.head;
            // Else traverse till the last node
            while(temp.next!=null){
                temp = temp.next;
            }
            // and insert the new_node at the last node
            temp.next = newNode;
        }
        // Return the list by head
        return list;

    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {
        Node temp1 = list.head;
        // Traverse through the LinkedList
        while(temp1.next!=null){
            // Print the data at current node
            System.out.println(temp1.data);
            // Go to next node
            temp1 = temp1.next;
        }
        System.out.println(temp1.data);
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
        list = list.insert(list, 1);
        list = list.insert(list, 2);
        list = list.insert(list, 3);
        list = list.insert(list, 4);
        list = list.insert(list, 5);
  
        // Print the LinkedList 
        list.printList(list);
    } 
}