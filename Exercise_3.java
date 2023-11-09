// Java program to implement
// a Singly Linked List
 class LinkedList {

    static Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(LinkedList list, int d)
        {
            //Write your code here
            this.data =d;
            this.next=null;
        }
    }

    // Method to insert a new node
    public static Node insert(LinkedList list, int data)
    {
        // Create a new node with given data

        Node newNode = new Node(list,data);

        // If the Linked List is empty,
        // then make the new node as head
        if(list.head == null)
        {
           list.head=newNode;
        }
        else
        {
            Node last = list.head;
            while (last.next!=null)
            {
                last = last.next;
            }
            last.next=newNode;
        }

            // Else traverse till the last node
            // and insert the new_node there


            // Insert the new_node at last node
        // Return the list by head
       return list.head;

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList
        Node currNode= list.head;
        while(currNode!= null)
        {
            System.out.println(currNode.data);
           currNode=currNode.next;

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