// Time Complexity : pop, peek, push = O(1) time
// Space Complexity : O(N), siaze of Stack
// Did this code successfully run on Leetcode : Yes ran in Leetcode Playground successfully
// Any problem you faced while coding this : No
// Made class non public or had to change filename

// Your code here along with comments explaining your approach
class Exercise_2 { 
  
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

public Exercise_2(){
    root = null;
}
	
    public boolean isEmpty() 
    { 
        //If root is null then it will return false else true;
        if(root==null){
            System.out.println("Stack is Empty");
            return true;
        }
        return false ;

    } 
  
    public void push(int data) 
    { 
        //insert new node with data to the front of the list. 
        StackNode pushNode = new StackNode(data);
        pushNode.next = root;
        root= pushNode;
        System.out.println("Data pushed"+root.data);

    } 
  
    public int pop() 
    { 	
	    //If Stack Empty Return 0 and print "Stack Underflow" else remove the node in front of the list.
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        } else {
            StackNode remove = root;
            root = root.next;
            remove.next = null;
            return remove.data;

        }
    } 
  
    public int peek() 
    { 

        //return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return root.data;
        }

    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 
  
        sll.push(100); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 

}
/* Output
 Data pushed100
Data pushed20
Data pushed30
30 popped from stack
Top element is 20
 */
