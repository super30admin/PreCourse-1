/*
Time Complexity: isEmpty() -> O(1)  
                 push() -> O(n) // iterate till the last node
                 pop() -> O(n) // iterate till the last node
                 peek() -> O(n) // iterate till the last node
Space Complexity: O(1) // No extra space needed to push, pop or peek new node or print list 
*/

public class StackAsLinkedList { 
  
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
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newStackNode = new StackNode(data);
        if(root == null) {
            root = newStackNode;
            return;
        }
        newStackNode.next = null;
        StackNode lastNode = root;
        while (lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newStackNode;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if(root == null){
        System.out.println("Stack Underflow");
        return 0;
    }
    int topData = -1;
    if(root.next == null){
        topData = root.data;
        root = null;
        return topData;
    }
    //Write code to pop the topmost element of stack.
    StackNode prev = root;
    while(prev.next.next != null){
        prev = prev.next;
    }
    topData = prev.next.data;
    prev.next = null;
            
	//Also return the popped element 
    return topData;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null){
            System.out.println("Stack Underflow");
            return -1;
        }
        StackNode curr = root;
        while(curr.next != null){
            curr = curr.next;
        }       
        return curr.data;
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
