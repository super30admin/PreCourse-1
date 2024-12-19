// import StackAsLinkedList.StackNode;

public class StackAsLinkedList { 
  
    StackNode root; 
    StackNode end;

    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if (root == null){
            return false;
        }
        return true;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode node = new StackNode(data);
        if(root == null){
            root = node;
        }
        else{
            root.next = node;
        }
        end = node;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(root == null){
            return 0;
        }
        int popped_value = end.data;
        StackNode ptr = root;
        while(ptr.next != end){
            ptr = ptr.next;
        }
        ptr.next = null;
        end = ptr;
        return popped_value;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return end.data;
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
