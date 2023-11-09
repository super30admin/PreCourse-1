//  time complexity  0(n)
// space complexity 0(n)
// getting difficulty in calculating space complexity

public class LinkedList {

    Node head = null;
// inserting into the linklist
    public static LinkedList insert(LinkedList list, int data) {
        // create a new node insert data and its address as null
        Node new_node = new Node(data);
        new_node.next = null;
// if head is null means the list is empty so make head point this node
        if (list.head == null) {
            list.head = new_node;
        }
        //if there are some nodes traverse the list and add at the last
        else {
            Node last = list.head;
            // move until last.next is null because this way we will move to the last node
            while (last.next != null) {
                last = last.next;
            }
            // when reached assign it as new_node
            last.next = new_node;

        }

        return list;

    }
// for printing the list
    public static void printList(LinkedList list) {
        // start from head
        Node temp = list.head;
        System.out.println("LinkedList is: ");
        // till it reaches the last node
        while (temp != null) {
            System.out.println(temp.data + " ");
            // increment to next node
            temp = temp.next;
        }


    }
// driver
    public static void main(String[] args) {

        LinkedList list = new LinkedList();


        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);


        printList(list);
    }
// creating Node
    static class Node {

        int data;
        Node next;

// constructor
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
}