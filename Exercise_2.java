// Time Complexity : O(1) for push/pop/peek
// Space Complexity : O(1) for push/pop/peek
class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data=data;
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return root == null;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode temp = root;
        root = new StackNode(data);
        root.next = temp;
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(root==null){
            System.out.println("stack underflow");
            return 0;
        }
        StackNode temp = root;
        root = temp.next;

        return temp.data;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        return root.data;
    }


}

//Driver code
class Main{
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();
        System.out.println("pop " + sll.pop());
        System.out.println("is empty " + sll.isEmpty());
        sll.push(10);
        System.out.println("is empty " + sll.isEmpty());
        System.out.println("node: " + sll.root.data);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
