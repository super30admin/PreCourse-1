// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : wasn't able to find it on leetcode
// Any problem you faced while coding this : yes, implementing list in a stack was bot trickier
//than I expected. The traversal here is inverse as compared to the singly linked list because of the
//LIFO(Last in first out) principle of stack.

class StackAsLinkedList { 
  
    StackNode root= new StackNode(0);

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


    public boolean isEmpty()
    {
        //checking for the condition if stack is empty.
        return root==null;
    }

    public void push(int data)
    {
        //Code to push data to the stack.
        StackNode newNode= new StackNode(data);
        newNode.next=root;
        root=newNode;
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Code to pop the topmost element of stack.
        //Also returning the popped element
        StackNode temp= new StackNode(0);
        temp=root;
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            return 0;
        }
        else{
            root=root.next;
            return temp.data;
        }
    }

    public int peek()
    {
        //Code to just return the topmost element without removing it.
        StackNode temp= new StackNode(0);
        temp=root;
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            return 0;
        }
        else{
            return temp.data;
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