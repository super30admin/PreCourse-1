// Time Complexity :O(1)
// Space Complexity :O(n)

public class StackAsLinkedList {

    StackNode root;
    StackNode lastNode;

    StackAsLinkedList() {
        root = null;
        lastNode = root;
    }

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            // Constructor here
        }
    }

    public boolean isEmpty() {
        // if there is no element present,we'll return true else false.
        if (root == null) {
            return true;
        } else {
            return false;
        }
        // Write your code here for the condition if stack is empty.
    }

    public void push(int data) {
        // we'll check if stack empty,if yes we'll create a new node having data
        // provided
        // and make it root as it is the first element and lastelement ie the only
        // //element
        if (isEmpty()) {
            StackNode temp = new StackNode(data);
            root = temp;
            lastNode = root;
            root.next = null;
        } // else we'll make a new node and push after lastnode and update the lastnode.
        else {
            StackNode newNode = new StackNode(data);
            lastNode.next = newNode;
            newNode.next = null;
            lastNode = newNode;
        }

        // Write code to push data to the stack.
    }

    public int pop() {
        // in pop, last element is not as useful bcz everytime we pop an element we
        // //cannot update last element as it is one directional linked list.
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        // if there is only one element present,we'll return its value and make
        // //root=null(will remove the element)
        if (root.next == null) {
            int x = root.data;
            root = null;
            lastNode = root;
            return x;
        }
        // else we'll take two pointers will increment till for last (current) and
        // second //last(prev) elements then we'll store last node's value, remove last
        // node by //pointing prev to null and return the saved value.
        // and make
        StackNode prev = root;
        StackNode curr = root.next;
        while (curr.next != null) {
            curr = curr.next;
            prev = prev.next;
        }
        int x = curr.data;
        prev.next = null;
        lastNode = prev;
        return x;

        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
    }

    public int peek() {
        // we'll check if stack is empty,if not we'll return last element's value as we
        // already have lastNode saved.
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;

        }
        return lastNode.data;
        // Write code to just return the topmost element without removing it.
    }

    // Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

    }
}
// -----------------------------------
// Time Complexity :isEmpty->O(1);push->O(1);pop->O(1);peek->O(1)
//
// Space Complexity :O(n),where n is no of elements present due to hashmap we
// are using

public class StackAsLinkedList {

    StackNode root;
    StackNode lastNode;
    // we'll make hashmap to store key->size/index and value->node to make pop
    // operation //efficient
    HashMap<Integer, StackNode> map;
    int size;

    StackAsLinkedList() {
        root = null;
        lastNode = root;
        map = new HashMap<>();
        size = 0;
    }

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            // Constructor here
        }
    }

    public boolean isEmpty() {
        // if there is no element present,we'll return true else false.
        if (root == null) {
            return true;
        } else {
            return false;
        }
        // Write your code here for the condition if stack is empty.
    }

    public void push(int data) {
        // we'll check if stack empty,if yes we'll create a new node having data
        // provided
        // and add it into hashmap make it root as it is the first element and
        // lastelement ie the only element
        if (isEmpty()) {
            StackNode temp = new StackNode(data);
            map.put(++size, temp);
            root = temp;
            lastNode = root;
            root.next = null;
        } // else we'll make a new node , push after lastnode and update the lastnode.
        else {
            StackNode newNode = new StackNode(data);
            map.put(++size, newNode);
            lastNode.next = newNode;
            newNode.next = null;
            lastNode = newNode;
        }

        // Write code to push data to the stack.
    }

    public int pop() {
        // we'll use hashmap to get last element and second last element
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        // if there is only one element present,we'll return its value and make
        // root=null(will remove the element)
        if (root.next == null) {
            int x = root.data;
            root = null;
            lastNode = root;
            map.remove(size);
            size--;
            return x;
        }
        // we'll use hashmap to get last and second last element to remove last element
        // and remove the same from hashmap
        StackNode temp = map.get(size);
        int x = temp.data;
        map.get(--size).next = null;
        lastNode = map.get(size);
        map.remove(size + 1);
        return x;

        // If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        // Also return the popped element
    }

    public int peek() {
        // we'll check if stack is empty,if not we'll return last element's value as we
        // already have lastNode saved.
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;

        }
        return lastNode.data;
        // Write code to just return the topmost element without removing it.
    }

    // Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");
        sll.push(40);
        sll.push(50);

        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.peek() + " peek from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
    }
}
