import java.io.*;

/**
 * Java program to implement a Singly Linked List
 */
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
           data=d;
           next=null;
        }
    }

    /**
     * Method to insert a new node in the linkedlist
     * @param list
     * @param data
     * @return
     *
     */
     //Time Complexity:o(n) where n is linkedlist size
     //Space complexity:o(1): as I am just adding one new node at the end
    public static LinkedList insert(LinkedList list, int data)
    {
        Node node=new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
            if(list.head==null){
                list.head=node;
            }
            //traverse till the last node and insert the new_node there
            else{
                Node curr=list.head;
                while(curr.next!=null){
                    curr=curr.next;
                }
                curr.next=node;
            }
        return list;
    }

    /**
     * Method to print the LinkedList.
     */

    //Time Complexity:o(n): As I am visting each node once
    // Space complexity:o(1): as I am just printing the value, not storing anything
    public static void printList(LinkedList list)
    {
       Node curr=list.head;
       while(curr!=null){
           System.out.print(curr.data+" ");
           curr=curr.next;
       }
    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

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