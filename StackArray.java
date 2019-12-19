package com.company;

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

    void peek(){
        if(top == -1){
            System.out.println("Stack underflow");
        }
        else if(top == MAX-1){
            System.out.println("Stack overflow");
        }
        else{

            System.out.println(arr[top]);
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

        System.out.println("Pushing elements to stack");
        sa.push(2);
        sa.push(4);
        sa.push(6);
        sa.push(8);
        sa.push(100);

        System.out.println(sa.pop());
        System.out.println(sa.pop());

        System.out.println("Is stack empty: "+sa.isEmpty());

    }
}
