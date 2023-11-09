public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 

        StackNode(int data) 
        { 
            this.data=data;
            this.next=null;
        } 
    } 
    
	StackNode top=null;
    int size;

    public boolean isEmpty() 
    { 
        return top == null;
    } 
  
    public void push(int data) 
    { 
        StackNode newnode= new StackNode(data);
        if(this.root==null){
            this.root=newnode;
        }else{
            newnode.next=this.root;
            this.root=newnode;
        }
        this.size++;

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if(this.root==null){
        System.out.println("Stack Underflow");
        return 0;
    }
    int ans= this.root.data;
    this.root=this.root.next;
    this.size -= 1;

    return ans;
    
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(this.root==null){
            System.out.println("No element at top");
            return 0;
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
