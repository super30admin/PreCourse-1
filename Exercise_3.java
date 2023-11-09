/**
// Time Complexity :
insertInFront - O(1)
insertAtTheEnd, insertBefore or After the node with given data - O(n) where n is the number of nodes in the list for insertAtTheEnd,
n is the number of nodes need to be visited to reach to the given data in the case of insert before or after the given data.


// Space Complexity :
Total space complexity = Auxilary space + space used towards input.
O(n) - where n is the number of nodes in linkedlist.

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// a Singly Linked List
**/
class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) 
        { 
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    {
        if (list == null)
        {
            list = new LinkedList();
        }
        
        Node nodeToInsert = new Node(data);
        
        if (list.head == null)
        {
            list.head = nodeToInsert;
            return list;
        }
        
        Node current = list.head;
        
        while (current.next != null)
        {
            current = current.next;
        }
        
        current.next = nodeToInsert;
        return list;      
    } 
    
    /**
    
    // Assumption - Node with afterGivenData value is exist in the list and list is not null or empty.
    
    **/
    public static LinkedList insertAfterTheNodeWithGivenValue(int newData, LinkedList list, int afterGivenData)
    {
        Node nodeToInsert = new Node(newData);
        Node current = list.head;
        
        while (current != null)
        {
            if (current.data == afterGivenData)
            {
                Node temp = current.next;
                current.next = nodeToInsert;
                nodeToInsert.next = temp;
                break;
            }
            
            current = current.next;
        }
        
        return list;
    }
    
    /**
    
    // Assumption - Node with beforeGivenData value is exist in the list and list is not null or empty.
    
    **/
    public static LinkedList insertBeforeTheNodeWithGivenValue(int newData, LinkedList list, int beforeGivenData)
    {
        Node nodeToInsert = new Node(newData);
        Node current = list.head;
        
        // If we need to insert in the beginning.
        if (current.data == beforeGivenData)
        {
            nodeToInsert.next = current;
            list.head = nodeToInsert;
            return list;
        }
        
        
        while(current.next != null)
        {
            if (current.next.data == beforeGivenData)
            {
                Node temp = current.next;
                current.next = nodeToInsert;
                nodeToInsert.next = temp;
                break;
            }
            
            current = current.next;
        }
        
        return list;
    }
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        if (list == null || list.head == null)
        {
            System.out.println("List is null or empty");
        }
        
        Node current = list.head;
        while (current != null)
        {
            System.out.println(current.data);
            current = current.next;
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
		
		list = insertAfterTheNodeWithGivenValue(7, list, 3);
		list = insertBeforeTheNodeWithGivenValue(8, list, 4);
		
        // Print the LinkedList 
        printList(list); 
    } 
}