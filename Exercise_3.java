// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

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
            //Write your code here
            data=d;
            next=null; 
            
        } 
    } 
  
    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);

        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null){
            list.head = newNode;
        }

         // Else traverse till the last node 
            // and insert the new_node there 
        else{
            Node last = list.head;
            while(last.next!=null){
                last=last.next;
            }
            // Insert the new_node at last node 
            last.next = newNode;
        }
        // Return the list by head 
        return list;
        

            
        
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
        // Traverse through the LinkedList 
        Node currNode=list.head;
        System.out.print("Train status:");
        while(currNode!=null){
            // Print the data at current node 
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        // Go to next node 
        System.out.println("null");
   
            
       
            
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