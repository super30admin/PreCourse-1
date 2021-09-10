// Time Complexity : O(1)
// Space Complexity : O(n)
import java.io.*; 
  
public class LinkedList { 
  
    Node head;
  

    static class Node { 
  
        int data; 
        Node next; 
  
       /*
        *  intialized node for linked list
        */
        Node(int d) 
        { 
        	this.data = d;
        	this.next = null;
        } 
    } 
  
    /*
     * checking if head of linked list is null then new node will be head otherwise
     * traverse to last node of linkedlist and add newly created node after that
     */
    public static LinkedList insert(LinkedList list, int data) 
    { 

    	
    	Node node = new Node(data);
    	
    	if (list.head == null) {
    		list.head =  node;
    		list.head.next = null;
    		return list;
    	} else {
    		Node temp = list.head;
    		while(temp.next != null) {
    			temp = temp.next;
    		}
    		temp.next = node;
    		return list;
    	}
  
        
    } 
  
    /*
     * traverse through linkedlist and printing it's value 
     */
    public static void printList(LinkedList list) 
    {  
    	Node temp=list.head;
    	while(temp != null) {
    		System.out.println(temp.data);
    		temp = temp.next;
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
        list = insert(list, 8); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}