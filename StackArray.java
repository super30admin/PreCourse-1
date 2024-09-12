package com.Exercise1;

public class StackArray {

    int MAX = 1000;

    int arr[] = new int[MAX];

    int top;

    StackArray(){
        top = -1;
    }

    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }

    int peek(){

        if(top == -1){
            return -1;
        }
        else{
            return arr[top];
        }
    }

    void push(int data){
        if(top == MAX-1){
            System.out.println("Stack overflow");
            return;
        }
        else{
            arr[++top] = data;
        }
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        else{

            return arr[top--];

        }
    }

    public static void main(String[] args) {

        System.out.println("Stack implemented using Array");
        StackArray sa = new StackArray();

        System.out.println("Is stack empty: "+sa.isEmpty());
        System.out.println("Top:"+sa.peek());

        System.out.println("Pushing elements to the stack");
        sa.push(2);
        System.out.println("Top:"+sa.peek());
        sa.push(4);
        System.out.println("Top:"+sa.peek());
        sa.push(6);
        System.out.println("Top:"+sa.peek());
        sa.push(8);
        System.out.println("Top:"+sa.peek());
        sa.push(100);
        System.out.println("Top:"+sa.peek());

        System.out.println("After popping the elements:");
        System.out.println(sa.pop());
        System.out.println("Top:"+sa.peek());
        System.out.println(sa.pop());
        System.out.println("Top:"+sa.peek());

    }
}
