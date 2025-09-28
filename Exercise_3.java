// Time Complexity :
//    insert(): O(n)
//    printlist(): O(n)
//    delete(): O(n)

// Space Complexity : O(n)
import java.io.*;
  
// Java program to implement 
// a Singly Linked List 
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
        { 
            //Write your code here 
            data = d; 
            next = null; 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data
        Node new_node = new Node(data); 
        new_node.next = null; 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } else{
        
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            }   
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
        // Return the list by head 
        return list; 
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node currNode = list.head; 
  
        System.out.print("LinkedList: "); 
  
        // Traverse through the LinkedList 
        while (currNode != null) { 
        // Print the data at current node 
            System.out.print(currNode.data + " "); 
  
        // Go to next node 
            currNode = currNode.next; 
        } 
        System.out.println();
    }

    public static LinkedList delete(LinkedList list, int key) throws Exception {
    Node currNode = list.head, prev = null;

    // CASE 1: If head node has the key (data)
    if (currNode != null && currNode.data == key) {
        list.head = currNode.next; // Changed head
        System.out.println(key + " found and deleted");
        return list;
    }

    // CASE 2: Search for the key to be deleted
    while (currNode != null && currNode.data != key) {
        prev = currNode;
        currNode = currNode.next;
    }

    // If key was present, unlink it
    if (currNode != null) {
        prev.next = currNode.next;
        System.out.println(key + " found and deleted");
    }

    // CASE 3: The key was not present
    if (currNode == null) {
        throw new Exception(key + " not found");
    }

    return list;
}
   
    // Driver code 
    public static void main(String[] args) throws Exception
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
        try{
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list);
        }catch(Exception e){
            throw new Exception(e);
        }
    } 
}