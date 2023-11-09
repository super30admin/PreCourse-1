 class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int dat) 
        { 
            //Constructor here 
            data = dat;
        } 
    } 
	//Time Complexity = O(1)
    //Space Complexity = O(1)
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root==null){
            return true;
        }
        return false;
    } 
    // Time Complexity = O(n)
    // Space Complexity = O(1)
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        if(root==null){
            root = new StackNode(data);
        }
        else{
            StackNode root_copy = root;
            while(root_copy.next!=null){
                root_copy = root_copy.next;
            }
            root_copy.next = new StackNode(data);
        }
    } 
    //Time Complexity = O(n)
    //Space COmplexity = O(1)
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(root ==null){
        System.out.println("Stack Underflow");
        return 0;
    }
    else{
        StackNode root_copy = root;
        StackNode root_prev = root;
        while(root_copy.next!=null){
            root_prev= root_copy;
            root_copy = root_copy.next;
        }
        if(root_prev!=root){
        int val = root_prev.next.data;
        root_prev.next = null;
        return val;
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
        else{
            int val = root_prev.data;
            root = null;
            return val;
        }
    }

    } 
     //Time Complexity = O(n)
    //Space COmplexity = O(1)
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root ==null){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            StackNode root_copy = root;
            while(root_copy.next!=null){
                root_copy = root_copy.next;
            }
            return root_copy.data;
        }

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
