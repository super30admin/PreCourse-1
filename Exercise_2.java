package com.company;

public class StackLinkedList {
    class Node
    {
        int key;
        Node next;

    }

    Node top;
    StackLinkedList()
    {
        this.top=null;
    }

    public boolean isEmpty()
    {
        return (top==null);
    }

    public void push(int x)
    {
        Node curr=new Node();
        if(curr==null)
        {
           System.out.println("Heap Overflow");
        }

        curr.key=x;
        curr.next=top;
        top=curr;
        System.out.println("Element pushed is"+ top.key);
        return;

    }

    public int peek()
    {
        if(!isEmpty()) {
            System.out.println("Element peeked is" + top.key);
            return top.key;
        }
        else
            return -1;
    }

    public int pop()
    {
        if(!isEmpty()) {
            int val= top.key;
            top=top.next;
            System.out.println("Element popped is"+ val);
            return val;
        }
        else{
            System.out.println("Empty Stack");
            return -1;
        }

    }

    public void printStack()
    {
        if(!isEmpty())
        {
           Node temp= new Node();
           temp=top;
           while(temp!=null)
           {
               System.out.print(temp.key+" ");
               temp=temp.next;
           }
        }
        else
            System.out.println("Empty Stack");

    }


    public static void main(String[] args) {
	    StackLinkedList s=new StackLinkedList();
	    s.push(10);
	    s.push(8);
	    s.push(12);
	    s.pop();
	    s.pop();
	    s.pop();
	    s.pop();
  
    }
}




