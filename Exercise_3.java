import java.io.*;

// Time Complexity :
// isEmpty() - O(1)
// push() - O(1)
// pop() - O(n)
// peek() - O(1)

// Space Complexity :
// isEmpty() - O(1)
// push() - O(1)
// pop() - O(1)
// peek() - O(1)

// Java program to implement
// a Singly Linked List 
class LinkedList {
  
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
    public static LinkedList insert(LinkedList list, int data) 
    { 
        if(isListNull(list)){
            System.out.println("list is null");
            return null;
        }

        Node tempNode = new Node(data);

        if(list.head == null) {
            list.head = tempNode;
        }else{
            Node currentNode = list.head;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = tempNode;
        }
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        if(isListNull(list)){
            System.out.println("List is null");
            return;
        }
        Node currentNode = list.head;
        System.out.print("head -> ");
        while(currentNode.next != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println(" end");
    }

    private static boolean isListNull(LinkedList list) {
        return null == list;
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
