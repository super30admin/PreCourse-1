/*

Time Complexity:   As push, pop, peek and isEmpty is checking just one time and
 we are not using any loop so it's time complexity is Big O(1).

Space Complexity:  AS we ae not declare any fixed size space complexity will be number of elements in the linkedlist.
Big O(n).
*/

public class Exercise_2 {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {

            this.data = data;

        }
    }

    public boolean isEmpty() {

        if (root == null) {

            return true;
        }
        return false;

    }

    public void push(int data) {

        StackNode node = new StackNode(data);
        if (root == null) {
            root = node;

        } else {

            StackNode prev = root;
            root = node;
            node.next = prev;
        }

        System.out.println(data + " has pushed into stack");

    }

    public int pop() {
        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element

        int pop = 0;
        if (root == null) {

            System.out.println("Stack Underflow");

        }

        else {

            pop = root.data;
            root = root.next;

        }

        return pop;

    }

    public int peek() {
        if (root == null) {
            return 0;
        }
        return root.data;
        // Write code to just return the topmost element without removing it.
    }

    // Driver code
    public static void main(String[] args) {

        Exercise_2 sll = new Exercise_2();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
