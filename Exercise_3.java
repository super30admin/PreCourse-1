// Time Complexity : O(N) where N is size of the list
// Space Complexity : O(N) where N is size of the list
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class LinkedList { 
  
     Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        //initialize node with data 
        Node(int d) 
        { 
        	this.data=d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
    		Node node=new Node(data);
    		// If the Linked List is empty then make the new node as head 
    		if(list.head==null) {
    			list.head=node;
    			list.head.next=null;
    			return list;
    		}else {
    			//traverse till the last node and insert the new_node at the end 
    			Node curr=list.head;
    			while(curr.next!=null) {
    				curr=curr.next;
    			}
    			curr.next=node;
    			node.next=null;
    			return list;
    		}
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
      	Node curr=list.head;
        // Traverse through the LinkedList 
		while(curr!=null) {
			// Print the data at current node 
			System.out.print(curr.data+" ");
		    // move to next node 
			curr=curr.next;
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