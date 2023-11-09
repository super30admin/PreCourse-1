/* faced issue(null pointer exception) while deleting all elements. So used EmptyStackException 
*********** Not Sure about space complexity*******/


import java.util.EmptyStackException;
class StackAsLinkedList { 
  
    StackNode root; 
   
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data; 
            this.next = null; 

           
        } 
    } 
    public boolean isEmpty()                                // **** Time Complexity O(1) ***********
    {    
        if(root == null){           //Write your code here for the condition if stack is empty. 
            // System.out.println("List is empty");
            return true;
        }else{
            // System.out.println("List is not empty");
            return false;
        }   
    } 
    int top = 0;
    public void push(int data)                              // **** Time Complexity O(1) ***********
    { 
        //Write code to push data to the stack. 
            StackNode newNode = new StackNode(data);      
                newNode.next = root;
                top ++;
                root = newNode;
    } 
  
    public int pop()                                        // **** Time Complexity O(1) ***********
    { 	
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;                                   	//If Stack Empty Return 0 and print "Stack Underflow"
        }
            int popedElement = root.data ;                 //Write code to pop the topmost element of stack. 
            root = root.next ;                  
            top -- ;
            return popedElement ;                           //Also return the popped element 
    } 
  
    public int peek()                                       // **** Time Complexity O(1) ***********
    { 
        //Write code to just return the topmost element without removing it.
        if(root != null){
            return root.data;
        }
        else{
            throw new EmptyStackException();
        }

                
    } 

	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
        // sll.isEmpty();
       
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
