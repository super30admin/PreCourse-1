package com.Exercise3;

class Node{
    int data;
    Node next;

}
public class LinkedList {

    Node head;

    Node createNode(int data){
        Node temp = new Node();
        temp.data = data;
        temp.next = null;

        return temp;
    }
    Node insertAtHead(int data){

        if(head == null){
            Node temp = createNode(data);
            head = temp;
        }
        else{
            Node temp = createNode(data);
            temp.next = head;
            head = temp;
        }

        return head;
    }

    Node insertAtTail(int data){
        if(head == null){
            Node temp = createNode(data);
            head = temp;
        }

        else{
            Node cur = head;
            while(cur.next != null){
                cur = cur.next;
            }
            Node temp = createNode(data);
            cur.next = temp;

        }
        return null;
    }

    Node deleteAtStart(){

        Node temp = head;
        head = head.next;
        temp.next = null;

        return head;

    }

    Node deleteAtTail(){
        Node temp = head;
        Node cur = head;

        temp = temp.next;

        while(temp.next != null){
            temp = temp.next;
            cur = cur.next;
        }
        cur.next = null;
        temp = cur;
        return temp;
    }


    Node deleteElement(int val){
        Node temp = head;
        Node prev = head;

        if(head.data == val){
            head = head.next;
            System.out.println(temp.data);
            return head;
        }

        else{
            while(temp != null){
                if(temp.data == val){
                    System.out.println(temp.data);
                    prev.next = temp.next;
                    return head;
                }
                prev = temp;
                temp = temp.next;

            }
        }
        System.out.println("Element not found");
        return head;
    }
    void display(){
        System.out.println("Displaying the list");
        Node temp = head;
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }


    public static void main(String[] args) {

        System.out.println("Singly Linked List");
        LinkedList ll = new LinkedList();

        System.out.println("Insertion at head");
        ll.insertAtHead(2);
        ll.insertAtHead(4);
        ll.insertAtHead(6);
        ll.insertAtHead(8);
        ll.insertAtHead(10);

        ll.display();

        System.out.println("Insertion at tail");
        LinkedList nll = new LinkedList();

        nll.insertAtTail(10);
        nll.insertAtTail(20);
        nll.insertAtTail(30);
        nll.insertAtTail(40);
        nll.insertAtTail(50);

        nll.display();

        System.out.println("Delete at head List1");
        ll.deleteAtStart();
        ll.display();

        System.out.println("Delete at Tail List1");
        ll.deleteAtTail();
        ll.display();


        System.out.println("Delete at head List2");
        nll.deleteAtStart();
        nll.display();

        System.out.println("Delete at Tail List2");
        nll.deleteAtTail();
        nll.display();

        System.out.println("Delete node for given element");
        nll.deleteElement(20);
        nll.display();
        }


    }
