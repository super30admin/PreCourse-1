public class Exercise_2 {
  
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
        if(root==null)
        {
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        if(root==null)
        {
            root=newNode;
        }else
        {
            StackNode x = root;
            root = newNode;
            root.next = x;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        int ans = 0;
        if(root==null)
        {
            System.out.println("Stack Underflow");
            return ans;
        }else{
            ans = root.data;
            root = root.next;
        }
        return ans;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
//        if(root!=null)
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
