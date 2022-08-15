// Time Complexity : o(1)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : Yes
class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.data = data;
            next=null;
        }
    }

    public boolean isEmpty() {
        if( root == null){
            return true;
        }

        return false;
    }

    public void push(int data) {
        StackNode node1 = new StackNode(data);
        node1.next = root;
        root = node1;
        System.out.println( data + " added to stack.");
    }

    public int pop() {

        if( root ==  null){
            System.out.println("Stack underflow, stack is empty.");
            return Integer.MIN_VALUE;
        }

        int val = Integer.MIN_VALUE;
        val = root.data;
        root =root.next;

        return val;
    }

    public int peek() {

        if ( root == null){
            System.out.println("Stack is empty");
            return Integer.MAX_VALUE;
        }

        return root.data;
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
