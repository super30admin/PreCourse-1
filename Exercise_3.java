import java.io.*;

// Java program to implement 
// a Singly Linked List 
public class LinkedList {

     Node head; // head of list
     Node tail;
     int size;
    public  LinkedList(){
        this.size=0;
    }
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
            //Write your code here 
        }

    }

    // Method to insert a new node 
    public  LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data 
            Node node = new Node(data);
            node.next=head;
            head = node;
            if(tail==null){
                 tail=head;
            }
                size+=1;
        // If the Linked List is empty, 
        // then make the new node as head 

        // Else traverse till the last node
        // and insert the new_node there

        // Insert the new_node at last node
        // Return the list by head

        return list;
    }

    // Method to print the LinkedList. 
    public  void printList(LinkedList list)
    {
        // Traverse through the LinkedList 
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
    }
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
        list.insert(list, 1);
        list.insert(list, 2);
        list.insert(list, 3);
        list.insert(list, 4);
        list.insert(list, 5);

        // Print the LinkedList 
        list.printList(list);
    }
}