// Time Complexity : 0(1)
// Space Complexity :0(n) , Size of array
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

//implement stack using linked list


class Main {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class Stack {
        Node head = null;

    boolean isEmpty()
    {
       return head == null;
    }



    boolean push(int x)
    {
        //Check for stack Overflow
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
    }

    int pop()
    {
        int val = head.data;
        head = head.next;
        return val;
    }

    int peek()
    {
      return head.data;

    }
}

// Driver code
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(6);
        s.push(3);
        s.push(7);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
