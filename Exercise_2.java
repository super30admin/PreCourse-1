//Exercise_2 : Implement Stack using Linked List.

// Time Complexity : o(1) since we have not used any loop to traverse the list

// Space Complexity :

// Your code here along with comments explaining your approach:

//push: create a new node , check if root is empty- then set new node to root and return list, 
//--if root not empty then, create a temp variable, store root in temp and set root as new variable and store the address of temp node in root
//setting root evertime to new node to avoid list traversal (LIFO)
//pop: return the root data and set the root to root.next
//peek: return root.data
//isempty - check if root is null



public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data=data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
      if (root == null) {
    	 return true;
    	 }
    	      
      return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
    	StackNode newnode = new StackNode(data);
    	if(root ==null) {
    		root = newnode;
    	}
    	
    	StackNode temp;
    	temp=root;
    	root=newnode;
    	root.next = temp;
    	
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	int res = 0;
    	if(root==null)
    	{
    		return res;
    	}
    	res=root.data;
    	root=root.next;
    	return res;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	if (root == null) {
            return 0;
        }
            return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
    	Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
