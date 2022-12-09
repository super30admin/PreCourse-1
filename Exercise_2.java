//Time complexity - O(1)
//Space complexity - O(1)

public class StackUsingLL {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;
    }

    StackUsingLL()
    {
        //Constructor here
        this.root = null;
    }



    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        if (root == null)
            return true;
        else
            return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode temp = new StackNode();
        temp.data = data;
        temp.next = root;
        root = temp;
    }

    public int pop() {
        if (root != null) {
            int pop_value = root.data;
            root = root.next;
            return pop_value;
        }
            System.out.println("Stack Underflow");
            return -1;
    }

    public int peek()
    {
        if(!isEmpty()) {
            return root.data;
        }
        return -1;
    }

    //Driver code
    public static void main(String[] args)
    {

        StackUsingLL sll = new StackUsingLL();

        sll.push(10);
        sll.push(20);
        sll.push(30);
        sll.push(40);
        sll.push(11);
        System.out.println(sll.pop() + " popped from stack");
        sll.push(21);
        sll.push(31);
        sll.push(41);
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
    }
}
