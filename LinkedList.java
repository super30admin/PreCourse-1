// Java program to implement
// a Singly Linked List
public class LinkedList {

    Node head; // head of list
    int length = 0;
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            this.data = d;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        Node temp = new Node(data);
        if(list.head == null)
            list.head = temp;
        else{
            Node curr = list.head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = temp;
        }
        list.length++;
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        if(list.length == 0)
            System.out.println("List is empty, nothing to display");
        else{
            Node curr = list.head;
            while(curr != null){
                System.out.println(curr.data);
                curr= curr.next;
            }
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