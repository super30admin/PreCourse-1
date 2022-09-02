// Time Complexity :
/*  isEmpty() : O(1)
 *  push(int x): O(1)
 *  pop(): O(1)
 *  peek(): O(1)
 */
// Space Complexity : O(n)

// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : Was stuck on pop function for some time, even after writing the logic, output was incorrect.

 class StackAsLinkedList { 
    // root shows first node
    StackNode root; 
    // head is the last element
    StackNode head;
  
    static class StackNode { 
        int data; 
        StackNode next;
        StackNode previous; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data=data;
            this.next=null;
            this.previous=null;
            
           

        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 

        // If top is null return true else false
        if (root != null){
            return false;

        }else{
            return true;
        }

    } 
  
    public void push(int data) 
    { 
        // pointer points to root node
        StackNode pointer=root;
        //Write code to push data to the stack.
        // Check if root has data, if it doesn't, then it means that stack is empty and try will fail
        // If stack is not empty, head will point to a new node  and head will be updated, also new element will point to previous head
        try{
            int check= root.data;
         
          // Adding a new node at the end  
          head.next= new StackNode(data);
          // Pointing the new node to previous node
          head.next.previous= head;
          // updating head
          head= head.next;

            //System.out.println("try");

        }catch(Exception e){
            // The stack is empty, so creating root node
            // Pointing head to root
            root= new StackNode(data);
            head= root;
           
            
           
        }
        

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        // Check if stack is empty, if yes return error
        if (root==null){
            System.out.println("Stack underflow");
            return 0;
        // If only one element is remaining, empty the list
        }else if (head==root){
            int tmp= head.data;
            root= null;
            head= null;
            return tmp;
        }
        // if more than one element is present
        else{
            // get data to return from head
            int tmp= head.data;
            // update head to previous element
            head= head.previous;
            // detaching the last element
            head.next= null;
            return tmp;
            }
           // save last node's data 
            
            // If count is 0 then stack has one element. Change root to null

            
        }
     
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (root==null){
            System.out.println("Stack underflow");
            return 0;
        }else{
            // returning head
            return head.data;
            }
            // StackNode out= pointer.next;
           
        }

  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
        System.out.println("Is stack empty: "+ sll.isEmpty());
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
        System.out.println("Is stack empty: "+ sll.isEmpty());
        System.out.println("Top element is " + sll.peek()); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek()); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek()); 
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek()); 
        System.out.println("Is stack empty: "+ sll.isEmpty());
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
        System.out.println("Is stack empty: "+ sll.isEmpty());
        System.out.println("Top element is " + sll.peek()); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek()); 
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek()); 
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek()); 
        System.out.println("Is stack empty: "+ sll.isEmpty());

        //System.out.println(sll.pop() + " popped from stack");
        
    } 
} 
