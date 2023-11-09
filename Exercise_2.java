/*Time Complexity - 
  peek - O(1)
  push -  O(1)
  pop - O(1)

Space Complexity
  peek - O(1)
  push -  O(1)
  pop - O(1)*/
public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data =data;

            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
       return root == null;  //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack
        StackNode node = new StackNode(data);
        node.next = root;
        root=node;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
     if(root==null){
         System.out.println("Stack Underflow");
         return 0;
     }else{
         StackNode pop_element = root;
         root = root.next;
         return pop_element.data;
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

        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
