public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data=data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root==null){
            System.out.println("Stack is empty");
            return true;
        }
        else{
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newnode = new StackNode(data);
        if(root==null){
            root=newnode;
        }
        else{
           StackNode dummy=root;
           root=newnode;
           newnode.next=dummy;
        }
        System.out.println(data + "pushed into stack");
    } 
  
    public int pop() 
    { 
        int elem=0; 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if(root==null){
        return 0;
        System.out.println("Stack Underflow");
    }
        //Write code to pop the topmost element of stack.
    else{
        elem=root.data;
        root=root.next;
    }
	//Also return the popped element 
    return elem;
    } 
  
    public int peek() 
    { 
        int topele=0;
        //Write code to just return the topmost element without removing it.
        if(root==null){
            return 0;
            System.out.println("Stack is Empty");
        }
        else{
            topele=root.data;
            return topele;
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