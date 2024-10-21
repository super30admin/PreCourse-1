// a Singly Linked List 
//Time and Space Complexity:O(n)
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
        {  this.data=d;
           next=null;

            //Write your code here 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    {   Node newNode=new Node(data);

        if(list.head==null){
            
            list.head=newNode;
        }
        else{
            Node temp=list.head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
            
        }
        return list;
        // Create a new node with given data 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        if(list.head==null)
        {
            System.out.println("list is empty");
        }
        else{
        Node temp=list.head;
        while(temp!=null)
        {   
            System.out.println(temp.data);
            temp=temp.next;
        }}
            // Print the data at current node 
       
            // Go to next node 
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