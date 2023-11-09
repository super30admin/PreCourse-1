 // Time Complexity : O(1) for insert(),printList()
// Space Complexity : O(N)
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
            data=d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newnod = new Node(data);
        newnod.next = null;
         // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head==null){
            list.head = newnod;
        } 
        else {
          // Else traverse till the last node 
           
            Node last = list.head;
            while(last.next!=null){
             // and insert the new_node there 
            last = last.next;
            }
            // Insert the new_node at last node 
            last.next = newnod;
        }
        
        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
       Node net = list.head;
       while(net!=null){
            // Print the data at current node 
         System.out.print(net);
         // Go to next node 
         net = net.next;
         
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
