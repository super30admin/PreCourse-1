// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data=data;//Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if (root == null){
            return true;
        }
        else{
            return false;
        }
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        StackNode element = new StackNode(data); 
  
        if (root == null) { 
            root = element; 
        } 
        else { 
            StackNode t = root; 
            root = element; 
        element.next = t; 
        } 
        System.out.println(data + " pushed to stack"); //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
	int popelem = Integer.MIN_VALUE; 
        if (root == null) { 
            return 0; //If Stack Empty Return 0 and print "Stack Underflow"
        } 
        else { 
            popelem = root.data; 
            root = root.next;  //Write code to pop the topmost element of stack.
        } 
        return popelem; //Also return the popped element 
    }
       
	public int peek() 
    { 
       if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            return root.data;
        }//Write code to just return the topmost element without removing it.
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
