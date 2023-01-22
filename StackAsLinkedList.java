// Time Complexity : push - O(n), pop - O(n), peek - O(n)
// Space Complexity : O(1)
public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        {
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //If root points to no element, then the stack is empty
        if (root == null){
            return true;
        }else{
            return false;
        }
        
    } 
  
    public void push(int data) 
    { 
        //if the stack is empty, then the new element becomes the root
        if(root==null){
            StackNode node = new StackNode(data);
            node.next = null;
            root = node;
        }else{
            //else we traverse till the end of the stack, until the next element is null and push the new element to the end of the stack
            StackNode temp = root;
            while(temp.next!=null){
                temp = temp.next;
            }
            StackNode node = new StackNode(data);
            temp.next = node;
            node.next = null;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if(root==null){
            //If the root elememt is null, then stack is empty hence can't pop
            System.out.println("Stack Underflow! Can't pop item");
            return 0;
        }else{
            //else from the root element we travel to the next element, until the next of next element is null. If so, then we make the next element point to null thereby popping the element
            StackNode temp = root;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            int popped = temp.next.data;
            temp.next = null;
            return popped;
        }
    } 
  
    public int peek() 
    { 
        //We traverse till the end of the stack until the next element is null and return the value of that element.
        StackNode temp = root;
        while(temp.next!=null){
            temp = temp.next;
        }
        return temp.data;
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
