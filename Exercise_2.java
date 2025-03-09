 class StackAsLinkedList { 
// Time Complexity :O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
// Your code here along with comments explaining your approach
  
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
        if(root==null){
            return true;
        } 
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode=new StackNode(data);
        if(root==null){
            root=newNode;
        }
        else{
            newNode.next=root;
            root = newNode;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(root==null){
            System.out.println("Stack Underflow");
            return 0;
         }
        int x=root.data;
        root=root.next; 
        return x;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root==null){
            System.out.println("Stack Underflow");
            return -1;
         }
        return  root.data;

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
