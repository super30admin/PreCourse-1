// Time Complexity: O(1)
// Space Complexity: O(N)

public class StackAsLinkedList { 
  
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
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode node =  new StackNode(data);
        if(root == null){
            root = node;
            System.out.println("pushed successfully " + data);
        }
        else{
            node.next = root;
            root = node;
            System.out.println("pushed successfully " + data);
        }
    } 
  
    public int pop() 
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(root==null){
        System.out.println("stack underflow");
        return 0;
    }
    else if (root.next == null){
        int x = root.data;
        root = null;
        return x;
    } 
    else{
        int x = root.data;
        root = root.next;
        return x;
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
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
