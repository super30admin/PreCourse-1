import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class Exercise_3 { 
  
    static Node head; // head of list 

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
	     	data = d;
	     	next = null;
	     } 
	 }

    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) { 
        // Create a new node with given data 
        // If the Linked List is empty, 
        // then make the new node as head 
//    	if(head!=null) { System.out.println("head: " + head.data);}
    	Node lastNode = new Node(data);
    	lastNode.next = null;
        if(list.head == null) {
        	list.head = lastNode;
        }else { /*SPEND TOO MUCH TIME FIGURING OUT WHY TO USE ELSE*/      	
        	/*WHY USING LIST.HEAD and not just HEAD??*/       	
            // Else traverse till the last node and insert the new_node there 
        	Node curr = list.head;
        	while(curr.next!=null) {
        		curr = curr.next;
        	}
            curr.next = lastNode; // Insert the new_node at last node 
        }
            
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
        // Traverse through the LinkedList
    	/*WHY LIST.HEAD????*/
    	Node printFromHead = list.head;
    	
    	while(printFromHead!=null) {
    		System.out.print(printFromHead.data  + " ");
    		printFromHead = printFromHead.next;
    	}
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
    	Exercise_3 list = new Exercise_3(); 
  
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