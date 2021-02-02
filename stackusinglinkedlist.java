public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data=data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root==null){
            return true;
        }
        else return false;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        StackNode newNode= new StackNode(data);
        if(root==null) {root=newNode;}
        else {StackNode temp=root;
        root=newNode;
    newNode.next=temp;}
    System.out.println(data + "pushed to stack");
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
        int popped = Integer.MIN_VALUE;
        if(root == null){
            System.out.println("Stack is empty");

        } else{
            popped = root.data;
            root= root.next;
        } return popped;

	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        if(root == null){
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }else{
            return root.data;
        }
        //Write code to just return the topmost element without removing it.
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
