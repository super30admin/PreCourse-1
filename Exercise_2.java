// Overall Time Complexity is O(1)
// Overall Space Complexity is O(n) i.e. number of nodes in the stack
public class StackAsLinkedList { 
  
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
        return (root == null);
    }
  
    public void push(int data) 
    { 
        StackNode new_node = new StackNode(data);
        if (root == null){
            root = new_node;
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
            System.out.println("Stack Underflow");
            return 0;
        }

        else{
            int popped = root.data;
            root = root .next;
            return popped;
        }

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
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
