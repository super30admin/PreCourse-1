// Time Complexity :O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :ran code locally
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach


public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
        } 
    } 
    
	//check if stack empty
    public boolean isEmpty() 
    { 
        return root==null;
    } 
  
    public void push(int data) 
    { 
        StackNode newnode = new StackNode(data);
        
        newnode.next = root;   //point node to top
        root = newnode;   //update top to newnode
    } 
  
    public int pop() 
    { 	
        if (isEmpty()) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        
        int popped = root.data; 
        root = root.next;   //move top to next node
        return popped;
    } 
  
    public int peek() 
    { 
        if (isEmpty()) { 
            System.out.println("Stack is Empty"); 
            return 0; 
        } 
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
