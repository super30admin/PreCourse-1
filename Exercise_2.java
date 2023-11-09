// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : No

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data=data;
        } 
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
        if(root == null) {
            root = newNode;
        } else {
            StackNode tempNode = root;
            root = newNode;
            newNode.next = tempNode;
        }
    } 
  
    public int pop() 
    { 	
        int popedVal = Integer.MIN_VALUE;
        if(root==null) return 0;
        popedVal = root.data;
        root=root.next;
        return popedVal;
    } 
  
    public int peek() 
    {
        if(root==null) return Integer.MIN_VALUE;
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
