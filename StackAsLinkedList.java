//Time complexity o(1)
//space complexity o(n)
public class StackAsLinkedList { 
  
    StackNode root; 
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            this.next = null;  
        } 
    } 
    
    public StackAsLinkedList(){
        this.root = null;
    }
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if(root == null){
            return true;
        }
        return false; 
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);
        if(root == null){
            root = newNode;
        }
        else{
            newNode.next = root;
            root = newNode;
        }
    } 

    public void display(){
        StackNode current = root;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
  
    public int pop() 
    { 	
        int popElement = 0;
        if(root == null){
            System.out.println("underflow"); //If Stack Empty Return 0 and print "Stack Underflow"
            return popElement;
        }
        if(root.next != null){ //Write code to pop the topmost element of stack.
            popElement = root.data;
            root = root.next;
        }
        else {
            popElement = root.data;
            root = null;
        }
        return popElement; //Also return the popped element
        
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        StackNode current = root;
        if(current != null){
            return current.data;
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