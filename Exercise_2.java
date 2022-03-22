class StackAsLinkedList {
  
    StackNode root;
    StackNode top;
  
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
        StackNode tempNode = new StackNode(data);
        if(isEmpty()){
            root = tempNode;
            top = root;
        }
        top.next = tempNode;
        top = top.next;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        if(top == root){
            int data = top.data;
            top = null;
            root = null;
            return data;
        }

        StackNode current = root;
        while(current.next != top){
            current = current.next;
        }
        int data = top.data;
        current.next = null;
        top = current;
        return data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return top != null ? top.data : 0;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30);
        sll.push(40);

        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek()); 
    } 
} 
