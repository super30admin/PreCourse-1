// Java program to implement 
// a Singly Linked List 
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
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        Node node = new Node(data);

        if(list.head == null){
            list.head = node;
        }
        else{
            Node temp = list.head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        Node temp = list.head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Driver code
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