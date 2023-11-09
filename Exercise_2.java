// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

//Approach: First I initialised the constructor by initializing data and next pointer of the node. Then I wrote isEmpty which is when there are no nodes in the LL and head is null. 
// For push it is case of inserting into the LL at the beginning. So made the next of new node point to root and then placed root at the new node. For pop, I stored the value on root in a temporary variable 
// and made the root to point to root's next so the current node is no longer part of the LL and root points to the next node. For peek just returned the data at root.
class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root == null){
            return true;
        }
        else{
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);

        if (isEmpty()) {
            root = newNode;
        } else {
            newNode.data = data;
            newNode.next =  root;
            root = newNode;
        }

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int temp = root.data;
            root = root.next;
            return temp;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
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
