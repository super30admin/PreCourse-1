//TC: O(1) 
//SC: O(n)

 class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
        
        StackNode(int data) 
        { 
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root == null){
            return true;
        }
        else return false;
    } 
  
    public void push(int data) 
    { 
        StackNode sn = new StackNode(data);
        //Write code to push data to the stack. 
        if(root == null){
            root = sn;
        }
        else{
            sn.next = root;
            root = sn;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int pop = root.data;
            root = root.next;
            return pop;
        }

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null)
        return 0;
        else{
            return root.data;
        }
    } 
 }
	//Driver code
    public class Exercise_3{
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
