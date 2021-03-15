import java.lang.*;
import java.util.*;
public class Exercise_2 {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data=data;
            this.next=null;
        }
    }

    Exercise_2(){
        this.root=null;
    }

    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        if(root==null){
            return true;
        }
        return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);
        if(isEmpty()) root=node;
        else{
            node.next = root;
            root = node;
        }
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        int value = root.data;
        root=root.next;
        return value;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(this.isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return root.data;
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
    }
}

/*
 *  Time Complexity: O(1) to push pop and peek for the stack as we keep the pointer to the top element. Here N is the number of elements.
 *  Space Complexity: O(N) to store all the element in the array.
 * 
 *  Did this code successfully run on Leetcode : Yes
 *  Any problem you faced while coding this : None
 * 
 *  Hold the pointer to the top element in the array with a variable and using that variable perform the basic operations like push pop and peek.
 */


