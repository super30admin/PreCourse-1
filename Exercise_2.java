public class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            data = data;
            next = null;

        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        if(root == null)
        {
            return true;
        }
        return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode temp = new StackNode(data);

        if (root == null){
            System.out.println("Here");
            root= temp;
        }

        while(root.next != null){
            System.out.println("Here2");
            root = root.next;
        }
        root.next = temp;

    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        StackNode temp = root;

        if (temp == null){
            System.out.println("Stack Underflow");
            return 0;
        }

        while(temp.next != null){
            if(temp.next.next == null){
                int tempData = temp.next.data;
                temp.next = null;
                return tempData;
            }
            temp =  temp.next;
        }
        return 0;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        StackNode temp = root;

        while(temp.next != null){
            if(temp.next.next == null){
                int tempData = temp.next.data;
                temp.next = null;
                return tempData;
            }
            temp =  temp.next;
        }
        return 0;
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
