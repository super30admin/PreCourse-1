// Time Complexity : O(N) for insert and print because we're looping through n elements
// Space Complexity : O(N) - N is the number of elements in the linkedlist
// Did this code successfully run on Leetcode : No corresponding leetcode problem
// Any problem you faced while coding this : No
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
            this.data = d;
            this.next = null;
            //Write your code here 
        }
    }

    public LinkedList() {
        this.head = null;
    }

    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node newNode = new Node(data);
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return list;

    }

    // Method to print the LinkedList. 
    public static void printList(LinkedList list) {
        if (list.head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = list.head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    // Driver code 
    public static void main(String[] args) {
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