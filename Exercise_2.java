// Time Complexity : 
    //push - O(1)
    //pop - O(1)
    //peek - O(1)
    //isEmpty - O(1)

// Space Complexity :
    //push - O(1)
    //pop - O(1)
    //peek - O(1)
    //isEmpty - O(1)

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
    
	
    public boolean isEmpty() 
    { 
        //Return true if the stack is empty else false. 
        if(root == null){
            return true;
        }

        return false;
    } 
  
    public void push(int data) 
    { 
        //Create a new node 'newNode' and assign it to the root. 
        // If the root is null, make the newNode as root, else push the newNode to the top of the stack.
        StackNode newNode = new StackNode(data);
        if(root == null){
            root = newNode;
        }else{  
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
    } 
  
    public int pop() 
    { 	
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element 
        if(root == null){
            System.out.println("Stack Underflow");
            return 0;
        }

        // Get the top most element, remove it from the stack and return it.
        int poppedElement = root.data;
        root = root.next;
        return poppedElement;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(root == null){
            //Print "Stack is Empty" if root is null.
            System.out.println("Stack is Empty");
            return 0;
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
        
        System.out.println("Top element is " + sll.peek()); 
        System.out.println(sll.pop() + " popped from stack"); 
      } 
} 
