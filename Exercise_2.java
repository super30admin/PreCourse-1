public class Exercise_2 {

    // Time Complexity:
    // isEmpty() -> O(1)
    // push()    -> O(1)
    // pop()     -> O(1)
    // peek()    -> O(1)
    //
    // Space Complexity:
    // O(n)

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int popped = root.data;
        root = root.next;
        return popped;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }

        return root.data;
    }

    public static void main(String[] args) {
        Exercise_2 sll = new Exercise_2();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
    }
}