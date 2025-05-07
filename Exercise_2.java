class LinkedList {

    StackNode root;

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
    } // time : O(1)

    public void push(int data)
    {
        //Write code to push data to the stack.
        if(root == null){
            root = new StackNode(data);
        } else {
            StackNode temp = root;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new StackNode(data);
        }

    } // time : O(n)

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }

        StackNode temp = root;

        int ret;

        while(temp.next != null && temp.next.next != null){
            temp = temp.next;
        }

        if(temp.next != null) {
            ret = temp.next.data;

            temp.next = null;


        } else {
            ret = temp.data;

            root = null;


        }
        return  ret;
    } // time :  O(n)

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(root == null){
            System.out.println("Stack is Empty");
            return 0;
        }

        StackNode temp = root;
        while(temp.next != null){
            temp = temp.next;
        }

        return temp.data;

    } //time : O(n)

    //Driver code
    public static void main(String[] args)
    {

        LinkedList sll = new LinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);
        sll.push(40);
        sll.push(50);
        sll.push(60);

        System.out.println("Is Stack Empty? " + sll.isEmpty());

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());


        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());

        System.out.println(sll.pop() + " popped from stack");


    }
}