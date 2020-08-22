package precourse1;

//Implement Stack using Linked List.
//Time Complexity : O(1)
//Space Complexity : O(n)
//Any problem you faced while coding this : No

public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data =data;
        } 
    }  
	
    public boolean isEmpty() 
    {
        //Write your code here for the condition if stack is empty. 
    	//checks whether there is any element in the stack
    	return root==null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
    	StackNode node=root;	//assigns root's data and reference to the node
    	root=new StackNode(data);	//modifies the data of the root node with the new node
    	root.next=node;			//references the node so that the newly added element would be the first node
    } 
  
    public int pop() 
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	if(root==null) {	//checks whether the stack is empty
    		System.out.println("Stack Underflow");		
    		return 0;
    	}
    	int result=root.data;	//stores the value of the root node
    	root=root.next;			//dereference the root node which results in popping the element from the stack
    	return result; 			//returns the value of the popped element
    } 
  
    public int peek() 
    {
		if (root == null)	return 0;	//if stack is empty return 0
		return root.data;				//returns the top element of the stack
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 	//returns element 20
    } 
} 
