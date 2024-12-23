// Time Complexity :O(1)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : I was not sure how to implement it and do I need to maintain another pointer as I was cons
// considering that there should be 2 pointers one head and top. After, I watched a video and then it became clear to me and I implemented it

class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data)  //initialized data with value and next with null
        { 
            this.data=data;
            this.next=null;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty()  //return true if stack is empty i.e no node present
    { 
        return root==null;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data)   //to push we will first need to create a node assigning it a data and as it will be at a top in stack we will make it as a root
    { 
        StackNode node = new StackNode(data);

        
        node.next=root;
        root=node;
        
        //Write code to push data to the stack. 
    } 
  
    public int pop()          //Function to pop a element 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if(root==null){          //if root is null then there are no elements present
        System.out.println("Stack Underflow");
        return 0;
    }
    else{                   //Pop the root as it will be the top most element and return it's value i.e data
        int temp=root.data;
        root=root.next;
        return temp;
    }
    } 
  
    public int peek()       // this will check if stack is empty or not if not empty then it will just return the value of the root
    { 
        if(root==null){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            return root.data;
        }
        //Write code to just return the topmost element without removing it.
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
