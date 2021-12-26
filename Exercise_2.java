/*Implementation of Stack using Linked List.
  Time Complexity: O(n) for push, pop and peek elements.
  Space Complexity: O(n) to store the n nodes.
*/

import java.util.*;
class StackAsLinkedList {
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
        return this.root == null;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        if (this.root == null) {
            this.root = newNode;
            return;
        }
        StackNode p = root;
        while (p.next != null) {
            p = p.next;
        }
        p.next = newNode;
    }

    public int pop() {
        StackNode p = root;
        StackNode q = null;
        int val = 0;;
        if(p == null) return val;
        while (p.next != null) {
            q = p;
            p = p.next;
        }
        if(p != null) { 
            val = p.data;
            if(q != null) {
                q.next = null;
            } else {
                root = null;
            }
        }
        return val;
    }

    public int peek() {
        StackNode p = root;
        if(p != null) {
            while (p.next!= null) {
                p = p.next;
            }
        }
        return (root != null) ? p.data : 0;
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
