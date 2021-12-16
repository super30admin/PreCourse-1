package Precourse1;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Tested successfully on local code editor.
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
//I have initialized root as StackNode with data 0. temp points to the root.
//not changing the root and changing temp with each addition and deletion of node.

//to check if stack is empty, i check if root.next == null

//to push node to the stack, i create a new StackNode, point temp's next to the new node and
//change temp to point to the new node using temp = temp.next

//to pop element from the stack, first check if stack is not empty, assign temp.data to a variable del,
// and then iterate from the beginning of the list
//till prev of temp, make this as newTemp, assign temp to newTemp and put temp.next = null, deleting the top node

//to peek, check if the stack is not empty, return temp.data

public class Exercise_2 {

    StackNode root = new StackNode(0);
    StackNode temp = root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
            next = null;
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        if(root.next == null) {
            return true;
        }
        return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);
        temp.next = node;
        temp = temp.next;
    }

    public int pop()
    {
        //If Precourse1.Stack Empty Return 0 and print "Precourse1.Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(isEmpty()) {
            System.out.println("Precourse1.Stack Underflow");
        } else {
            int del = temp.data;
            StackNode newTemp = root;
            while(newTemp.next != temp) {
                newTemp = newTemp.next;
            }
            temp = newTemp;
            temp.next = null;
            return del;
        }
        return -1;
    }

    public int peek()
    {
        if(isEmpty()) {
            System.out.println("Precourse1.Stack Underflow");
        } else {
            return temp.data;
        }
        return -1;
        //Write code to just return the topmost element without removing it.
    }

    //Driver code
    public static void main(String[] args)
    {

        Exercise_2 sll = new Exercise_2();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " Popped from stack");
        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " Popped from stack");
        System.out.println("Top element is " + sll.peek());
        sll.push(40);
        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " Popped from stack");
        System.out.println("Top element is " + sll.peek());
    }
}
