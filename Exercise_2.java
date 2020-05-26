//Problem 2: Implement Stack using LinkedList

//Time Complexity : O(1) for each action, Insiertion, Deletion, Peek..
//Space Complexity : O(n) No of input elements to be pushed to stack
// Any problem you faced while coding this : No

public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return root == null ? true:false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode n = new StackNode(data);
        n.next = root;
        root = n;

    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = root.data;
        root = root.next;
        return val;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(isEmpty())
            return -1;

        return root.data;
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
