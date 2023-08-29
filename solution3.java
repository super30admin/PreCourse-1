public class LinkedList {

  //time complexity O(N)
    Node head; // head of list

    static class Node {

        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data) {
        Node newN = new Node(data);

        if (list.head == null) {
            list.head = newN;
        } else {
            Node current = list.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newN;
        }

        return list;
    }

    public static void printList(LinkedList list) {
        Node current = list.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        printList(list);
    }
}
