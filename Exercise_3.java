// Time Complexity :insert: O(n)
//                  printList: O(n)
// Space Complexity : O(n), (n is the number of items in the LinkedList)
// Did this code successfully run on Leetcode : couldnt find it in leetcode
// Any problem you faced while coding this : nothing



// Java program to implement
// a Singly Linked List
class LinkedList {

    Node head; // head of list

    LinkedList(){
        this.head= null;
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
            //Write your code here
            this.data=d;
            this.next=null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node newNode = new Node(data);
        // If the Linked List is empty,
        if(list.head==null){
            // then make the new node as head
            list.head = newNode;
        } else {
            // Else traverse till the last node and insert the new_node there
            Node current = list.head;
            while(current.next!=null){
                current=current.next;
            }
            // Insert the new_node at last node
            current.next=newNode;
        }
        return list;
    }


    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList
            if(list.head == null){
                System.out.println("LinkedList is empty");
            } else{
                Node curr = list.head;
                while(curr.next!=null){
                    // Print the data at current node
                    System.out.print(curr.data+"-->");
                    // Go to next node
                    curr=curr.next;
                }
                System.out.print("null");
            }
    }


    public static LinkedList delete(LinkedList list, int data)
    {
        // If the Linked List is empty,
        if(list.head==null){
            // then make the new node as head
            System.out.print("linked list is empty");
        } else {
            // Else traverse till the last node and insert the new_node there
            Node current = list.head;
            Node previous = list.head;
            while(current.data!=data){
                previous = current;
                current=current.next;
            }
            // Insert the new_node at last node
            previous.next = current.next;
        }
        return list;
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

        list = delete(list,1);

        printList(list);
    }
}