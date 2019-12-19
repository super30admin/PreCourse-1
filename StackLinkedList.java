package com.company;

public class StackLinkedList {
    //top is equivalent to head
    Node top;

    StackLinkedList(){
        Node top = new Node();
    }

    boolean isEmpty(){
        if(top == null){
            return true;
        }
        else{
            return false;
        }
    }
    void peek(){
        if(top == null){
            System.out.println("Stack underflow");
        }
        else {
            Node temp = top;
            while(temp.next != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    void push(int data){
        /*if(top == null){
            System.out.println("Stack overflow");
            return;
        }*/
        //else{
            Node temp = new Node();
            temp.data = data;
            temp.next = top;
            top = temp;
        //}
    }

    int pop(){
        if(top == null){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            int res =  top.data;
            top = top.next;
            return res;
        }
    }

    public static void main(String[] args) {


        System.out.println("Stack implemented using LinkedList");
        StackLinkedList sll = new StackLinkedList();

        System.out.println("Is stack empty: "+sll.isEmpty());

        System.out.println("Pushing elements to stack");
        sll.push(2);
        sll.push(4);
        sll.push(6);
        sll.push(8);
        sll.push(10);

        System.out.println(sll.pop());
        System.out.println(sll.pop());

        System.out.println("Is stack empty: "+sll.isEmpty());
    }

}
