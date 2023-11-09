//Exercise_3 : Implement Singly Linked List.
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
  
// Java program to implement a Singly Linked List 
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
            data=d;
            next=null;
        } 
    } 
  
    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) 
    { 
        // Create a new node with given data 
        Node newNode=new Node(data);
        newNode.next=null;
        // If the Linked List is empty, then make the new node as head 
        if(list.head ==null){
            list.head=newNode;
        }else{ // Else traverse till the last node and insert the new_node there 
            Node last=head;
            while(last.next!=null){
                last=last.next;
            }
            // Insert the new_node at last node 
            last.next=newNode;
        }
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
        Node curNode=head;
        System.out.println("Linked List: ");
        // Traverse through the LinkedList 
        while(curNode!=null){
            // Print the data at current node 
            System.out.println(curNode.data + " ");
            // Go to next node 
            curNode=curNode.next;
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