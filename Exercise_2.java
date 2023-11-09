public class StackAsLinkedList{ 
    //Time Complexity: O(1)
  //Space complexity: O(n)
  
    StackNode root; 
    int l=0;
    static class StackNode { 
        int data; 
        StackNode next; 
        StackNode(int data) 
        { 
            //Constructor here 
            this.data=data;
            this.next=null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return l==0;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode t=new StackNode(data);
        t.next=root;
        root=t;
        l++;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
	    if(isEmpty()){
	        System.out.println("Stack Underflow");
	        return 0;
	    }
	    else{
	        int r=root.data;
	        root=root.next;
	        l--;
	        return r;
	    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            return -1;
        }
        return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
        System.out.println(sll.pop());
        System.out.println(sll.peek());
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
        System.out.println(sll.pop());
        System.out.println(sll.pop());
        sll.push(40);
        sll.push(50);
        System.out.println(sll.peek());
        System.out.println(sll.pop());
        System.out.println(sll.pop());
        System.out.println(sll.pop());
    } 
}
