// Time Complexity :
/*  isEmpty() : O(1)
 *  push(int x): O(n)
 *  pop(): O(n)
 *  peek(): O(n)
 */
// Space Complexity : O(n)

// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : Was stuck on pop function for some time, even after writing the logic, output was incorrect.

 class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data=data;
            this.next=null;
            
           

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
        // If stack is not empty, iterate through linked list and point last node to a new node.
        try{
            int check= root.data;
          //System.out.println("Root data: "+ check);
            while(pointer.next!=null){
                pointer= pointer.next;
            }
            pointer.next= new StackNode(data);

            //System.out.println("try");

        }catch(Exception e){
            // The stack is empty, so creating root node
            root= new StackNode(data);
            //System.out.println("catch");
            
           
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
        
        }else{
            // Initialize counter to keep track if stack is empty
            int count=0;
            // Initialize a pointer, pointing to root node
            StackNode pointer=root;
            // Initialize a output Node, pointing to root node
            StackNode outNode=root;
            // Iterate over stack to get last node and increment counter
            while(pointer.next!=null){
                outNode= pointer;
                pointer= pointer.next;
                count++;
            }
           // save last node's data 
            int out= pointer.data;
            // If count is 0 then stack has one element. Change root to null
            if (count==0){
                root=null;
            }else{
                // Point next to null for last element
                outNode.next=null;

            }

            
            
            
            return out;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (root==null){
            System.out.println("Stack underflow");
            return 0;
        }else{
            StackNode pointer=root;
            StackNode lastNode=pointer;
            while(pointer.next!=null){
                lastNode=pointer;
                pointer= pointer.next;
            }
            // StackNode out= pointer.next;
            return pointer.data;
        }
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

        //System.out.println(sll.pop() + " popped from stack");
        
    } 
} 
