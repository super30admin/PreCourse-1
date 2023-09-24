// Time Complexity :
//  push: O(1)
//  pop: O(1)
//  peek: O(1)
//  isEmpty: O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Did not try on LC
// Any problem you faced while coding this : -
// class StackAsLinkedList
public class Exercise_2 { 
  
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
        if(root == null)
        {
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode node = new StackNode(data);

        if(root == null)
        {
            root = node;
        }
        else
        {
            StackNode tmp = root;
            root = node;
            node.next = tmp;
        }
        System.out.println(data +" pushed");
        
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element k
        int data = Integer.MIN_VALUE;
        if(root == null)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
           data = root.data;
           root = root.next;
        }
        return data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null){
            System.out.println("No element to peek");
            return Integer.MIN_VALUE;
        }
        return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
        // replace StackAsLinkedList instead of Exercise_2
        Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
