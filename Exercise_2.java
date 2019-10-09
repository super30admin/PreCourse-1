//Time complexity of all the operations push(), pop(), peek() and isEmpty() is O(1)
// Space complexity is O(n) -- n is the number of elements in the stack

public class StackAsLinkedList {

    StackNode root;

    static class StackNode{
        int data;
        StackNode next;

        StackNode(int data){
            this.data = data;
            next = null;
        }
    }

    boolean isEmpty(){
        return root==null;
    }

    void push(int data){
        StackNode node = new StackNode(data);

        if(root == null)
            root = node;
        else{
            StackNode temp = root;
            root = node;
            node.next = temp;
        }
    }

    int pop(){
        if(root==null){
            System.out.println("Stack Underfloe");
            return Integer.MIN_VALUE;
        }
        else{
            int x = root.data;
            root = root.next;
            return x;
        }
    }

    int peek(){
        if(root==null)
            return Integer.MIN_VALUE;
        else{
            return root.data;
        }
    }


    public static void main(String[] args) {
        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());


    }
}
