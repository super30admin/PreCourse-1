public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data=data;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root==null) return true;
        else return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode nNode = new StackNode(data);
        if(root==null) root = nNode;
        else {
            StackNode temp=root;
            root=nNode;
            nNode.next=temp;
        }
        System.out.println(data+" pushed to stack");
    } 
  
    public int pop() 
    { 	
    //If Stack Empty Return 0 and print "Stack Underflow"
    if(root==null){
        System.out.println("Stack Underflow");
        return 0;
    }
        //Write code to pop the topmost element of stack.
        else{
            int popEle=root.data;
        root=root.next;
    //Also return the popped element 
    return popEle;
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
