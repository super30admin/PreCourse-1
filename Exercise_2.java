public class stack_linkedlist {
    StackNode root;
    StackNode top=root;
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
        //Write your code here for the condition if stack is empty.
        if(top==null)
            return true;
        return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode curr=new StackNode(data);
        if(root==null)
        {
            root=curr;
            top=root;
        }
        else
        {
            top.next=curr;
            top=top.next;
        }
    }

    public int pop()
    {
        int pop_element;
        if(root==null)
        {
            pop_element=0;
            System.out.println("stack overflow");
        }
        else if(root==top)
        {
            pop_element=top.data;
            top=null;
            root=null;
        }
        else
        {
            pop_element=top.data;
            StackNode curr=root;
            while(curr.next!=null && curr.next!=top)
            {
                curr=curr.next;
            }
            curr.next=null;
            top=curr;
        }
        return pop_element;

        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(top==null) {
            System.out.println("Stack Overflow");
            return 0;
        }
        return top.data;
    }
    public static void main(String[] args) {
        stack_linkedlist sll = new stack_linkedlist();
        sll.push(10);
        sll.push(20);
        sll.push(30);
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
    }
}
