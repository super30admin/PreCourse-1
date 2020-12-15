/**
 * Time Complexity: Push = O(1), Pop = O(1); 
 * Space Complexity = Push = O(1), Pop = O(1)
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
        return (root == null);
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
    }

    public int pop() {
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }

        int poppedValue = root.data;
        root = root.next;
        return poppedValue;

    }

    public int peek() {
        return root.data;
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
