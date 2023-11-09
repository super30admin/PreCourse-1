/*
 * * Time Complexity:
 * 1. Push - O(1) 
 * 2. Pop - O(1)
 * 3. Peek - O(1)
 * 4. isEmpty - O(1)
 * 
 * 
 * Space Complexity:
 * 1. Push - O(1) 
 * 2. Pop - O(1)
 * 3. Peek - O(1)
 * 4. isEmpty - O(1)
 * 
 * 
 * 
 * This code will run successfully on Leetcode
 * 
 * Any problems you face while coding this - 
 * Initially I was adding new element at the end of List and hence for pop operation, I needed
 * to iterate over the list to remove last element for FIFO pattern making its time complexity as O(n)
 * So I looked at online articles in order see how I can improve Time complexity for pop operation
 * which is the only operation taking O(n) time and then I saw an article saying that if we keep
 * adding new element at the start of list then pop will take o(1) time so I implemented that idea
 * 
 * So I had to look at online articles to come up with this idea of adding new element at 
 * start of list to make all operations's time complexity o(1)
 * 
 * Approach: 
 * 1. when list is created head = null ( list is empty)
 * 2. for push, I am making a new node (let say data) with value to be inserted in stack. 
 * 	  Then if list is empty then I making head = data. Else I making data to point at head and
 * 	  then head = data. ( adding new element at the begining of list) 
 * 3. for opo operation, if list is empty that is head = null, printing underflow and return 0
 * 	  else I am returning value of root node and making root = root.next. 
 * 	  this allows to remove last element in O(1) time
 * 4. for peek, if head = null, then list is empty so printing underflow and return 0
 * 	  else returning root node's value without making root to go to root.next. 
 * 	  this keeps current value in stack and returns it without removing it
 * 5. for isEmpty operation, we check value of root node. if root is null, return true
 * 	  else return false 
 */

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
        //Write your code here for the condition if stack is empty. 
    	if(this.root == null)return true;
    	return false;
    } 
  
    public void push(int data) 
    { 
    	StackNode node = new StackNode(data);
        //Write code to push data to the stack. 
    	//if empty then make root and pointer to current data node
    	if(this.root == null) {
    		this.root = node;
    	}else {
    		//else put current data node in the end of of link list
    		node.next = root;
    		root = node;
    	}
    	
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    	if(this.root == null) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}else {
    		//Write code to pop the topmost element of stack.
    		//Also return the popped element 
    		
    		int return_value = this.root.data;
    		this.root = this.root.next;
    		
    		return return_value;
    	}
        
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if(this.root == null) {
    		System.out.println("Stack Underflow");
    		return 0;
    	}else {
    		return this.root.data;
    	}
    
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
    	StackAsLinkedList sll = new StackAsLinkedList(); 
          sll.push(10); 
          sll.push(20); 
          sll.push(30); 
          System.out.println("Top element is " + sll.peek());
          System.out.println(sll.pop() + " popped from stack"); 
          System.out.println("Top element is " + sll.peek());       
    } 
}