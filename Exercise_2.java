public class Exercise_2 { 
  
    // Time Complexity : for Pop operation O(Stack Sise)
        //  as the programm was traversing till the last-but-one node 
    // Space Complexity : O(1) costant sapce to fot eh root & top nodes the number of elements in the stack
    // Did this code successfully run on Leetcode : 
    // Any problem you faced while coding this :  
            /*  the time complexity is O(n) but it
             can be reduced to O(1) if i tried to insert and add elements at the root of the stack 
             hence no need to make expensive traversal */

    StackNode root; 
    StackNode top;
  
    static class StackNode { 
        int data; 
        StackNode next; 
        StackNode(){}
        StackNode(int data) 
        { 
            this.data = data;
        } 
    } 
    
    Exercise_2(){
        this.root = null;
        this.top = root;
    }
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if(root == null) return true;
        else return false; 
    } 
  
    public void push(int data) 
    { 
        StackNode newNode = new StackNode(data);
        if(isEmpty()){ // stack empty check 
            root = newNode;
            top = root;
        }else{          
            top.next = newNode; //assigning newNode and update top to the newNode
            top = newNode; 
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }else {
            StackNode dummy = new StackNode();
            dummy.next = root;
            while(dummy.next != top ){
                dummy = dummy.next;
            }
            top = dummy;
            dummy = dummy.next;
            top.next = null;
            return dummy.data;
        }
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            return 0;
        }else return top.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 

        sll.push(10); 
        sll.push(20); 
        sll.push(30); 

        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
