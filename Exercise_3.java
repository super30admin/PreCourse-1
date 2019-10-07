import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    private static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=next;
        }
    } 
  
    // Method to insert a new node 
    //Time Complexity : O(n)
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node k = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if(head==null) {
            head=k; head.next=null; }

        // Else traverse till the last node
        // and insert the new_node there
        else{
            Node n=head;
            n.next=head.next;
            while(n.next!=null){
                n=n.next;
            }
            n.next=k;
            k.data=data;
        }
        // Return the list by head 
        return list;
    } 
  

    // Method to print the LinkedList. 
    //Time Complexity : O(n)
    public static void printList(LinkedList list) 
    {  
         if(head==null) return;
        Node n=head;
        System.out.println(n.data);
        // Traverse through the LinkedList
        while(n.next!=null){
            // Print the data at current node 
            n=n.next;
            // Go to next node 
            System.out.println(n.data);
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