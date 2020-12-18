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
            //Initializes data and next for a node
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        //Time Complexity: O(1) if there is no node or the last node is known, O(N) if there are N nodes in the list and
        //we need to traverse to read the last node to append the new node

        // Creates a new node with given data 
        Node newNode = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head
        
        if(list.head == null)
        {
            list.head = newNode;
        }  
        else
        {
        Node tempNode = list.head;
        while(tempNode.next != null)
            tempNode = tempNode.next;
        tempNode.next = newNode;
        }
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        //Time Complexity: O(N) where N is the number of nodes in the list

        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
        
        Node tempNode = list.head;
        while(tempNode.next != null){
            System.out.println(tempNode.data);
            tempNode = tempNode.next;          
        }
        System.out.println(tempNode.data);
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