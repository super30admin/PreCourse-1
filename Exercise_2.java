// Time Complexity :O(1)
// Space Complexity :O(1)
// Problem faced: had to rename StackAsLinkedList to Exercise_2 
// because file name and class name should be same
public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data =data;
            next=null;
        } 
    } 
    
	//isEmpty is to check if stack is empty or not
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        //If stack has no elements => root = null, return true
        if(root==null){
            return true;
        }
        //else if root is not null, return false
        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
          //Create a new node with data
          StackNode node = new StackNode(data);
          //Check if the stack is empty
          //If empty push => assign node to root
          if(isEmpty()){
              root=node;
          }
          //if not empty move the pointer and assign root to node.next  
          node.next=root;
          //assign node to root
          root=node; 
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    if(isEmpty()){
        System.out.println("Stack Underflow");
        return 0;
    }

        //Write code to pop the topmost element of stack.
        //Assign first element to data that is assign root node's value to data
        int data = root.data;
        //Remove the poped element by pointing root next element
        root=root.next;
	//Also return the popped element 
    return data;

    } 
  
    public int peek() 
    { 
       //Write code to just return the topmost element without removing it.
       if(isEmpty()){
        System.out.println("Stack Underflow");
        return 0;
    }
    //Return first element that is root node's value
    return root.data;
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
