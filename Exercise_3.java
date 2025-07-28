
// Time Complexity : O(N) for insertion and printing, O(1) for accessing head
// Space Complexity : O(N) where N is the number of elements in the linked list


import java.io.*; 
  
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
            data=d;
        } 
    } 
  
    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) 
    { 
        // Create a new node with given data 
        Node nn=new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head==null)
            list.head=nn;
        else{
            // Else traverse till the last node 
            // and insert the new_node there 
            Node temp=list.head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=nn;
        }
        // Return the list by head
        return list;
    }

    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
        // Traverse through the LinkedList
        Node temp=list.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
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