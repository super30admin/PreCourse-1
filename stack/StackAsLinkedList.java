// Time Complexity : O(1)  as we are just inserting elements at the and we don't have to traverse through, we are doing it in constant time;
// Space Complexity : O(n) we are only storing the elements that are being inserted in the stack
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : I had to figure out pop the element and not lose access to top in the process.


// Your code here along with comments explaining your approach
    


public class StackAsLinkedList { 
  
    StackNode root; 
    StackNode top = root; 
    int length; 
  
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
        //Write your code here for the condition if stack is empty. u
        if(top == root){
            return true; 
        }else{
            return false; 
        }
    } 
  
    public void push(int data) 
    { 
        StackNode Node = new StackNode(data);
         //Write code to push data to the stack. 
        if(root == null){
            root= Node; 
            top = root; 
            length ++; 
        }
        else{
            top.next = Node; 
            top = top.next;
            length++;
        }
       
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if(isEmpty()){

        System.out.println("Stack Underflow");

        return 0;
    }
        //Write code to pop the topmost element of stack.
        else{
            StackNode current = root; 
            while(current.next != top){
                current = current.next;
            }
            int popTemp = current.next.data;  /// I am using another temp variable to store the value of the top element so that I don't lose access to the variable. 
            length --;
            top = current; 
            return popTemp; 
        }
	//Also return the popped element 
    
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return top.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
        System.out.println(sll.length);
        
  
        System.out.println(sll.pop() + " popped from stack"); 

        System.out.println(sll.length);
        
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
