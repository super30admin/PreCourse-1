class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.data = data;
            next = null;
            //Constructor here 
        }
    }


    public boolean isEmpty()
    // Time Complexity : 0(1)
    {
        if (root == null) {
            return true;
        }
        return false;
        //Write your code here for the condition if stack is empty. 
    }

    public void push(int data)
    // Time Complexity : 0(1)
    // Space Complexity : 0(1)
    {
        StackNode newNode = new StackNode(data);
        if (root == null) {
            root = newNode;
        } else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }

        //Write code to push data to the stack. 
    }

    public int pop()
    // Time Complexity : 0(1)
    // Space Complexity : 0(1)
    {
        if (root == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        int rootData = root.data;
        root = root.next;
        return rootData;
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
    }

    public int peek() {
        // Time Complexity : 0(1)
        if (root == null) {
            return 0;
        } else {
            return root.data;
        }
        //Write code to just return the topmost element without removing it.
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
