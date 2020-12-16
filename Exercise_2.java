// Time Complexity : 0(1)
// Space Complexity :0(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this: None


// Your code here along with comments explaining your approach

public class Exercise_2 {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.data = data;
            this.next = null;
            //Constructor here
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return root.next == null;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode tempNode = new StackNode(data);
        tempNode.next = root;
        root = tempNode;
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element

        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int value = root.data;
            root = root.next;
            return value;
        }
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(!isEmpty()){
            return root.data;
        }
        return 0;
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
