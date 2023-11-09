public class StackAsLinkedList {
    //time Complexity:O(1)
//Space Complexity:O(n)
  
    StackNode root;

  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data=data;//Constructor here
            this.next=null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
       return root == null; //Write your code here for the condition if stack is empty.

    } 
  
    public void push(int data)
    {
        StackNode temp = new StackNode(data);
        StackNode n=root;
        if (root==null) {root=temp;}
        else {temp.next=root;
        root=temp;
        }

        //Write code to push data to the stack.
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        StackNode n= root;
	if(root==null) return 0;//Also return the popped element
        else {
            root=root.next;
            return n.data;
    }


    }
  
    public int peek() 
    {
        return root.data;
       //Write code to just return the topmost element without removing it.
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30);
        sll.pop();
        System.out.println(sll.isEmpty());

  
        System.out.println(sll.pop() + " popped from stack");
  
        System.out.println("Top element is " + sll.peek());
    } 
} 
