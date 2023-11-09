// Time Complexity :    O(n) //inser, print
// Space Complexity :   O(1)
//  Yes, It's run successfully
// No I don't face any problem.



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
        Node(int d) {
            //Write your code here
            this.data = d;                                          //initialize Node
            this.next = null;
        }
    }

    LinkedList() {
        head = null;
    }                                   //initialize LinkedList


    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node newNode = new Node(data);                              //create new node

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {                                    //check if LinkedList is empty
            list.head = newNode;
        } else {

            // Else traverse till the last node
            // and insert the new_node there

            Node poiner = list.head;

            while (poiner.next != null) {                           //if linkedlist is not empty then traverse linkedlist to the end and add a node
                poiner = poiner.next;
            }

            // Insert the new_node at last node
            poiner.next = newNode;

        }
        // Return the list by head
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList
        if(list.head ==  null)                                      //check if list is empty
        {
            System.out.println("LinkedList is Empty");
        }
        else {

            Node pointer = list.head;
            while (pointer.next != null) {                          //if not empty then traverse the node and print the LinkedList

                // Print the data at current node
                System.out.println(pointer.data);

                // Go to next node
                pointer = pointer.next;

            }
            System.out.println(pointer.data);
        }
    }
}
public class Exercise_3 {

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = LinkedList.insert(list, 1);
        list = LinkedList.insert(list, 2);
        list = LinkedList.insert(list, 3);
        list = LinkedList.insert(list, 4);
        list = LinkedList.insert(list, 5);

        // Print the LinkedList
        LinkedList.printList(list);
    }
}