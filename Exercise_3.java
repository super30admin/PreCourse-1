// Java program to implement 
// a Singly Linked List 
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
            this.data=d;
            next = null; 
        } 
    } 

    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) 
    {
    	
        // Create a new node with given data 
    	Node newNode=new Node(data);
    	newNode.next=null;
   
        // If the Linked List is empty, 
        // then make the new node as head 
    	
        if (list.head==null){
        	list.head=newNode;
        }
        else{
        Node currNode=list.head;

        	while(currNode.next!=null){
        		currNode=currNode.next;
        }
        	currNode.next=newNode;
        }
			return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
    	if (list.head==null){
        	System.out.println("Empty");
        }
    	
        Node currNode=list.head;

        	while(currNode!=null){
        		System.out.println(currNode.data);
        		currNode=currNode.next;
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
        list = insert(list, 9); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
