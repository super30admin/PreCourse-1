class StackAsLinkedList { 
  
    StackNode root;
    int len = 0; 
  
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
        StackNode sn = new StackNode(data);
        if(len == 0){
            root = sn;
            len++;
        }
        else {
            StackNode lastNode = traverse(root, len);
            lastNode.next = sn;
            len ++;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if(len == 0){
        System.out.println("Stack Underflow");
        return 0;
    }
        //Write code to pop the topmost element of stack.
    if(len == 1){
        int data = root.data;
        root = null;
        len --;
        return data;
    }
    StackNode sn = traverse(root, len-1);
    int data = sn.next.data;
    sn.next = null;
    len --;
    return data;

	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode sn = traverse(root, len);
        return sn.data;

    }
    
    private StackNode traverse(StackNode root, int len){
        StackNode temp = root;
        while(len > 1){
            temp = temp.next;
            len --;
        }
        return temp;
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
