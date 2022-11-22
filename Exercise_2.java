class StackAsLinkedList {

    StackNode top;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    StackAsLinkedList() {
        this.top = null;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public void push(int data)
    {
        StackNode tmp = new StackNode(data);

        if (tmp == null) {
            System.out.println("Heap Overflow");
            return;
        }

        tmp.next = top;
        top = tmp;
    }

    public int pop()
    {
        if (!isEmpty()) {
            StackNode tmp = top;
            top = top.next;
            return tmp.data;
        }
        else {
            System.out.println("Stack Underflow");
            return 0;
        }
    }

    public int peek()
    {
        return top.data;
    }

}

//Driver code
class Main_2 {
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}