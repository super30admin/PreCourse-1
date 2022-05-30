// Java program to implement
// a Singly Linked List 
public class LinkedList {
  
   static Node head; // head of list
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            this.data=d;
            this.next=null;//Write your code here
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data)
    { 
        // Create a new node with given data
        Node temp = new Node(data);
        Node temp1=head;
        // If the Linked List is empty, 
        // then make the new node as head
        if(head==null) {
            head = temp;

        }
        else{
            while(temp1.next!=null){
                temp1=temp1.next;
            }
            temp1.next=temp;
        }

            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
     return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList
        Node temp= head;
        if(head==null) System.out.println("list is empty");
        else{
            while(temp.next!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
            System.out.println(temp.data);
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