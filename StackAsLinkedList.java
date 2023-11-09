//SpaceComplexity = O(1)
public class StackAsLinkedList {
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data;
        } 
    } 
    
	
    //Time complexity: O(1)
    public boolean isEmpty()
    { 
        //Write your code here for the condition if stack is empty.
        return this.root == null;
    }

    //Time complexity: O(1)
    public void push(int data)
    { 
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);

        if(isEmpty()) {
            this.root = node;
        }
        else {
            node.next = root;
            root = node;
        }
    }

    //Time complexity: O(1)
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        // Also return the popped element
        StackNode node = root;
        root = root.next;
        return node.data;
    }

    //Time complexity: O(1)
    public int peek()
    { 
        //Write code to just return the topmost element without removing it.
        if(!isEmpty()){
            return root.data;
        }

        return -1;
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
