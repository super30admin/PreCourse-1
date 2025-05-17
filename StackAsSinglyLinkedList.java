public class StackAsSinglyLinkedList {
    Node head; // head of list

    // Node class
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node at the end (similar to enqueue or stack push bottom)
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }
    // Pop: remove and return data from the top of stack
    public int pop() {
        if (head == null) {
            System.out.println("Stack Underflow");
            return -1; // or throw exception
        }
        int popped = head.data;
        head = head.next;
        return popped;
    }

    // Peek: return the top element without removing
    public int peek() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }
    // Method to print the linked list
    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        StackAsSinglyLinkedList stack = new StackAsSinglyLinkedList();

        // Insert the values
        stack.insert(1);
        stack.insert(2);
        stack.insert(3);
        stack.printList();
        System.out.println("Popped: " + stack.pop());
        stack.printList();

        System.out.println("Top of stack: " + stack.peek());
        stack.printList();
    }
}