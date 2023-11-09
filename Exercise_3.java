// Time Complexity :O(n) because it traverses the entire linked list
// Space Complexity :O(1) because the size of the linked list
// does not affect the amount of memory required to store the new node.
// Did this code successfully run on Leetcode : I wasn't able to find this on leetcode.
// Any problem you faced while coding this : No.

import java.io.*;

// Java program to implement
// a Singly Linked List
class LinkedList {


    Node head,temp,temp1;
    public LinkedList(){
        this.head= new Node(0);
        this.temp=this.head;
        this.temp1=this.head;
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
            this.data=d;
            this.next=null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        // If the Linked List is empty,
        // then make the new node as head
        Node newNode= new Node(data);

        if(list.head.next==null) {
            list.head.next = newNode;
            list.temp.next = newNode;
        }

        // Else traverse till the last node
        // and insert the new_node there
        else{
            while(list.temp.next!=null){
                list.temp=list.temp.next;
            }
            list.temp.next=newNode;
        }
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList
        // Print the data at current node
        // Go to next node

            list.temp1=list.head.next;
            while (list.temp1!=null){
                System.out.println(list.temp1.data);
                list.temp1=list.temp1.next;
            }
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
        //Updating by adding new elements to the list
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
        System.out.println("------------------Updated List-----------------");
        printList(list);
    }
}
