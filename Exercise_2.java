//Time complexity : O(1)
//Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


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
    
	
    public boolean isEmpty() 
    { 
        if(root==null)
            return true;
        return false;
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data);
        if(root==null){
            root = newNode;
        }
        else {
            StackNode curr = root;
            while(curr.next!=null)
                curr = curr.next;
            curr.next = newNode;
        }
    } 
  
    public int pop() 
    { 	
        if(root==null){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            StackNode curr = root;
            if(root.next==null)
            {
                int val = root.data;
                root = null;
                return val;
            }else{
                while(curr.next.next!=null)
                    curr = curr.next;
                int val = curr.next.data;
                curr.next = null;
                return val;
            }
        }
    } 
  
    public int peek() 
    { 
        StackNode curr = root;
        if(root==null)
            return 0;
        else{
            while(curr.next!=null)
                curr = curr.next;
        }
        
        return curr.data;
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