//Time Complexity: for push, peek, isEmpty methods: O(1), for pop method: O(n) where n is current size of linkedlist
//Space Complexity: O(n) where n is size of linkedlist

class StackAsLinkedList {

    StackNode root;
    StackNode top;
    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public boolean isEmpty() {
        return null == root;
    }

    public void push(int data) {
        StackNode node = new StackNode(data);
        if (null == root) {
            root = node;
            top = node;
        }
        if (root == top) {
            root.next = node;
        }
        top.next = node;
        top = node;
    }

    public int pop() {
        if (null == root) {
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode topNode = top;
        StackNode n =root;
        while (n.next!=top){
            n = n.next;
        }
        n.next=null;
        top = n;

        return topNode.data;
    }

    public int peek() {
        return top.data;
    }

    //Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
} 
