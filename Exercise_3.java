// Time Complexity : Insert: O(n)
// Space Complexity : O(n)
// Problems faced: I was not familiar with the singly linked list
//implementation and hence had to look online for some help


import java.io.*; 
  

public class LinkedList { 
  
    Node head; // head of list 
  
     
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
  
    
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node temp = new Node(data);
    	temp.next = null;

    	if(list.head==null) {
    		list.head = temp;
    	}

    	else {
    		Node cur = list.head;
    		while(cur.next!=null) {
    			cur = cur.next;
    		}
    		
    		cur.next = temp;
    	}
    	
    	return list; 
        
    } 
  
     
    public static void printList(LinkedList list) 
    {  
        Node cur = list.head;
    	
        while(cur!=null) {
    		
    		System.out.print(cur.data + " "); 
    		cur = cur.next;
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