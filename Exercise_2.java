// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : did not know where to go on leetcode
// Any problem you faced while coding this : no, I had to change the name of the class, without that, it was showing an error
public class Exercise_2 { 
  
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
            return true;
        }else{
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode= new StackNode(data);
        if(root == null){
            root = newNode;
        }else{
            StackNode temp= root;
            root= newNode;
            newNode.next= temp;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    int po= Integer.MIN_VALUE;
    if(isEmpty()){
        System.out.println("Stack Underflow");
        return 0;
    }else{
        po= root.data;
        root= root.next;
    }
    return po;
    
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
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
