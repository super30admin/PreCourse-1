package S30;

public class Exercise_2 {

//    Time and Space Complexities:
//    Push:
//        TC: O(1)
//        SC: O(n)
//    Pop:
//         TC: O(1)
//         SC: O(n)
//    Peek:
//         TC: O(1)
//         SC: O(n)

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.data = data;
        }
    }


    public boolean isEmpty()
    {
        return root == null;
    }

    public void push(int data)
    {
        StackNode temp = new StackNode(data);
        temp.data = data;
        temp.next = root;
        root = temp;
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int data = root.data;
        root = root.next;
        return data;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int data = root.data;
        return data;
    }

    //Driver code
    public static void main(String[] args)
    {

        Exercise_2 sll = new Exercise_2();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");


        System.out.println("Top element is " + sll.peek());
        System.out.println("Top element is " + sll.peek());
        System.out.println("Top element is " + sll.peek());

    }
}
