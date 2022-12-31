// Time Complexity : insert(),print() -> O(n)
// Space Complexity : O(1)

// To insert an element in a Linkedlist, we traverse the list and append the element to the end
// To print elements elements, we traverse the list and print the value of each element

public class LinkedListImpl { 
  
    static Node head; // head of list 
  
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            data = d;
            next = null;
        } 
    } 
    LinkedListImpl(){
        head = null;
    }
  
    // Method to insert a new node 
    public static LinkedListImpl insert(LinkedListImpl list, int data) 
    { 
        Node newNode = new Node(data);
 
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head==null)
        { 
            list.head = newNode;
        }
        else{
        // Else traverse till the last node 
        // and insert the new_node there 
        Node cur = list.head;
        while(cur.next!=null){
            cur = cur.next;
        }

        // Insert the new_node at last node 
        cur.next = newNode;
        }
        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedListImpl list) 
    {  
        // Traverse through the LinkedList 
        Node cur = list.head;
        while(cur!=null){
            System.out.print(cur.data+"\t"); // Print the data at current node 
            cur = cur.next; // Go to next node 
        }
        return;
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedListImpl list = new LinkedListImpl(); 
  
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
