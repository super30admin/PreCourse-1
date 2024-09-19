// Time Complexity:
// isEmpty: O(1)
// push: O(1)
// pop: O(1)
// peek: O(1)

// Space Complexity:
// Given the number of the elements in the stack is n. The space complexity of the Stack is O(n).

public class Exercise_2 { 
  
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
        return root == null; // if root is null; the stack will be empty

    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        // This is equivalent to adding an element in front of the linked list
        StackNode elementNode = new StackNode(data);
        elementNode.next = root;
        root = elementNode;
        System.out.println(data + "is pushed into the Stack");
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(isEmpty()) {
        System.out.println("Stack Underflow");
        return 0;
    }
    else{
        int poppedElement = root.data; // extract the data from the top most element in the stack i.e; root
        root = root.next;
        root.next = null;
        return poppedElement;
    }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack UnderFlow");
            return 0;
        }
        else{
            return root.data; // return the data in the top most node
        }
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
