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
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data)
    { 
        // Create a new node with given data
        Node node = new Node(data);
   
        // If the Linked List is empty,
        if(list.head == null){
            // then make the new node as head
            list.head = node;
            return list;
        }else{
            // Else traverse till the last node
            Node tmpNode = list.head;
            while(tmpNode.next != null){
                tmpNode = tmpNode.next;
            }
            // and insert the new_node there
            tmpNode.next = node;
            return list;
        }
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list)
    {  
        // Traverse through the LinkedList
        Node node = list.head;
        while(node != null){
            System.out.println(node.data);
            node = node.next;
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

// Time Complexity : insert O(n) print O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Not attempted
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// Iterate through the list and add node at the end.
