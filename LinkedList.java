// Time Complexity : insert O(n) print O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : not tried
// Any problem you faced while coding this : no

// Java program to implement 
// a Singly Linked List 
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
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 

    	Node node = new Node(data);
    	if(list.head == null) {
    		list.head = node;
    		return list;
    	}else {
    		Node tmp = list.head;
    		while(tmp.next != null) {
    			tmp = tmp.next;
    		}
    		tmp.next = node;
    		return list;
    	}        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
    	Node node = list.head;
    	while(node != null) {
    		System.out.print(node.data + " ");
    		node = node.next;
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