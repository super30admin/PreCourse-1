/*
    Time Complexity : O(1)
    Space Complexity : O(1)
    Did this code successfully run on Leetcode :
    Any problem you faced while coding this :
*/ 
// Your code here along with comments explaining your approach
class StackAsLinkedList { 
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) { 
            this.data = data;
        } 
    } 
	
    public boolean isEmpty() { 
        if(root == null)
            return true;
        return false;
    } 
  
    public void push(int data) { 
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
    } 
  
    public int pop()    { 	
        if(root == null) {
            System.out.println("Stack underflow");
            return 0;
        }
        int temp = root.data;
        root = root.next;
        return temp;
    } 
  
    public int peek() 
    { 
        if(isEmpty() == true) {
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