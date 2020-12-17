/*
stack using linkedlist:
*) approach: Have used 2 pointers to maintain head and tail of the list.
             Tail pointer is used as top of stack to push and pop element.

time complexity:
Push operation : O(1)
Pop operation : O(n), as we need to shift the tail pointer to previous node and in order to
                do that we need to traverse the linked list.
peek operation : O(1)

 */
class StackAsLinkedList {

    StackNode root;
    StackNode tail;

    static class StackNode {
        int data;
        StackNode next;
        StackNode tail;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;

        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        if (root == null){
            return true;
        }
        return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        if (isEmpty()){
            root = new StackNode(data);
            tail = root;
            return;
        }

        tail.next = new StackNode(data);
        tail = tail.next;
        return;
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }

        StackNode temp = root;
        while (temp.next.next != null){
            temp = temp.next;
        }
        int popped  = tail.data;
        tail = temp;
        temp.next = null;
        return popped;

    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }

      int peek = tail.data;
        return peek;
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