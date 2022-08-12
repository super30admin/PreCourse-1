// Time Complexity :  O(n)
// Space Complexity :   O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
public class StackAsLinkedList { 
  
    StackNode root; 
    StackNode top;
  
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
        if(root==null){
            return true;
        }else{
            return false;
        }
        
    } 
  
    public void push(int data) 
    { 
        StackNode node=new StackNode(data);
        if(isEmpty()){
            root=node;
        }else{
            StackNode curr=root;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=node;
        }
    } 
  
    public int pop() 
    { 
        StackNode node=root;	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(root==null){
        System.out.println("Stack Underflow");
        return 0;
    }else{
        while(node.next.next!=null){
            node=node.next;
        }
        int a=node.next.data;
        node.next=null;
        return a;
    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        StackNode node=root;
        while(node.next!=null){
            node=node.next;
        }
        int val=node.data;
        return val;

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
