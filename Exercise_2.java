// Time Complexity : Push,Pop,Peek : O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Not Tried
// Any problem you faced while coding this : No

/**** Steps  ****/ 
//1) Push :
//   a) Create a new node;
//   b) Checked if root is null, If it is null then assign new node to the root.
//   c) If root is not null, then on the new node.next assign the root node and then assign new node to root which means now root will pe pointing towards newly created node

//2) isEmpty :
//   a) Check whether root is null or not. If it is null return true otherwise return false;
 
//3) Pop :
//   a) Check stack is empty or not. If it is empty print "Stack underflow" and return 0. If it is not empty return root.data and assign root to root.next which is the previous node;

//4) Peek
//   a) If stack is not empty, then return root.data else return -1;

//Summary : Basically I'm storing address of previously inserted node in the newly inserted node
//Benefits : No need to do array size fixation
/**** ****/


class StackAsLinkedList { 
  
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
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
        if(root==null){
            return true;
        } 

        return false;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
        StackNode sN = new StackNode(data);
        if(isEmpty()){
            root = sN;
        } else{
            sN.next = root;
            root    = sN; 
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
    //Also return the popped element 
    
     int poppedElem = 0;
     
     if(isEmpty()){
         System.out.println("Stack Underflow");
     }else{
          poppedElem = root.data;
          root = root.next;
     }

       return poppedElem;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
             
        if(!isEmpty()){
            return root.data; 
        }

       return -1;
    } 
  
} 

class Exercise2Main{

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
