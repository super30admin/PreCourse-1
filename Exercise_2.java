//Time Complexity: O(1)
//Space Complexity: O(1)
class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data)
        { 
            //Constructor here
            this.data = data;
        }
    }

    StackAsLinkedList() {
        this.root = null;
    }
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        return root == null;

    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode current = new StackNode(data);
        if(current == null) {
            System.out.println("\nStack Overflow!!");
            return;
        }
        current.data = data;
        current.next = root;
        root = current;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        int x = root.data;
        root = root.next;
	//Also return the popped element
        return x;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty()) {
            return root.data;
        }
        else {
            System.out.println("Stack Empty");
            return -1;
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
