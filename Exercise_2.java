
public class Precourselinkedlist 
{
    // Time Complexity
    // push- O(n)
    // pop - O(n)
    // Peek - O(n)
    // Space Complexity - O(n)

	StackNode root; 
	
	static class StackNode { 
	    int data; 
	    StackNode next; 
	
	    StackNode(int data) 
	    { 
	        //Constructor here 
	    	this.data = data;
	    	this.next = null;
	    } 
	} 
	
	
	public boolean isEmpty() 
	{ 
	    //Write your code here for the condition if stack is empty. 
		if(root == null) {
			System.out.println("LL is empty");
			return true;
		}
		return false;
	} 
	
	public void push(int data) 
	{ 
	    //Write code to push data to the stack. 
		StackNode node = new StackNode(data);
		if(root == null) {
			root = node;
//			System.out.println(root.data);
		}else {
			StackNode tempNode = root;
			
			while(tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = node;
//			System.out.println(tempNode.next.data);
		}

	} 
	
	public int pop() 
	{ 	
	//If Stack Empty Return 0 and print "Stack Underflow"
	    //Write code to pop the topmost element of stack.
	//Also return the popped element 
		int poppeddata;
		if(root == null)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else if(root.next != null)
		{
			StackNode tempNode = root;
			while(tempNode.next.next != null) {
				
				tempNode = tempNode.next;	
			}
			poppeddata = tempNode.next.data;
			tempNode.next = null;
			return poppeddata;
		}
		else {
		    poppeddata = root.data;
			root = null;
			return poppeddata;
		}	

		
	} 
	
	public int peek() 
	{ 
	    //Write code to just return the topmost element without removing it.
		StackNode temp = root;
		if(temp==null) {
			return -1;
		}
		while(temp.next!=null) {
			temp = temp.next;
		}
		return temp.data;
	} 
	
	//Driver code
	public static void main(String[] args) 
	{ 
	
		Precourselinkedlist sll = new Precourselinkedlist(); 
	
	    sll.push(10); 
	    sll.push(20); 
	    sll.push(30); 

	    System.out.println(sll.pop() + " popped from stack"); 

	    System.out.println("Top element is " + sll.peek()); 
	}

}

