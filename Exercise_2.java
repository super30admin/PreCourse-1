// Time complexity: 
// PUSH - O(1)
// POP - O(1)
// PEEK - O(1)
// SUCCESS in Leetcode

class StackAsLinkedList { 
  
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
        //Write code to push data to the stack. 
        StackNode head = new StackNode(data);
        head.next = root;
        root = head;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int data = root.data;
            root = root.next;
            return data;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek());
        sll.push(30);
        System.out.println("Top element is " + sll.peek());
        sll.push(40); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
