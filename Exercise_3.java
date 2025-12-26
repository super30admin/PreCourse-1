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
        // Time complexity: O(n)
        // Space complexity: O(1)

        // Create a new node with given data
        Node node = new Node(data);

        // If the Linked List is empty,
        if(list.head == null){
            list.head = node;
            return list;
        }
        // then make the new node as head
        Node currentNode = list.head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = node;
        return list;

        // Else traverse till the last node
        // and insert the new_node there

        // Insert the new_node at last node
        // Return the list by head

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Time Complexity : O(n)
        // Space Complexity : O(1)

        // Traverse through the LinkedList
        if(list.head == null){
            System.out.println("***** List is empty  *****");
        }
        Node currentNode = list.head;
        while (currentNode != null) {
            // Print the data at current node
            System.out.println(currentNode.data);
            currentNode = currentNode.next;

            // Go to next node
        }
    }
}
public class Main{
    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //
        list.printList(list);
        // Insert the values
        list = list.insert(list, 1);
        list = list.insert(list, 2);
        list = list.insert(list, 3);
        list = list.insert(list, 4);
        list = list.insert(list, 5);

        // Print the LinkedList
        list.printList(list);
    }
}
