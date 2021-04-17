// Time Complexity :    O(1)
// Space Complexity :   O(n) // Extra memory for creating head pointer to keep updating root
// Did this code successfully run on Leetcode : Did not find on leetcode
// Any problem you faced while coding this : No
public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.data=data; //Initializing constructor
        }
    }


    public boolean isEmpty()
    {
        return root==null; // if root is null it returns true else false
    }

    public void push(int data)
    {
        StackNode head = new StackNode(data);
        head.next=root;                      // Keep inserting element at the beginning of the linked list so that you can remove
        root=head;                              // root element which makes it LIFO like a stack
    }

    public int pop()
    {

        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(root==null){                            // Since latest element is at the beginning of linkedlist and if it is null,
            System.out.println("Stack Underflow");  // it indicates there are no elements and return 0;
            return 0;
        }

        int element=root.data;                  // Return root element which is the element to be removed.

        root=root.next;                         // Increment root to point to next element which soft deletes the element at that position

        return element;

    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.

        return root.data;           // return root element as its the latest entry into linkedlist
    }

    //Driver code
    public static void main(String[] args)
    {

        com.company.StackAsLinkedList sll = new com.company.StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
    }
}

