 class StackAsLinkedList { 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No
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
    
// Time Complexity : O(1)
// Space Complexity :O(N)	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root==null)
        return true;
        else 
        return false;
    } 
  //10--20--30

// Time Complexity : O(1)
// Space Complexity :O(N)
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newnode=new StackNode(data);
        newnode.next=root;
        root=newnode;


    } 
  
// Time Complexity : O(1)
// Space Complexity :O(N)
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
    if(this.isEmpty()){
        System.out.println("Stack Underflow");
        return 0;
    }
    else{
        int last=root.data;
        root=root.next;
        return last;
        }
    }
     
// Time Complexity : O(1)
// Space Complexity :O(N)
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(this.isEmpty())
        {
            System.out.println("Stack is empty");
        return 0;
        }
        else
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
