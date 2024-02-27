  
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
            data = d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null){
            list.head = new_node;
        }
        
            // Else traverse till the last node 
            // and insert the new_node there 
            else{
                Node last = list.head;
                while(last.next != null){
                    last = last.next;
                }
                last.next = new_node;
            }

            // Insert the new_node at last node 
            
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node currentNode = list.head;
        // Traverse through the LinkedList 
        while(currentNode != null){
            // Print the data at current node 
            System.out.print(currentNode.data+" ");
            // Go to next node 
            currentNode = currentNode.next;
        }      
    } 
}
    // Driver code 
    class Exercise_3{
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = LinkedList.insert(list, 1); 
        list = LinkedList.insert(list, 2); 
        list = LinkedList.insert(list, 3); 
        list = LinkedList.insert(list, 4); 
        list = LinkedList.insert(list, 5); 
  
        // Print the LinkedList 
        LinkedList.printList(list); 
    } 
}
