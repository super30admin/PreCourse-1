// Time Complexity : Peek --> O(1) , Push --> O(1) , Pop --> O(1) isEmpty --> O(1)
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Not really 


// Your code here along with comments explaining your approach


public class Exercise_2 { 
  
    static StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            data=data;
            next=null;
            root=null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root==null)
            return true;
        else    
            return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack
                StackNode tem_data = root;
                root = new StackNode(data);
                root.data = data;
                root.next = tem_data;
                System.out.println(" Added "+data+" in stack");
        
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if (root == null) {
        System.out.println("Stack Underflow ");
        }
        int value = root.data;
        root = root.next;
        return value;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return root.data;
    } 


    public void printStack(){

        StackNode traverse=root;
            while(traverse.next!=null){
                
                System.out.print(" "+traverse.data);
                traverse=traverse.next;

            }
            System.out.print(" "+traverse.data);
    }

  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 

       
        System.out.println(" Stack elements");
        sll.printStack();
        System.out.println();
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 