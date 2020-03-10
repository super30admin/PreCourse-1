// Time Complexity : push O(n) pop O(n) peek O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : not tried
// Any problem you faced while coding this : no

public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if(root == null) {
        	return true;
        }else {
        	return false;
        }
    } 
  
    public void push(int data) 
    { 
        StackNode node = root;
        if(root == null) {
        	root = new StackNode(data);
        }else {
        	while(node.next != null) {
        		node = node.next;
        	}
        	node.next = new StackNode(data);
        }
    } 
  
    public int pop() 
    { 	

        if(root == null) {
        	return Integer.MIN_VALUE;
        }else if(root.next == null){
        	int data = root.data;
        	root = null;
        	return data;
        }else {
            StackNode node = root;
        	while(node.next.next != null) {
        		node = node.next;
        	}
        	int data = node.next.data;
        	node.next = null;
        	return data;
        }
    } 
  
    public int peek() 
    { 
        StackNode node = root;
        if(root == null) {
        	return Integer.MIN_VALUE;
        }else {
        	while(node.next != null) {
        		node = node.next;
        	}
        	return node.data;
        }
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