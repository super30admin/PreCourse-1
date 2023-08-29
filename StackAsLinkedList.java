// TC for isEmpty,push,peek is O(1) while it is O(n) for pop
// SC is O(1)

public class StackAsLinkedList {
  
    StackNode root;

    StackNode curr;
  
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
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        if(curr != null){
            curr.next = newNode;
            curr = newNode;

        }else{
            root  = newNode;
            curr = root;
        }

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        StackNode temp = root;
        StackNode prev = null;
        int popped=0;
        if(root.next == null){
            popped = root.data;
            root=null;
            curr = null;
            return popped;
        }
        while(temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        popped = prev.next.data;
        prev.next = null;
        curr = prev;
        return popped;
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            root = null;curr = null;
            return 0;
        }
        return curr.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());



    } 
} 
