public class LinkedList {

    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) 
    {
        // Create a new node with given data
        Node newNode = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) 
        {
            list.head = newNode;
        }  
      
         else 
       {
            // Else traverse till the last node
            // and insert the new_node there
            Node lastNode = list.head;
            while (lastNode.next != null) 
            {
                lastNode = lastNode.next;
            }

            // Insert the new_node at last node
            lastNode.next = newNode;
        }
        // Return the updated list
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) 
    {
        Node currentNode = list.head;

        // Traverse through the LinkedList
        while (currentNode != null) 
        {
            // Print the data at the current node
            System.out.print(currentNode.data + " ");

            // Go to the next node
            currentNode = currentNode.next;
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
