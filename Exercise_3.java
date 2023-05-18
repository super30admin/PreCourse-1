import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
class Exercise_3 {
    // Time Complexity :
    //1. insert(): O(n) as insertion into a singly linked list at the end takes O(n) as you have to traverse till the end of the list
    //2. printList(): O(n) as as you have to traverse till the end of the linked List from the head to print the entire list
    // Space Complexity : O(n) where n is the number of elements in the Exercise_3
    // Did this code successfully run on Leetcode : N/A
    // Any problem you faced while coding this :
    // Your code here along with comments explaining your approach:
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
            this.data = d;
        } 
    } 
  
    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) 
    {
        // Create a new node with given data
        Node newNode = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if(list.head == null)
        {
            list.head = newNode;
        }
        // Else traverse till the last node
        // and insert the new_node there
        else
        {
            Node currentNode = list.head;
            while(currentNode.next != null)
            {
                currentNode = currentNode.next;
            }
            // Insert the new_node at last node
            currentNode.next = newNode;
        }
        return list;
    } 
  
    // Method to print the Exercise_3. 
    public static void printList(Exercise_3 list) 
    {
        if(list.head == null)
        {
            System.out.println("The Linked list is empty");
            return;
        }
        // Traverse through the Exercise_3
        Node currentNode = list.head;
        while(currentNode.next!= null)
        {
            // Print the data at current node
            System.out.println("Current Node data: " + currentNode.data);
            // Go to next node
            currentNode = currentNode.next;
        }
        // Print the data at the last node
        System.out.println("Current Node data: " + currentNode.data);

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

        // Print the Exercise_3 
        printList(list); 
    }
}