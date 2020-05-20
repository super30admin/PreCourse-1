class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root == null){    //If root not is pointing to any data, list is null.
            return true;
        }
        else{
            return false;
        }
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode n = new StackNode(data);
        if(isEmpty()){
            root = n;
        }
        else{
            StackNode temp = root;    //to keep track of next nodes
            while(temp.next != null){  //Traversing till end of the list
                temp = temp.next;
            }
            temp.next = n;
        }
    } 
  
    public int pop() 
    { 	
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            StackNode temp = root;   //to keep track of next nodes
            StackNode prev =temp;    //to assign next value as null for last second node after popping the last node.
            while(temp.next != null){
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            return temp.data;
        }

    } 
  
    public int peek() 
    { 
        if(root == null){
            return 0;
        }
        StackNode temp = root;
        while(temp.next != null){ //traverse till end and return the last node data
            temp = temp.next;
        }
        return temp.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
     
        StackAsLinkedList sll = new StackAsLinkedList(); 

        System.out.println("Top element is " + sll.peek()); 

  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
        
    } 
} 

// Time Complexity : O(size of linked list) for all operations except to check empty.
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : Assumed that if stack is empty will return 0. Forgot to use "this" keyword at StackNode constructor and then realized when insert is not working.