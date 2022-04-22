// TC - O(1) for push, pop and peek
// SC - O(n) where n - no of elements in list

package Stacks;

public class StackAsLinkedList {

    StackNode root;
    StackNode prev;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return root == null;
    }

    public void push(int data) {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        if (isEmpty()) {
            root = newNode;
            return;
        }

        if(root.next == null)
        {
            root.next = newNode;
            return;
        }
        prev = findTail(root);
        prev.next.next = newNode;
    }

    public StackNode findTail(StackNode root)
    {
        StackNode curr = root;
        StackNode prev = null;

        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        return prev;
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element

        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }

        if(root.next == null)
        {
            int rootVal = root.data;
            root = null;
            return rootVal;
        }

        prev = findTail(root);
        int currVal = prev.next.data;
        prev.next = prev.next.next;
        return currVal;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(isEmpty()) {
            System.out.println("No elements in stack");
            return 0;
        }
        prev = findTail(root);
        return prev.next.data;
    }

    public void print()
    {
        StackNode curr = root;

        while(curr != null)
        {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }

    //Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        sll.print();
        System.out.println("Top element is " + sll.peek());
        System.out.println(sll.pop() + " popped from stack");

        sll.print();
        System.out.println("Top element is " + sll.peek());
    }
}
