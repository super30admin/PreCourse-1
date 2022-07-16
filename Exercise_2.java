// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Faced issues while compiling since the class name didn't mactch with filename
//                                           got error: "Exercise_3.java:5: error: class StackAsLinkedList is public, should be declared in a file named StackAsLinkedList.java"

public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data=data;
            this.next=null; 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root==null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode= new StackNode(data);
        if (newNode == null)
        {
            System.out.println("Heap Overflow");
            return;
        }
        newNode.data=data;
        newNode.next=root;
        root=newNode;    
    } 
  
    public int pop() 
    { 	
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        int top = peek();
 
        System.out.println("Removing " + top);
        this.root = (this.root).next;
 
        return top;
    } 
  
    public int peek() 
    { 
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(-1);
        }
        return root.data;
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
