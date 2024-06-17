public class StackAsLinkedList { 
  
    StackNode root;
  
    static class StackNode { 
        int data; 
        StackNode next;

        StackNode(){};
  
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
        return (root==null || root.next == null)? true:false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        if(isEmpty()){
            root = new StackNode();
            root.next = new StackNode(data);
        }else{
            StackNode temp = root;
            while(temp.next != null){
                temp = temp.next;
            }
            StackNode newStackNode = new StackNode(data);
            temp.next = newStackNode;
            temp = temp.next;
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
        }
        StackNode temp = root;
        while(temp.next.next != null){
            temp = temp.next;
        }
        StackNode lastStackNode = temp.next;
        temp.next = null;
        return lastStackNode.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty()){
            StackNode temp = root;
            while(temp.next != null){
            temp = temp.next;
            }
            return temp.data; 
        }
        return 0;
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
