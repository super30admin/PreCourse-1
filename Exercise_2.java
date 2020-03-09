class StackAsLinkedList { 
  
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
    
	StackAsLinkedList(){
        this.root = null;
    }

    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return this.root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        /* Stack is empty and adding first node */
        if(this.isEmpty()){  
            this.root = new StackNode(data);            
        }
        else{
            StackNode temp = new StackNode(data);
            temp.next = this.root;
            this.root = temp;               
        }
    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element 
        if(this.isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        int element = this.root.data;
        this.root = this.root.next;
        return element;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(this.isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        return this.root.data;
    }  

    //Driver code
     public static void main(String[] args) { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 

        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek()); 

        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek());

        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek());

        System.out.println(sll.pop() + " popped from stack"); 
    }
} 
