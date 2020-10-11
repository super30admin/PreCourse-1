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
        if(root==null) return true;
        else return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
         StackNode n = new StackNode(data);
         //StackNode n = root;
         if(root==null) {System.out.println("Stack Overflow"); }
 
         //StackNode k =n.next;
         n.data=data;
         n.next=root;
         root=n;
         System.out.println(root.data + " pushed to stack");
         //k.next=null;
    } 
  
    public int pop() 
    { 	
    //If Stack Empty Return 0 and print "Stack Underflow"
    StackNode n = root;
        if(root==null) { System.out.println("Stack Underflow"); return 0;}
        else{
            while(n.next!=null){
                n=n.next;
            }
            int j = n.data;
            n.next=null;
            return j;
        }
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root==null) return 0;
        else{
            StackNode n = root;
            while(n.next!=null){
                n=n.next;
            }
            return n.data;
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
