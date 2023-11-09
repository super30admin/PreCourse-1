import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
 class Exercise_3 { 
  
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
            this.data=d;
            this.next=null;
        } 
    } 
  
    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) 
    { 
        // Create a new node with given data 
        Node newnode=new Node(data);
        Node temp=head;

        // If the Linked List is empty, 
        // then make the new node as head 
        if(head==null)
            head=newnode;
         
        
            // Else traverse till the last node 
            else{

                while(temp.next!=null)
                    temp=temp.next;
            
            // and insert the new_node there 
                temp.next=newnode;
            }
            // Insert the new_node at last node 
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
        if(head==null)
        System.out.println("Empty list");
        Node temp=head;
        while(temp!=null){
                    System.out.println(temp.data);
                    temp=temp.next;
        }
            // Go to next node 
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