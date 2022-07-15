class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data=data;
            this.next=null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root==null)
            return true;
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack
        if(root==null){
            StackNode newnode=new StackNode(data);
            newnode.data=data;
        root=newnode;}
         else
        {StackNode newnode=new StackNode(data);
        newnode.next=root;
        root=newnode;}

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        int k=0;
	//Also return the popped element 
    if(root==null)
        System.out.println("Stack Underflow");
    else
       { k=root.data;
        root=root.next;}
    return k;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root==null)
            return -1;

        return root.data;

    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
