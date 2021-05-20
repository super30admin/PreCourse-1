public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int d)
        { 
            //Constructor here
            data=d;
            next=null;
        }

    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if(root==null){
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode nextNode=new StackNode(data);
        if(root==null){
            root = nextNode;
        }
        else {
            StackNode n=root.next;
            while (n.next != null) {
                n = n.next;
            }
            n.next = nextNode;
        }
    } 
  
    public int pop() 
    {
        if(root==null){
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode nextNode =root;
        StackNode newLast=null;
        while(nextNode.next!=null){
            newLast=nextNode;
            nextNode=nextNode.next;
        }
        if(newLast !=null)
            newLast.next=null;
        return nextNode.data;

	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        StackNode nextNode =root;
        if(root==null){
            System.out.println("Stack Underflow");
            return 0;
        }
        while(nextNode.next!=null){
            nextNode=nextNode.next;
        }
        return nextNode.data;
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
