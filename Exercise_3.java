// Time Complexity : O(N) for insert, O(N) for printlist
// Space Complexity : O(N) where N is number of elements in the list

// Java program to implement
// a Singly Linked List
public class LinkedList1 {

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
        }
    }

    // Method to insert a new node
    public static LinkedList1 insert(LinkedList1 list, int data)
    {
        // Create a new node with given data

        Node newNode = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if(list.head ==null){
            list.head= newNode;
        }else{
            Node temp = list.head;

            while(temp.next !=null){
                temp = getNext(temp);
            }
            temp.next = newNode;

        }

        // Else traverse till the last node
        // and insert the new_node there

        // Insert the new_node at last node
        // Return the list by head
        return list;
    }

    static Node  getNext(Node node){
        return node.next;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList1 list)
    {
        // Traverse through the LinkedList
        Node current = list.head;

        while(current !=null){

            System.out.println(current.data);
            current = getNext(current);
            // Print the data at current node
        };

        // Go to next node
    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList1 list = new LinkedList1();

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