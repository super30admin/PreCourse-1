using System; 
  
// C# program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    internal class Node { 
  
        internal int data; 
        internal Node next; 
  
        // Constructor 
        public Node(int d) 
        { 
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newN = new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null)
        {
            list.head = newN;
        }
        
        // Else traverse till the last node 
        // and insert the new_node there 
        // Insert the new_node at last node 
        // Return the list by head 
        else{
        Node newN = new Node(data);
        Node lastNode = GetLastNode(list);    
        lastNode.next = newN; 
        } 
        
    } 
    public static Node GetLastNode(SingleLinkedList list) {  
    Node temp = list.head;  
    while (temp.next != null) {  
        temp = temp.next;  
    }  
    return temp;  
}  
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   Node n = list.head;
   while(n!=null){
       Console.WriteLine(n.data+" ");
       n=n.next;
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