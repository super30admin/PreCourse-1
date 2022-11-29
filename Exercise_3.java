// Java program to implement
// a Singly Linked List
// Time complexity = O(n) 
// Space complexity = O(1)
// Executed the code and good right results

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
            //Write your code here
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data 
        Node new_node = new Node (data);

        if (list.head == null){     // If the Linked List is empty,
            list.head = new_node;   // then make the new node as head
        }
        else {
            Node last = list.head;
            while(last.next != null) {
                last = last.next;           // Else traverse till the last node
            }                                  // Return the list by head
            last.next = new_node;           // and insert the new_node there
        }
        return list;                        // Return the list by head
    }

    // Method to print the LinkedList. 
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList 
        Node Currnode = list.head;
        System.out.print("LinkedList: ");
        while (Currnode != null) {
            // Print the data at current node
            System.out.print(Currnode.data + " ");
            // Go to next node
            Currnode = Currnode.next;
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
    }
}
