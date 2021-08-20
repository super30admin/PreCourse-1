// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :  no


// Your code here along with comments explaining your approach

import java.io.*;

public class StackAsLinkedList { 
  
    StackNode root; //initialising a root node
    int popped; //initialising popped variable

    static class StackNode {
        int data;     //data of the node
        StackNode next;  //next pointer

        StackNode(int data)  // intialising a data structure
        {
            //Constructor here
            this.data = data; 
            this.next = null;
        }
    }

    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return root == null;  //checking whether the stack is empty by asserting root and null
    }

    public void push(int data) {
        //Write code to push data to the stack.
        StackNode x = new StackNode(data);  // initialising the node
        if (isEmpty()) { //if the stack is empty make the new node as root
            root = x;
        } else { // or else assign root to temp, assign new node to root and assign newnode.next to temp
            StackNode temp = root;
            root = x;
            x.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(isEmpty()) // checking if the stack empty. If true just return 0
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else // or else assigning the popped element to popped and assigning root.next to root
        {
            popped = root.data;
            root = root.next;
        }
        return popped; //returning the popped element
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(isEmpty())  //checking whether the stack is empty and returning -1 if true
        {
            System.out.println("empty stack");
            return -1;
        }
        else {  //or else returning the topmost root data
            return root.data;
        }
    }
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
