//time - O(1), space - O(n)
public class Exercise_2 {
    static class ListNode {
        int val;
        ListNode next, prev;
        public ListNode(int val) {
            this.val = val;
        }
    }
    static class Stack {
        ListNode head, curr;

        public Stack() {
            head = new ListNode(-1);
            curr = null;
            head.next = curr;
        }

        private void push(int x) {
            ListNode newNode = new ListNode(x);
            if(curr == null) {
                curr = newNode;
                curr.prev = head;
                head.next = curr;
            } else {
                curr.next = newNode;
                newNode.prev = curr;
                curr = curr.next;
            }
        }

        private int pop() {
            if(curr == null) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                ListNode temp = curr;
                curr = curr.prev;
                curr.next = null;
                temp.prev = null;
                return temp.val;
            }
        }

        private int peek() {
            return curr == null ? -1 : curr.val;
        }

        private boolean isEmpty() {
            if(curr != null && curr.val == -1) {
                return true;
            } else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(6);
        stack.push(10);

        while(!stack.isEmpty()) {
            System.out.println("peek = "+stack.peek());
            System.out.println("pop = "+stack.pop());
            System.out.println("isEmpty() = "+stack.isEmpty());
        }
    }
}