import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
class LinkedList { 
  
    /*
     * Time Complexity:: insert() = O(N), printList() = O(N) where N is the number of nodes in the 
     * linked list.
     * Space Complexity:: O(N) where N is the number of nodes in the linked list.
     * 
     * Approach:: insert() traverses to the last node in the linked list and adds the new node to the 
     * next pointer of last node. 
     * printList() traverses the linked list and prints each element of the list until the last node is 
     * reached.
     */
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
            //Write your code here 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        if (list.head == null) {
            list.head = new Node(data);
        } else {
            Node node = new Node(data);
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node curr = list.head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
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