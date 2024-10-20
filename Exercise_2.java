// Time Complexity :isEmpty: O(1)
//                  push: O(1)
//                  pop : O(1)
//                  peek: O(1)
// Space Complexity : O(n), (n is the number of items in the stack)
// Did this code successfully run on Leetcode : couldn't find it in leetcode
// Any problem you faced while coding this : nothing

class StackAsLinkedList {

    StackNode root;

    StackAsLinkedList(){
        this.root = null;
    }

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
        return (root==null);
    }

    public void push(int data)
    {
        StackNode newNode = new StackNode(data);
        //Write code to push data to the stack.
        if(newNode==null){
            System.out.println("Stack is Overflow");
        } else{
            newNode.next=root;
            root = newNode;
        }
    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack is Underflow");
            return 0;
        } else{
            //Write code to pop the topmost element of stack.
            //Also return the popped element
            StackNode temp = root;
            root=root.next;
            return temp.data;
        }
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack is Underflow");
            return 0;
        } else{
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
        sll.push(200);
        sll.push(300);

        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
