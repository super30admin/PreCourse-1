// Time Complexity : O(1) since we have not used any loop to traverse the list

// Space Complexity : O(n)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:

//push: create a new node , check if root is empty- then set new node to root and return list,
//--if root not empty then, create a temp variable, store root in temp and set root as new variable and store the address of temp node in root
//setting root evertime to new node to avoid list traversal (LIFO)
//pop: return the root data and set the root to root.next
//peek: return root.data
//isempty - check if root is null

public class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data;
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
        if(root == null){
            root = newNode;
        } else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;

        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(!isEmpty()){
            StackNode poppedNode = root;
            root = poppedNode.next;
            return poppedNode.data;
        }
        System.out.println(" Stack Underflow");
        return 0;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty()){
            return root.data;
        }
        System.out.println(" Stack Underflow");
        return 0;
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
