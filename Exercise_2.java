public class StackAsLinkedList { 
  
  
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
    
    StackNode root; 

    public StackAsLinkedList(){
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

        
    StackNode newNode = new StackNode(data);
    newNode.next = this.root;
    root = newNode;
        
        
    } 
  
    public int pop() throws Exception
    { 	
    //If Stack Empty Return 0 and print "Stack Underflow"
    
    if(this.root == null){
        System.out.println("Stack is empty");
        throw new Exception("Stack is empty");
    }
        //Write code to pop the topmost element of stack.
    //Also return the popped element
    
        StackNode temp = root;
        this.root = root.next;

    return temp.data;
    
    } 
  
    public int peek() throws Exception 
    { 
        //Write code to just return the topmost element without removing it.
        if(this.root == null){
            System.out.println("Stack us empty");
            throw new Exception("Stack is empty");
        }else{
            return this.root.data;
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
