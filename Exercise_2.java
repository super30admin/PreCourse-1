// Time Complexity : O(1) for all operations
// Space Complexity : O(N) where N is the number of elements in the stack
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// while adding an element we insert at beginning so that to pop or peek we can do it in constant time



public class Exercise_2 { 
  
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
    
	
    public boolean isEmpty() 
    { 
        if(root==null)
            return true;
        else
            return false; 
    } 
  
    public void push(int data) 
    { 
        StackNode nn=new StackNode(data);
        StackNode temp=root;
        root=nn;
        nn.next=temp; 
    } 
  
    public int pop() 
    { 	
        if(root==null){
            System.out.println("Stack Underflow");
            return 0;
        }
        int ans=root.data;
        root=root.next;
        return ans;
    } 
  
    public int peek() 
    { 
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
