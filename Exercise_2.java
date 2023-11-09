//Time Complexity = O(1)
//Space Complexity = O(1)
public class StackAsLinkedList { 
  
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
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        //Checking here the root is null or not 
        if(root == null){
            return true;
        }else 
            return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        //Inserting an element of data to stack
        StackNode Node_new = new StackNode(data);
        if(root == null){
            root = Node_new;
        }else {
            StackNode temp = root;
            root = Node_new;
            Node_new.next = temp;
        }
        System.out.println("Pushing data to the stack"+ data);

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    int pop_element = Integer.MIN_VALUE;
    if(root == null){
        System.out.println("Stack is Empty So it underflow");
    }else {
        pop_element = root.data;
        root = root.next;
    }
    return pop_element;

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else {
            return root.data;
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