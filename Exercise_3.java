package StackUsingSinglyLL;

public class LinkedListMain {

	public static void main(String[] args) {
		{
	        SinglyLinkedList myLinkedlist = new SinglyLinkedList();
	        myLinkedlist.insertFirst(5);
	        myLinkedlist.insertFirst(6);
	        myLinkedlist.insertFirst(7);
	        myLinkedlist.insertFirst(1);
	        myLinkedlist.insertLast(2);
	        
	        Node node=new Node();
	        node.data=1;
	        myLinkedlist.deleteAfter(node);
	       
	        myLinkedlist.printLinkedList();
	    }
	}
}
package StackUsingSinglyLL;

class Node {

	public int data;
    public Node next;
 
    public void displayNodeData() {
        System.out.println("{ " + data + " } ");
    }
}
 
public class SinglyLinkedList {
    private Node head;
 
    public boolean isEmpty() {
        return (head == null);
    }
 
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
 
    public Node deleteFirst() {
        Node temp = head;
        head = head.next;
        return temp;
    }
 
    public void deleteAfter(Node after) {
        Node temp = head;
        while (temp.next != null && temp.data != after.data) {
            temp = temp.next;
        }
        if (temp.next != null)
            temp.next = temp.next.next;
    }
 
    public void insertLast(int data) {
        Node current = head;
        while (current.next != null) {
            current = current.next;  }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }
 
    public void printLinkedList() {
        System.out.println("Printing LinkedList (head --> last) ");
        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }
}
