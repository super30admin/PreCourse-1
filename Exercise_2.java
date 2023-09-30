public class StackAsLinkedList { 
  
    StackNode root; 
    StackNode top; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;
        } 
    } 

    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(this.root == null){
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        if(isEmpty()){
            this.root = new StackNode(data);
        }else if(this.root.next == null){
            this.root.next = new StackNode(data);
            this.top = root.next;
        }else{
            this.top.next = new StackNode(data);
            this.top = this.top.next;
        }
    } 

    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            StackNode i = this.root;
            while(i.next!=this.top){
                i = i.next;
            }
            int val = this.top.data;
            i.next = null;
            this.top = i;
            return val;
        }
    } 

    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(this.top != null){
            return this.top.data;
        }
        return -1;
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
