 //Exercise_3 : Implement Singly Linked List.
  

// Time Complexity :o(n) since we have used while loop to traverse the list

// Space Complexity :

// Your code here along with comments explaining your approach

//Linked list: every node in LL stores two values -data and ref of the next node
//Insert:create a new node everytime u add an element to list, set head to newnode if head is null
//if head is not null, create a variable to find the last element of the list through while untill condition current.next=null, then- link the new node to last element 
//Print: Traverse through the list and print each element until current is null 

public class Exercise_3 { 
  
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
        	data =d;
        	next=null;
        } 
    } 
  
    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) 
    { 
    	Node newnode = new Node(data);
        // Create a new node with given data 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
    	if(list.head==null)
    	{
    		list.head = newnode;
    		return list;
    	}
    	else {
    	Node current = list.head;
    	while(current.next!=null)
    	{
    		current = current.next;
    	}
       current.next=newnode;
       return list;
    	}
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
    	Node current = list.head;
    	while(current!=null) {
    		System.out.println(current.data);
    		current=current.next;
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