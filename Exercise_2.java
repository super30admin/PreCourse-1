class StackAsLinkedList {

    // Time Complexity :
    // Push (O(1)), Pop (O(1))
    // Space Complexity :
    // Push (O(1)), Pop (O(1)), No additional space needed
    // Did this code successfully run on Leetcode :
    // Yes
    // Any problem you faced while coding this :
    // Didn't find exact problem on leetcode
    // Approach :
    // Keep reference of root node as the top of the stack. Create new node and make it the new top/root node.
    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }


    public boolean isEmpty()
    {
        return root == null;
    }

    public void push(int data)
    {
        StackNode newNode = new StackNode(data);
        if(root == null){
            root = newNode;
            return ;
        }
        newNode.next = root;
        root = newNode;
    }

    public int pop()
    { 	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode top = root;
        root = root.next;
        return top.data;
    }

    public int peek()
    {
        if(root == null) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return root.data;
    }
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    } 
} 
