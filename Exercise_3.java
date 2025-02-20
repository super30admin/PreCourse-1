// Time Complexity : O(n) where n is size of SLL as we need to iterate through the list to insert in the end or print them all
// Space Complexity : O(n) where n is size of SLL
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : None
// Code here along with comments explaining your approach
class LinkedList {

    Node head; // head of list
    /*
        Node class which has data of node and pointer to next
    */
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }

    /*
        Creates a new node
        If the list's head is null assigns it to the head
        If not loops through the list until last node is found
        Assigns last node's next pointer to newly created node
        @param : List and data of new node
        @return : Updated List
     */
    public static LinkedList insert(LinkedList list, int data)
    {
        Node node = new Node(data);
        if(list.head == null){
            list.head = node;
        } else {
            Node curr = list.head;
           while (curr.next!=null){
               curr = curr.next;
           }
           curr.next = node;
        }
        return list;
    }

    /*
       Loops through the entire list and prints each nodes data
       @param : List
       @return : None
    */
    public static void printList(LinkedList list)
    {
        Node curr = list.head;
        while (curr!=null){
            System.out.println("List node's data is "+ curr.data);
            curr = curr.next;
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