// Time Complexity : All operations are O(1)
// Space Complexity : O(n) where n is the size of the stack
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

public class Exercise_2 {

    StackNode root;
    StackNode top;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            next = null;
        }
    }

    public Exercise_2() {
        top = null;
    }

    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        return top == null ? true : false;
    }

    public void push(int data) {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int delNode = top.data;
        top = top.next;
        return delNode;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return top.data;
    }

    //Driver code
    public static void main(String[] args) {

        Exercise_2 sll = new Exercise_2();
        sll.peek();
        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
} 
