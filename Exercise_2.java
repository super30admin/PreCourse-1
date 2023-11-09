public class StackAsLinkedList { 
   
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
	    if(root==null){
	        return true;
	    }else{
	        return false;
	    }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
         StackNode nNode = new StackNode(data);
         if(root==null)
         {
           root=nNode;  
         }else{
             StackNode tmp=root;
             root=nNode;
             nNode.next=tmp;
         }
        System.out.println(data + " pushed to stack");
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
	 int popElement = Integer.MIN_VALUE;
	 if(root ==null)
	 {
	     System.out.println("stack is empty");
	 }
	 else{
	     popElement=root.data;
	     root=root.next;
	 }
	 return popElement;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (root==null) {
            System.out.println("stack is empty");
            return Integer.MIN_VALUE;
        }
        else {
            return root.data;
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

//time complexity : O(1) one element inserted at each time
//space complexity : O(1) elements need not be iterated . We can push at first position.
//Leetcode didnt tried but tried in online compiler to run it and its working properly.
// faced difficulty in assuming popElement as minimum value for integer.I had to search online to get that idea.
