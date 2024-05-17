// Time Complexity : O(1) for all
// Space Complexity : Constant space O(1)
// Did this code successfully run on Leetcode : Yes, it did.
// Any problem you faced while coding this : No

class Stacks {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        if (top == 0) {
            return true;
        } else
            return false;
    }

    Stacks() {
        top = -1;
    }

    boolean push(int x) {
        if (top > MAX) {
            System.out.println("Limit has been reached");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    int pop() {
        if(top > -1){
            int poppedIndex = top;
            top = top - 1;
            return a[poppedIndex];    
        }else{
            System.out.println("Nothing in stack to pop out");
            return 0;
        }
        
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Empty stack, nothing to peek!");
            return 0;
        } else {
            int peeked = a[top];
            return peeked;
        }
    }
}
class Main {
    public static void main(String args[]) {
        Stacks s = new Stacks();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
