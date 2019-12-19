package com.company;

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
    Node insert(int data){

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

    void display(){
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

        ll.insert(2);
        ll.insert(4);
        ll.insert(6);
        ll.insert(8);
        ll.insert(10);

        ll.display();
    }

}
