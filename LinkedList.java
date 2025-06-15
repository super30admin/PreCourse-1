// a Singly Linked List 
// Singly Linked List Implementation

/*  Time Complexity:
    O(n) for both insert() and printList() methods.
    insert(): In the worst case, we need to traverse all nodes to reach the end of the list.
    printList(): We traverse all nodes to print their values. */

/* Space Complexity:
   O(n) total space to store 'n' nodes in the linked list.
   O(1) auxiliary space as only one pointer is used during each insertion or traversal.
 */

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
    /* This function inserts a new node at the end of the linked list.
        Steps:
        1. Create a new node using the given data.
        2. If the list is empty (head == null), make the new node the head.
        3. Otherwise, traverse the list to the last node and attach the new node at the end.
        4. Return the updated list.
    */
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node curr =  new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head
        if(list.head == null){
            list.head = curr;
            
        } 
        
            // Else traverse till the last node 
            // and insert the new_node there 
            else{
                Node temp = list.head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = curr;
            }
            // Insert the new_node at last node 
        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    
    /* This function prints all nodes of the linked list from head to tail.
        1. Start from the head node.
        2. While the current node is not null, print its data and move to the next node.
        */
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
            Node curr = list.head;
            while(curr != null){
                System.out.println(curr.data);
                curr = curr.next;
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