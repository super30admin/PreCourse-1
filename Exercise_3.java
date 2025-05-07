// Java program to implement
// a Singly Linked List 
class SinglyLinkedList {

    static Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            this.data = d;
            this.next = null;
            //Write your code here
        }
    }

    // Method to insert a new node
    public static SinglyLinkedList insert(SinglyLinkedList list, int data)
    {
        // Create a new node with given data

        // If the Linked List is empty,
        // then make the new node as head

        // Else traverse till the last node
        // and insert the new_node there

        // Insert the new_node at last node
        // Return the list by head

        if(list == null || head == null){
            head = new Node(data);
        } else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }


            temp.next = new Node(data);
        }

        return list;
    } //time : O(n)

    // Method to print the LinkedList.
    public static void printList(SinglyLinkedList list)
    {
        // Traverse through the LinkedList

        // Print the data at current node
        System.out.println("Printing List");
        // Go to next node
        if(list == null){
            System.out.println("List is Empty");
        } else{
            Node temp = head;

            while(temp.next != null){
                System.out.println(" " + temp.data);
                temp = temp.next;
            }

            System.out.println(" " + temp.data);


        }
    } //time : O(n)


    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        SinglyLinkedList list = new SinglyLinkedList();
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