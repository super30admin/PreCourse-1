// Exercise_2 : Implement Stack using Linked List.
// Time Complexity : O(1)
// Space Complexity : O(n) where n is the number of items in the stack.
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

    StackAsLinkedList(){
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
        StackNode new_node = new StackNode(data);
        if (new_node == null) {
            System.out.println("Stack Overflow!");
            return;
        }
        new_node.next = root;
        root = new_node;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(isEmpty()){
            System.out.println("Stack Overflow!");
            return 0;
        } else{
            // current top as temp
            StackNode temp = root;

            // update top to next node
            root = root.next;
            return temp.data;
        }

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (!isEmpty())
            return root.data;
        else {
            System.out.println("Stack Is Empty!");
            return Integer.MIN_VALUE;
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
