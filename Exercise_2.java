class StackAsLinkedList {
     // the tc for this implementation is O(1)
     // the size of the stack is 1000, thus sc is 1000 which is O(n)

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;
  
        StackNode(int data)
        {
            //Constructor here
            this.data = data;
            this.next = null;
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return root == null;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        if(root == null) {
            root = newNode;
        }
        else {
            newNode.next = root;
            root = newNode;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int poppedData = root.data;
        root = root.next;
        return poppedData;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(root == null) {
            System.out.println("Stack is Empty");
            return 0;
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
